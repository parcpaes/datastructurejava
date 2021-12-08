package bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSingleNumbers {
    public static void main(String[] args) {
        int array [] ={1, 4, 7, 6, 3, 5, 3, 7, 1, 5};
        int numbers = 0;
        List<Integer> singles = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            numbers = numbers^array[i];
        }
        int rightMostSetBit = numbers&(-numbers);
        int num1 =0, num2=0;
        for(int num:array){
            if((num & rightMostSetBit)!=0){
                num1^=num;
            }else{
                num2^=num;
            }
        }
        System.out.printf("%d %d",num1,num2);
    }
}
