package Commands;

import Aggregations.Aggregator;

public class GetMenu implements CommandInterface {
    private Aggregator aggregator;

    public GetMenu(Aggregator aggregator){
        this.aggregator = aggregator;
    }

    public Object execute(){
        return aggregator.getMenu();
    }
}
