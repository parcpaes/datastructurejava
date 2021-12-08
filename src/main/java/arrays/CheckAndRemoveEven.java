package arrays;

import java.util.Arrays;

public class CheckAndRemoveEven {
    public int[] removeEven(int array[]){

        int countOdd=0;
        for(int number:array){
            if(number%2!=0)countOdd++;
        }
        int odd[] = new int[countOdd];
        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0) odd[index++]=array[i];
        }
        return odd;
    }
    public static void main(String[] args) {
    }
}
