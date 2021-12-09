package stack;

import java.util.NoSuchElementException;

public class Queue<V> {
    private int maxSize;
    private int front;
    private int back;
    private int currentSize;
    private V array[];

    @SuppressWarnings("unchecked")
    public Queue(int size){
        this.maxSize = size;
        this.front = 0;
        this.back=-1;
        this.currentSize=0;
        array = (V[]) new Object[size];
    }
    public int getMaxSize(){
        return maxSize;
    }
    public int size(){
        return currentSize;
    }

    public boolean isEmpty(){
        return currentSize==0;
    }

    public boolean isFull(){
        return currentSize==maxSize;
    }

    public V top(){
        return array[front];
    }

    public void enqueue(V data){
        if(isFull()) return;
        back = (back+1)%maxSize;
        array[back]=data;
        currentSize++;
    }
    public V dequeue(){
        if(isEmpty()) throw new NoSuchElementException("array is empty");
        V temp = array[front];
        front=(front+1)%maxSize;
        currentSize--;
        return temp;
    }

    public V[] toArray(){
        return array;
    }
}
