package heap;

import java.util.*;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();//min heap
        int array[] = {9,4,7,1,-2,6,5};
        int k=3;
        for(int n:array){
            pQueue.add(n);
            if(pQueue.size()>k) pQueue.poll();
        }
        while(!pQueue.isEmpty()){
            System.out.println(pQueue.poll());
        }
    }
}
