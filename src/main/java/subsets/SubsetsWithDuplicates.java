package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class SubsetsWithDuplicates {
    public List<List<Integer>> findSubsets(int[] nums){
        LinkedHashSet<List<Integer>> subsetsDuplicates = new LinkedHashSet<>();
        for(int i=0;i<(1<<nums.length);i++){
            ArrayList<Integer> subsets = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    subsets.add(nums[j]);
                }
            }
            subsetsDuplicates.add(subsets);
        }
        return new ArrayList<>(subsetsDuplicates);
    }

    public List<List<Integer>> findSubSetsBFS(int nums[]){
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        Arrays.sort(nums);
        int startIndex = 0, endIndex=0;
        for(int i=0;i<nums.length;i++){
            startIndex=0;
            if(i>0 && nums[i]==nums[i-1]){
                startIndex=endIndex+1;
            }
            endIndex=subsets.size()-1;
            for(int j=startIndex;j<=endIndex;j++){
                ArrayList<Integer> list = new ArrayList<>(subsets.get(j));
                list.add(nums[i]);
                subsets.add(list);
            }
        }
        return subsets;
    }
    public boolean idOdd(int n){
        return n%3==0;
    }
    public static void main(String[] args) {

    }
}
