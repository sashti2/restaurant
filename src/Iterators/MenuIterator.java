package Iterators;

import Aggregations.MenuItems;

public interface MenuIterator {
    boolean hasNext();
    MenuItems getItem();
    void next();
}
