package RestaurantManagementSystem;

abstract class FoodCooker {

    private int id;
    private boolean account_validity = true;

    FoodCooker(int id) {
        this.id = id;
    }

    boolean AccountValidity() {
        return account_validity;
    }

    void DeleteAccount() {
        account_validity = false;
    }

    public void displayInfo() {
        System.out.println("\nID : " + id);
    }

    public abstract void CheckFoodDemand(Food the_food);

}

class JuniorCooker extends FoodCooker {
    protected int salary = 30000;

    JuniorCooker(int id) {
        super(id);
    }

    public void DisplayInfo() {
        if (AccountValidity() == true) {
            super.displayInfo();
            System.out.println("Salary : " + salary);
        } else {
            System.out.println("\nAccount not found!");
        }
    }

    @Override
    public void CheckFoodDemand(Food the_food) {
        the_food.getDemand();
    }

}

class SeniorCooker extends FoodCooker {

    protected int salary = 35000;

    SeniorCooker(int id) {
        super(id);
    }

    public void DisplayInfo() {
        if (AccountValidity() == true) {
            super.displayInfo();
            System.out.println("Salary : " + salary);
        } else {
            System.out.println("\nAccount not found!");
        }
    }

    @Override
    public void CheckFoodDemand(Food the_food) {
        the_food.getDemand();
    }

    public void AddFoodUnit(Food the_food, int the_unit) {
        the_food.AddUnit(the_unit);
    }

}
