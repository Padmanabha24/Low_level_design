package strategy;

import java.util.ArrayList;

public class SortContext {
    private Sorting strategy;

 

    public void setStrategy(Sorting strategy){
            this.strategy=strategy;
    }

    public Sorting getStrategy(){
        return strategy;
    }

    public void executestrategy(){
        strategy.printSort();
    }

    public void executestrategy(ArrayList<Integer> data) {
        if (strategy != null) {
            strategy.sort(data);
        } else {
            System.out.println("Strategy not set.");
        }
    }

    
    
}
