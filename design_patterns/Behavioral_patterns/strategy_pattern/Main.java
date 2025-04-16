import java.util.ArrayList;
import java.util.Arrays;

import strategy.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("main method");
       
      
        SortContext context=new SortContext();

        ArrayList<Integer> myList=new ArrayList<>(Arrays.asList(2,54,65,35,646,2325,5364));

        context.setStrategy(new InerstionSort());
        context.executestrategy();
        context.executestrategy(myList);  

        System.out.println("insertion sort : " + myList);


        context.setStrategy(new LinearSort());
        context.executestrategy(myList);
        System.out.println("Linear sort :" +myList);


    }
}