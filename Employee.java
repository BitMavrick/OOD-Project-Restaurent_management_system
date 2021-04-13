package RestaurantManagementSystem;

public class Employee implements info {
    String name;
    private int id;
    private String mail;

    Employee(String name, int id, String mail) {
        this.name = name;
        this.id = id;
        this.mail = mail;
    }

    public void DisplayInfo() {
        System.out.println("\nName : " + name);
        System.out.println("ID : " + id);
        System.out.println("Mail : " + mail);
    }

    private boolean account_validity = true;

    boolean AccountValidity() {
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
}

class Manager extends Employee {

    protected int salary = 80000;

    Manager(String name, int id, String mail) {
        super(name, id, mail);
    }

    @Override
    public void DisplayInfo() {
        if (AccountValidity() == true) {
            super.DisplayInfo();
            System.out.println("Salary : " + salary + " Taka");
        } else {
            System.out.println("\nSorry, Your account no longer aivailabe!");
        }
    }

    public void ViewDemand(Food the_food) {
        if (AccountValidity() == true) {
            System.out.println("\nThe Demand of " + the_food.name + " is : " + the_food.getDemand() + " Unit");
        } else {
            System.out.println("\nSorry, Your account no longer aivailabe!");
        }
    }

    public void AddFoodUnit(Food the_food, int the_unit) {
        if (AccountValidity() == true) {
            the_food.AddUnit(the_unit);
            System.out.println("\nUnit added Successfull!");
        } else {
            System.out.println("\nSorry, Your account no longer aivailabe!");
        }
    }

    public void UpdateFoodUnit(Food the_food, int the_unit) {
        if (AccountValidity() == true) {
            the_food.setUnit(the_unit);
            System.out.println("\nUnit update Successfull!");
        } else {
            System.out.println("\nSorry, Your account no longer aivailabe!");
        }
    }

}

class Stuff extends Employee {

    protected int salary = 60000;

    Stuff(String name, int id, String mail) {
        super(name, id, mail);
    }

    @Override
    public void DisplayInfo() {
        if (AccountValidity() == true) {
            super.DisplayInfo();
            System.out.println("Salary : " + salary + " Taka.");
        } else {
            System.out.println("\nSorry, Your account no longer aivailabe!");
        }
    }

    public void AddFoodUnit(Food the_food, int the_unit) {
        if (AccountValidity() == true) {
            the_food.AddUnit(the_unit);
            System.out.println("\nUnit added Successfull!");
        } else {
            System.out.println("\nSorry, Your account no longer aivailabe!");
        }
    }

}
