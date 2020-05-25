package Commands;

import Aggregations.Aggregator;
import Aggregations.Menu;
import Aggregations.Orders;

public class Invoker {
    private Aggregator aggregator;

    public Invoker(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public double getTotal() {
        return (double)(new GetTotal(aggregator).execute());
    }

    public Menu getMenu() {
        return (Menu)(new GetMenu(aggregator)).execute();
    }

    public void submitOrders(int[] arr) {
        (new SubmitOrder(aggregator, arr)).execute();
    }

    public Orders getOrders() {
        return (Orders)(new GetTab(aggregator)).execute();
    }
}
