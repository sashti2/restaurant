import Aggregations.Aggregator;
import Aggregations.Menu;
import Aggregations.MenuItems;
import Aggregations.Orders;
import Commands.Invoker;
import Iterators.MenuIterator;

public class SystemInterface {
    private static Invoker invoker = new Invoker(new Aggregator());

    public static String[] getMenu() {
        Menu menu = invoker.getMenu();
        MenuIterator itr = menu.getMenuIterator();

        String[] str = new String[100];
        int x = 0;
        do {
            if (x != 0) itr.next();
            MenuItems i = itr.getItem();
            str[x] = String.format("%2d - %-31s $%.2f", i.getNumber(), i.getName(), i.getPrice());
            x++;
        } while (itr.hasNext());
        return str;
    }

    public static String[] submitOrder(int[] orders) {
        invoker.submitOrders(orders);
        String[] str = new String[10];
        str[0] = "Order Successfully submitted!";
        return str;
    }

    public static String[] getOrder() {
        Orders order = invoker.getOrders();
        MenuIterator itr = order.getOrdersIterator();

        String[] str = new String[100];
        int x = 0;
        do {
            if (x != 0) itr.next();
            MenuItems i = itr.getItem();
            str[x] = String.format("%2d - %-31s $%.2f", x + 1, i.getName(), i.getPrice());
            x++;
        } while (itr.hasNext());
        return str;
    }

    public static  double getTotal(){
        return invoker.getTotal();
    }
}
