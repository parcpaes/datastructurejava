package arrays;

public class FindSecondMaxValue {
    public int findSecondMaximum(int[] arr){
        int firstMax=arr[0],secondMax = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondMax = firstMax;
                firstMax=arr[i];
            }else if(arr[i]!=firstMax){
                secondMax=Math.max(arr[i],secondMax);
            }
        }
        return secondMax;
    }
}
