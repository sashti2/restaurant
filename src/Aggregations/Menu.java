package Aggregations;

import Iterators.AllItemsIterator;
import Iterators.MealIterator;
import Iterators.MenuIterator;

public class Menu {
    public static MenuItems[] items = new MenuItems[100];

    public Menu(){
        items[0] = new MenuItems(1,"Eggs", 2.99, 1);
        items[1] = new MenuItems(2,"Bacon", 1.99, 1);
        items[2] = new MenuItems(3,"Hash Browns", 2.99, 1);
        items[3] = new MenuItems(4,"Bagel with Cream Cheese", 2.99,1);
        items[4] = new MenuItems(5,"Parmesan Grilled Chicken", 8.99, 3);
        items[5] = new MenuItems(6,"Fish and Chips", 11.99, 2);
        items[6] = new MenuItems(7,"Chicken Salad Sandwich", 6.99, 2);
        items[7] = new MenuItems(8,"Chicken Pot Pie", 7.99, 3);
        items[8] = new MenuItems(9,"Sausage Gravy & Biscuits", 4.99, 1);
        items[9] = new MenuItems(10,"Grilled Salmon Fillet", 13.29, 3);
        items[10] = new MenuItems(11,"BLT Sandwich", 6.52, 2);
        items[11] = new MenuItems(12,"Grilled Fish Filet", 8.99, 2);
        items[12] = new MenuItems(13,"Cheese Burger with Fries", 8.99, 2);
        items[13] = new MenuItems(14,"Waffle", 1.99, 1);
        items[14] = new MenuItems(15,"Chicken Mashed Potatoes", 8.99, 3);
        items[15] = new MenuItems(16,"Veggie Omelet", 3.99, 1);
        items[16] = new MenuItems(17,"Country Fried Steak Dinner", 10.99, 3);
        items[17] = new MenuItems(18,"Chicken Caesar Salad", 6.99, 2);
        items[18] = new MenuItems(19,"French Toast", 3.99, 1);
        items[19] = new MenuItems(20,"Sirloin Steak Dinner", 15.99, 3);
    }

    public MenuIterator getMenuIterator(){
        return new AllItemsIterator();
    }

    public MenuIterator getMealIterator(int m){
        return new MealIterator(m);
    }
}
