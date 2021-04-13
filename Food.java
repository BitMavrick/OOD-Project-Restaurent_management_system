package RestaurantManagementSystem;

public class Food {

    String name;
    int id;
    private int cost_per_unit;
    private int total_unit = 0;

    private int demand = 0;

    Food(String name, int id, int cost) {
        this.name = name;
        this.id = id;
        this.cost_per_unit = cost;
    }

    public void AddUnit(int unit) {
        total_unit += unit;
        demand -= unit;
    }

    public void setUnit(int unit) {
        total_unit = unit;
    }

    public void DisplayInfo() {
        System.out.println("\nFood Name : " + name);
        System.out.println("Food ID : " + id);
        System.out.println("Cost Per Unit : " + cost_per_unit);
        System.out.println("Availabe Unit : " + total_unit);
    }

    public int getDemand() {
        return demand;
    }

    public int Cost(int unit) {

        if (total_unit < unit) {
            demand += (unit - total_unit);
            return -1;
        } else {
            int cost = unit * cost_per_unit;
            return cost;
        }
    }

}