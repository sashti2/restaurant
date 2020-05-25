package Iterators;

import Aggregations.Menu;
import Aggregations.MenuItems;

public class MealIterator implements MenuIterator {
    private int type;
    private int current = 0;

    public MealIterator(int t) {
        this.type = t;
    }

    public boolean hasNext() {
        return (!(current>= Menu.items.length || Menu.items[current] == null) && checker());
    }
    public boolean checker() {
        if(Menu.items[current].getMealType() == type){
            return true;
        }
        else{
            current++;
            return hasNext();
        }
    }

    public MenuItems getItem() {
        return (Menu.items)[current++];
    }

    public void next() {}
}
