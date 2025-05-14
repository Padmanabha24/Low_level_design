package Concrete_products;

import Baseproduct.BasePizza;

public class PaneerPizza implements BasePizza {
    public int price(){
        System.out.println("margarita price");
        return 100;
    }
}
