package Commands;

import Aggregations.Aggregator;

public class GetTab implements CommandInterface {
    private Aggregator aggregator;

    public GetTab(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public Object execute() {
        return aggregator.getOrders();
    }
}
