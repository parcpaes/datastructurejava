package stack.challenge;


import stack.Stack;

public class QueueWithStack<V> {
    private Stack<V> enqueue;
    private Stack<V> dequeue;
    int currentSize;
    int maxSize;

    public QueueWithStack(int maxSize){
        this.maxSize = maxSize;
        currentSize=0;
        enqueue = new Stack<>(maxSize);
        dequeue = new Stack<>(maxSize);
    }
    public boolean isEmpty(){
        return currentSize==0;
    }
    public boolean isFull(){
        return currentSize==maxSize;
    }
    public void enqueue(V value){
        if(!isFull()){
            while(!dequeue.isEmpty()){
                enqueue.push(dequeue.pop());
            }
            enqueue.push(value);
            currentSize++;
        }
    }

    public V dequeue(){
        if(!isEmpty()){
            while(!enqueue.isEmpty()){
                dequeue.push(enqueue.pop());
            }
            currentSize--;
            return dequeue.top();
        }
        return null;
    }
}
