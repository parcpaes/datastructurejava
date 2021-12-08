package arrays;

import java.util.ArrayList;

public class FindMinimumValueInArray {
    public int findMinimum(int arr[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        int min = Integer.MAX_VALUE;
        for(int value:arr){
            min = Math.min(value,min);
        }
        return min;
    }
}
