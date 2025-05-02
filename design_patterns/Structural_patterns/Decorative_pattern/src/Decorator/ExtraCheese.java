package Decorator;

import object.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
BasePizza basePizza;

//constructor
public ExtraCheese(BasePizza pizza){
    this.basePizza=pizza;

}

@Override 
public int cost(){
    
    System.out.println("with extra chease");
    return this.basePizza.cost()+10;
}
    
}
