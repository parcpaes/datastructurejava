package stack.challenge;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import stack.Stack;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortValuesInStackTest {

    @ParameterizedTest
    @MethodSource("provideStackWithIntegerValues")
    void testSortTheValuesInAStack(Stack<Integer> unsortedStack) {
        SortValuesInStack sort = new SortValuesInStack();
        Integer expected[] = {97,60,42,23,12,4,2};
        sort.sortStack(unsortedStack);
        assertArrayEquals(expected,unsortedStack.toArray());
    }

    static Stream<Arguments> provideStackWithIntegerValues(){
        Stack<Integer> stack = new Stack(7);
        stack.push(23);
        stack.push(60);
        stack.push(12);
        stack.push(42);
        stack.push(4);
        stack.push(97);
        stack.push(2);
        return Stream.of(Arguments.of(stack));
    }
}