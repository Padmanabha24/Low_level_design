package strategy;
import java.util.*;

public class InerstionSort implements Sorting{
  
   
    public ArrayList<Integer> sort(ArrayList<Integer> arr){
        //sorting logic
            for(int i=0;i<=arr.size()-1;i++){
                for(int j=i; j>0 && arr.get(j-1)>arr.get(j);j--){
                        int temp=arr.get(j-1);
                        arr.set(j-1,arr.get(j));
                        arr.set(j,temp);
                }
            }      
 
        return arr;
    }
    public void printSort(){
        System.out.println("this class implements the insertion sort");
    }

}
