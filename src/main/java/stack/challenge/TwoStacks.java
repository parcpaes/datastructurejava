package stack.challenge;

public class TwoStacks<V> {
    private int maxSize;
    private int top1;
    private int top2;
    private V[] array;

    @SuppressWarnings("unchecked")
    public TwoStacks(int maxSize){
        this.maxSize = maxSize;
        array = (V[]) new Object[maxSize];
        top1=-1;
        top2=maxSize;
    }

    public void push1(V value){
        if(top1<top2 && top1+1!=top2){
            array[++top1]=value;
        }
    }

    public void push2(V value){
        if(top2>top1 && top2-1!=top1){
            array[--top2]=value;
        }
    }

    public V pop1(){
        if(top1>=0){
            return array[top1--];
        }
        return null;
    }

    public V pop2(){
        if(top2<maxSize){
            return array[top2++];
        }
        return null;
    }
}
