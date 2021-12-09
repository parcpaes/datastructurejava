package stack;

public class Stack<V> {
    private int maxSize;
    private int top;
    private V array[];

    @SuppressWarnings("unchecked")
    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.top = -1;
        array = (V[]) new Object[maxSize];
    }

    public int getCapacity(){
        return maxSize;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==maxSize-1;
    }

    public V top(){
        if(isEmpty()) return null;
        return array[top];
    }

    public void push(V value){
        if(isFull()){
            return;
        }
        array[++top]=value;
    }

    public V pop(){
        if(isEmpty()) return null;
        return array[top--];
    }
}
