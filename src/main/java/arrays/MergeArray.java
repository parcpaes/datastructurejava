package arrays;

import java.util.Arrays;
import java.util.List;

public class MergeArray {
    public int[] mergeArray(int arr1[], int[] arr2) {
        int mergedArr[] = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        Arrays.sort(mergedArr);
        return mergedArr;
    }
}
