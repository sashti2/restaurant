package Commands;

import Aggregations.Aggregator;
import Aggregations.Menu;

public class SubmitOrder implements CommandInterface {
    private Aggregator aggregator;
    private int[] order;

    public SubmitOrder(Aggregator aggregator, int[] order) {
        this.aggregator = aggregator;
        this.order = order;
    }

    public Object execute() {
        int x = 0;
        while(order[x] != 0) {
            aggregator.submitOrder(Menu.items[order[x] - 1]);
            x++;
        }
        return true;
    }
}
