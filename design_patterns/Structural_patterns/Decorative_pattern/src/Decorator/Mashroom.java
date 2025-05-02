package Decorator;

import object.BasePizza;

public class Mashroom extends ToppingsDecorator{
    BasePizza basePizza;

    Mashroom(BasePizza pizza){
        this.basePizza=pizza;

    }

    public int cost(){

        System.out.println("mashroom topings");
        return this.basePizza.cost()+15;
    }


    
}