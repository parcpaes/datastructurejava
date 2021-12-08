package arrays;

import java.util.LinkedList;

public class ReArrangePositiveAndNegative {
    public void reArrange(int arr[]) {
        if(arr.length==1) return;
        LinkedList<Integer> positive = new LinkedList<>();
        int count = 0;
        for (int value : arr) {
            if(value<0) arr[count++]=value;
            else positive.add(value);
        }
        while(!positive.isEmpty()){
            arr[count++] = positive.poll();
        }
    }
}
