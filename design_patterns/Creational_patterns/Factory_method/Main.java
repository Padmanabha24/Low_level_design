import Baseproduct.BasePizza;
import factory_method.Factory_pizza_class;

public class Main {


    public static void main(String[] args) {
        Factory_pizza_class NewPizza=new Factory_pizza_class();
        BasePizza margarita=NewPizza.AddPizza("margarita");
        System.out.println(margarita.price());

    }

}
