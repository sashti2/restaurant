package Aggregations;

public class MenuItems {
    private int number;
    private String name;
    private double price;
    private int meal;

    public MenuItems(int number, String name, double price, int meal){
        this.number = number;
        this.name = name;
        this.price = price;
        this.meal = meal;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getMealType(){
        return meal;
    }
}
