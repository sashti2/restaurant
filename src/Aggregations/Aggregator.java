package Aggregations;

public class Aggregator {
    private Menu menu = new Menu();
    private Orders orders = new Orders();

    public Menu getMenu(){
        return menu;
    }

    public Orders getOrders(){
        return orders;
    }

    public double getTotal(){
        return orders.getTotal();
    }

    public void submitOrder(MenuItems i){
        orders.addItem(i);
    }
}
