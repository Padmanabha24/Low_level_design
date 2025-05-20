//creator class

package factory_method;
import Baseproduct.BasePizza;
import Concrete_products.MargaritaPizza;

public class Factory_pizza_class {
    public BasePizza AddPizza(String type){
        if(type=="margarita"){
            return new MargaritaPizza();
        }
        else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
