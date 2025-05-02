// import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import Decorator.ExtraCheese;
import Decorator.Mashroom;
import object.BasePizza;
import object.Margareta;

public class Main {
    public static void main(String[] args) {

            //for margareta pizza
            BasePizza pizza= new ExtraCheese(new Margareta());

          

            int total_price=pizza.cost();
            System.out.println(total_price);

        }
    }
