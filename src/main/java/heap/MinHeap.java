package heap;

import java.util.Arrays;

public class MinHeap {
    public static int size=0;
    private static void maxHeapify(int[] heapArray, int index, int heapSize) {
        int largest = index;
        while(largest<heapSize>>1){
            int left = (index<<1)+1;
            int right =(index<<1)+2;
            if(left<heapSize && heapArray[left]<heapArray[index]){
                largest = left;
            }
            if(right<heapSize && heapArray[right]<heapArray[largest]){
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
    public static int[] findKSmallest(int array[], int k){
        if(k>array.length || k<0) return new int[0];
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=pop(array);
        }
        return result;
    }
    public static int[] findKLargest(int array[], int k){
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=pop(array);
        }
        return result;
    }
    public static void insert(int val,int array[]){
        array[size++] = val;
        maxHeapify(array,0,size);
    }
    public static void main(String[] args) {
        int heapArray[] = { 9,4,7,1,-2,6,5};
//        System.out.println("Before Heapify "+ Arrays.toString(heapArray));
//        buildMaxHeap(heapArray,heapArray.length);
        int array[] = new int[heapArray.length];
        for(int i=0;i<heapArray.length;i++){
            insert(heapArray[i],array);
        }
        System.out.println(Arrays.toString(array));
    }
}
