package subsets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> findSubsets(int nums[]){
        ArrayList<List<Integer>> subsets = new ArrayList<>();
        for(int i=0;i<(1<<nums.length);i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    list.add(nums[j]);
                }
            }
            subsets.add(list);
        }
        return subsets;
    }

    public static List<List<Integer>> findSubsetsBFS(int nums[]){
        ArrayList<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(int number : nums){
            int n = subsets.size();
            for(int i=0;i< n;i++){
                List<Integer> set = new ArrayList<>(subsets.get(i));
                System.out.println(n+" "+set.toString()+" "+ number);
                set.add(number);
                subsets.add(set);
            }
        }
        return subsets;
    }

    public static void main(String[] args) {
        int nums[] = {1,5,3};
        List<List<Integer>> result = findSubsetsBFS(nums);
        System.out.println(result.toString());
    }
}
