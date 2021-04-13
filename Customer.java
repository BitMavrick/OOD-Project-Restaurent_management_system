package RestaurantManagementSystem;

abstract class Customer implements info {
    String name;
    private String phone;
    private String mail;
    protected String address;

    Customer(String name, String phone, String mail, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
    }

    public void DisplayInfo() {
        System.out.println("\nName : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Mail : " + mail);
        System.out.println("Address : " + address);
    }

    private boolean account_validity = true;

    public boolean AccountValidity() {
        return account_validity;
    }

    void DeleteAccount() {
        account_validity = false;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String getMAil() {
        return mail;
    }

    // Abstract Method
    public abstract void Purchaese(Food the_food, int unit);

    public abstract void DisplayFoodInfo(Food the_food);

    public abstract void DisplayHotelInfo(Hotel the_hotel);

    public abstract void BookHotel(Hotel the_hotel, int total_apartment);

}

class NewCustomer extends Customer {

    private int total_purchase = 0;
    private int total_money = 0;

    NewCustomer(String name, String phone, String mail, String address) {
        super(name, phone, mail, address);
    }

    @Override
    public void DisplayInfo() {

        if (AccountValidity() == true) {
            super.DisplayInfo();
            System.out.println("Account Type : Normal");
            System.out.println("Total purchaesed unit : " + total_purchase);
            System.out.println("Total money : " + total_money + " Taka");
        } else {
            System.out.println("\nSorry, Account not found!");
        }

    }

    @Override
    public void Purchaese(Food the_food, int unit) {
        if (AccountValidity() == true) {
            int cost = the_food.Cost(unit);

            if (cost == -1) {
                System.out.println("\nSorry, We don't have enough item at this moment!");
            } else {
                total_purchase += unit;
                total_money += cost;

                System.out.println("\nYour Purchase Successfull!");

                Offers offer = new Offers();
                int vauchar = offer.Voucher(total_purchase, total_money);

                int payable_cost = cost - ((cost / 100) * vauchar);

                System.out.println("Total Cost is : " + payable_cost + " Taka.");
            }

        } else {
            System.out.println("\nSorry, Account not found!");
        }
    }

    @Override
    public void DisplayFoodInfo(Food the_food) {
        if (AccountValidity() == true) {
            the_food.DisplayInfo();
        } else {
            System.out.println("\nSorry, Account not found!");
        }
    }

    @Override
    public void DisplayHotelInfo(Hotel the_hotel) {
        if (AccountValidity() == true) {
            the_hotel.DisplayInfo();
        } else {
            System.out.println("\nSorry, Account not found!");
        }
    }

    @Override
    public void BookHotel(Hotel the_hotel, int total_apartment) {
        if (AccountValidity() == true) {
            the_hotel.BookHotel(total_apartment);
        } else {
            System.out.println("\nSorry, Account not found!");
        }

    }

}

class PremiumCustomer extends Customer {

    private int total_purchase = 0;
    private int total_money = 0;

    PremiumCustomer(String name, String phone, String mail, String address) {
        super(name, phone, mail, address);
    }

    @Override
    public void DisplayInfo() {
        if (AccountValidity() == true) {
            super.DisplayInfo();
            System.out.println("Account Type : Premium");
            System.out.println("Total purchaesed unit : " + total_purchase);
            System.out.println("Total money : " + total_money + " Taka");
        } else {
            System.out.println("Sorry, Account not found!");
        }

    }

    @Override
    public void Purchaese(Food the_food, int unit) {
        if (AccountValidity() == true) {

            total_purchase += unit;

            if (total_purchase <= 10) {

                int cost = the_food.Cost(unit);

                if (cost == -1) {
                    System.out.println("\nSorry, We don't have enough item at this moment!");
                    total_purchase -= unit;
                } else {
                    total_purchase += unit;
                    total_money += cost;

                    System.out.println("\nYour Purchase Successfull!");

                    Offers offer = new Offers();
                    int vauchar = offer.Voucher();

                    int payable_cost = cost - ((cost / 100) * vauchar);

                    System.out.println("Total Cost is : " + payable_cost + " Taka.");
                }

            } else {

                int cost = the_food.Cost(unit);

                if (cost == -1) {
                    System.out.println("\nSorry, We don't have enough item at this moment!");
                    total_purchase -= unit;
                } else {
                    total_purchase += unit;
                    total_money += cost;

                    System.out.println("\nYour Purchase Successfull!");

                    Offers offer = new Offers();
                    int vauchar = offer.Voucher(total_purchase);

                    int payable_cost = cost - ((cost / 100) * vauchar);

                    System.out.println("Total Cost is : " + payable_cost + " Taka.");
                }

            }

        } else {
            System.out.println("\nSorry, Account not found!");
        }

    }

    @Override
    public void DisplayFoodInfo(Food the_food) {
        if (AccountValidity() == true) {
            the_food.DisplayInfo();
        } else {
            System.out.println("\nSorry, Account not found!");
        }

    }

    @Override
    public void DisplayHotelInfo(Hotel the_hotel) {
        if (AccountValidity() == true) {
            the_hotel.DisplayInfo();
        } else {
            System.out.println("\nSorry, Account not found!");
        }
    }

    @Override
    public void BookHotel(Hotel the_hotel, int total_apartment) {
        if (AccountValidity() == true) {
            the_hotel.BookHotel(total_apartment);
        } else {
            System.out.println("\nSorry, Account not found!");
        }
    }

}
