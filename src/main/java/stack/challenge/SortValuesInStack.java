package stack.challenge;

import stack.Stack;

import java.util.Arrays;
import java.util.Collections;

public class SortValuesInStack {
    public <V> void sortStack(Stack<V> stack){
        V array[] = (V[]) new Object[stack.getCapacity()];
        for (int i = 0; !stack.isEmpty(); i++) {
            array[i]=stack.pop();
        }
        Arrays.sort(array);
        for (int i = array.length-1; i>=0; i--) {
            stack.push(array[i]);
        }
    }
}
