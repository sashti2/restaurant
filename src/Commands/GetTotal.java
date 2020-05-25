package Commands;

import Aggregations.Aggregator;

public class GetTotal implements CommandInterface {
    private Aggregator aggregator;

    public GetTotal(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    public Object execute() {
        return aggregator.getTotal();
    }
}