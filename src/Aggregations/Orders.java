package Aggregations;

import Iterators.AllOrdersIterator;
import Iterators.MenuIterator;

public class Orders {
    public static MenuItems[] items;

    public Orders(){
        items  = new MenuItems[100];
    }

    public void addItem(MenuItems i){
        int x = 0;
        while(x < 99){
            if(items[x] != null) x++;
            else break;
        }
        items[x] = i;
    }

    public double getTotal(){
        int x = 0;
        double temp = 0;
        while(items[x] != null){
            temp += items[x].getPrice();
            x++;
        }
        return temp;
    }

    public MenuIterator getOrdersIterator(){
        return new AllOrdersIterator();
    }
}