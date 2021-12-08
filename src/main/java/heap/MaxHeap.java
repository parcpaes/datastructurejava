package heap;

import java.util.Arrays;

public class MaxHeap {
    public static int size=0;
    private static void maxHeapify(int[] heapArray, int index, int heapSize) {
        int largest = index;
        while(largest<heapSize>>1){
            int left = (index<<1)+1;
            int right =(index<<1)+2;
            if(left<heapSize && heapArray[left]>heapArray[index]){
                largest = left;
            }
            if(right<heapSize && heapArray[right]>heapArray[largest]){
                largest = right;
            }
            if(largest!=index){
                swap(heapArray,index,largest);
                index = largest;
            }else{
                break;
            }
        }
    }

    private static void swap(int[] heapArray, int index, int largest) {
        int temp = heapArray[index];
        heapArray[index] = heapArray[largest];
        heapArray[largest]= temp;
    }

    private static int pop(int[] heapArray){
        if(size<0) return -1;
        int firstValue = heapArray[0];
        swap(heapArray,0,size-1);
        size--;
        maxHeapify(heapArray,0,size);
        return firstValue;
    }

    public static void buildMaxHeap(int[] heapArray, int heapSize){
        size=heapSize;
        for(int i=(heapSize-1)>>1;i>=0;i--){
            maxHeapify(heapArray,i,heapSize);
        }
    }
    public static void main(String[] args) {
        int heapArray[] = { 1, 4, 7, 12, 15, 14, 9, 2, 3, 16};
        System.out.println("Before Heapify "+ Arrays.toString(heapArray));
        buildMaxHeap(heapArray,heapArray.length);
        System.out.println("After heapify :"+Arrays.toString(heapArray));
        System.out.println(pop(heapArray));
    }
}
