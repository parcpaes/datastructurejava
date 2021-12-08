package arrays;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class FirstNonRepeatingInteger {
    public int findFirstUnique(int[] arr){
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.merge(arr[i],1,Integer::sum);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1) return arr[i];
        }
        return -1;
    }
}
