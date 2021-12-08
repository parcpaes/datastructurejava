package arrays;

import java.util.HashSet;

public class AddUpToN {
    public int[] findSum(int arr[],int n){
        HashSet<Integer> set = new HashSet<>();
        for(int value: arr){
            if(set.contains(n-value))
                return new int[]{value,n-value};
            set.add(value);
        }
        return new int[]{};
    }
}
