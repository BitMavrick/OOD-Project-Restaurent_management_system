package RestaurantManagementSystem;

public class MainDriver {

    public static void main(String[] args) {

        // ------------------------- Food ------------------------------ //
        Food Pizza = new Food("Pizza", 111, 80);
        Food Burger = new Food("Burger", 112, 70);
        Food Soup = new Food("Soup", 113, 60);

        // ----------------------------Hotel -----------------------//
        NormalHotel normal_hotel = new NormalHotel(222, 4, 2);
        PremiumHotel premium_hotel = new PremiumHotel(333, 5, 3);

        // ------------------------- Customer -----------------------------//
        NewCustomer Sajid = new NewCustomer("Khairul Sajid", "017xxxxxxxx", "sajid@gmail.com", "Dhaka");
        PremiumCustomer Ismail = new PremiumCustomer("Ismail Khan", "018xxxxxxxx", "ismail@gmmail.com", "Gazipur");

        // ------------------------- Employee -------------------------------//
        Manager manager = new Manager("Rakib", 444, "rakib@gmail.com");
        Stuff stuff = new Stuff("Dipu", 555, "dipu@gmail.com");

        // ------------------------- Food Cooker ------------------------//
        JuniorCooker junior_cooker = new JuniorCooker(666);
        SeniorCooker senior_cooker = new SeniorCooker(777);

        System.exit(0);
    }
}
