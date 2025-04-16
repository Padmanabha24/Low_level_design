package strategy;
import java.util.*;

public class LinearSort implements Sorting {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));
            arr.set(i, temp);
        }
        return arr;
    }

    @Override
    public void printSort() {
        System.out.println("This class implements linear sort (Selection Sort).");
    }
}
