package RestaurantManagementSystem;

public class Admin implements info {
    private String name;
    private int id;
    private String mail;

    Admin(String name, int id, String mail) {
        this.name = name;
        this.id = id;
        this.mail = mail;
    }

    private boolean account_validity = true;

    boolean AccountValidity() {
        return account_validity;
    }

    void DeleteAccount() {
        account_validity = false;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("\nName : " + name);
        System.out.println("ID : " + id);
        System.out.println("Mail : " + mail);
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

class JuniorAdmin extends Admin {

    private int salary = 80000;

    JuniorAdmin(String name, int id, String mail) {
        super(name, id, mail);
    }

    @Override
    public void DisplayInfo() {
        if (AccountValidity() == true) {
            super.DisplayInfo();
            System.out.println("Salary : " + salary + " Taka");
        } else {
            System.out.println("\nSorry, Account not found!");
        }
    }

    public void CheckInfo(Employee the_employee) {
        the_employee.DisplayInfo();
    }

    // Overload
    public void CheckInfo(FoodCooker the_cooker) {
        the_cooker.displayInfo();
    }

    // Overload
    public void CheckInfo(Customer the_customer) {
        the_customer.DisplayInfo();
    }

    // Overload
    public void CheckInfo(Hotel the_hotel) {
        the_hotel.DisplayInfo();
    }

    // Overload
    public void CheckInfo(Food the_food) {
        the_food.DisplayInfo();
    }

}

class SeniorAdmin extends Admin {

    private int salary = 90000;

    SeniorAdmin(String name, int id, String mail) {
        super(name, id, mail);
    }

    @Override
    public void DisplayInfo() {
        if (AccountValidity() == true) {
            super.DisplayInfo();
            System.out.println("Salary : " + salary + " Taka");
        } else {
            System.out.println("\nSorry, Account not found!");
        }
    }

    public void DeleteEmployeeAccount(Employee the_Employee) {
        the_Employee.DeleteAccount();
        System.out.println("\nSuccessfully delete an employee account!");
    }

    public void DeleteCookerAccount(FoodCooker the_cooker) {
        the_cooker.DeleteAccount();
        System.out.println("\nSuccessfully delete a cooker account!");
    }

    public void DeleteCustomerAccount(Customer the_customer) {
        the_customer.DeleteAccount();
        System.out.println("\nSuccessfully delete a customer account!");
    }

}
