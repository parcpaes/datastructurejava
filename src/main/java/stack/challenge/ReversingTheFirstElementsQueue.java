package stack.challenge;

import stack.Queue;
import stack.Stack;

public class ReversingTheFirstElementsQueue {
    public <V> void reverseK(Queue<V> queue, int k){
        Stack<V> stack = new Stack<>(queue.size());
        for(int i=0;i<k;i++){
            stack.push(queue.dequeue());
        }
        while(!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }
        for (int i = 0; i < queue.size()-k; i++) {
            queue.enqueue(queue.dequeue());
        }
    }
}
