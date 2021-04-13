package RestaurantManagementSystem;

import java.util.Random;

public class Offers {
    Random rand = new Random();

    // --------------------------- For Premium User
    int Voucher() {
        int value = rand.nextInt(10) + 1;
        System.out.println("You get " + value + "% OFF this time as a premium user!");
        return value;
    }

    // OverLoading --------------- For general User
    int Voucher(int total_puchase, int total_money) {

        if (total_puchase > 10 && total_money > 500) {
            int value = rand.nextInt(20) + 10;
            System.out.println("You get " + value + "% OFF this time!");
            return value;
        }
        return 0;
    }

    // OverLoading ---------------- For premium User
    int Voucher(int total_puchase) {

        if (total_puchase > 10 && total_puchase <= 20) {
            int value = rand.nextInt(15) + 15;
            System.out.println("You get " + value + "% OFF this time as a premium user!");
            return value;
        } else if (total_puchase > 20) {
            int value = rand.nextInt(30) + 20;
            System.out.println("You get " + value + "% OFF this time as a premium user!");
            return value;
        }
        return 0;
    }

}
