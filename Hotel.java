package RestaurantManagementSystem;

abstract class Hotel {
    private int id;
    private int total_room;
    private int total_bed;

    Hotel(int id, int total_room, int total_bed) {
        this.id = id;
        this.total_room = total_room;
        this.total_bed = total_bed;
    }

    public void DisplayInfo() {
        System.out.println("\nHotel ID : " + id);
        System.out.println("Total Rooms per apartment : " + total_room);
        System.out.println("Total bed per apartment : " + total_bed);
    }

    public abstract void BookHotel(int apartment);
}

class NormalHotel extends Hotel {

    protected int cost = 1500;

    NormalHotel(int id, int total_room, int total_bed) {
        super(id, total_room, total_bed);
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Cost per day : " + cost + " Taka.");
    }

    @Override
    public void BookHotel(int apartment) {
        System.out.println("\nHotel Booked Successfull!");
        System.out.println("Total Apartment : " + apartment);
        System.out.println("Cost : " + (apartment * cost));
    }

}

class PremiumHotel extends Hotel {

    protected int cost = 3000;

    PremiumHotel(int id, int total_room, int total_bed) {
        super(id, total_room, total_bed);
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Cost per day : " + cost + " Taka.");
    }

    @Override
    public void BookHotel(int apartment) {
        System.out.println("\nHotel Booked Successfull!");
        System.out.println("Total Apartment : " + apartment);
        System.out.println("Cost : " + (apartment * cost));
    }

}
