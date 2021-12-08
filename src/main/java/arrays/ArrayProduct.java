package arrays;

import java.util.Arrays;

public class ArrayProduct {
    public int [] findProduct(int arr[]){
        int n=arr.length;
        int i, temp=1;

        int product[] = new int[n];
        for(i=0;i<n;i++){
            product[i]=temp;
            temp*=arr[i];
        }

        temp=1;
        for(i=n-1;i>=0;i--){
            product[i] *=temp;
            temp *=arr[i];
        }
        return product;
    }
}
