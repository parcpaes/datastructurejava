package bitmanipulation;

public class MissingNumber {
    public static int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int x1=1;
        for(int i=2;i<=n;i++){
            x1=x1^i;
        }
        int x2=arr[0];
        for(int i=1;i<n-1;i++){
            x2 = x2 ^ arr[i];
        }
        System.out.println(Integer.toBinaryString(x1));
        System.out.println(Integer.toBinaryString(x2));
        return x1^x2;
    }
    public static void main(String[] args) {
        int array[] = {1,5,2,6,4};
        System.out.println(findMissingNumber(array));
    }
}
