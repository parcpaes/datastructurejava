package stack.challenge;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import stack.Queue;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReversingTheFirstElementsQueueTest {
    @ParameterizedTest
    @MethodSource("provideQueueWithIntegerValues")
    void testReversingTheFirstKElementsOfAQueue(Queue<Integer> actualQueue) {
        ReversingTheFirstElementsQueue reversing = new ReversingTheFirstElementsQueue();

        Integer expected[] = {5,4,3,2,1,6,7,8,9,10};
        reversing.reverseK(actualQueue,5);
        assertArrayEquals(expected,actualQueue.toArray());
    }

    static Stream<Arguments> provideQueueWithIntegerValues(){
        Queue<Integer> queue = new Queue<>(10);
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i+1);
        }
        return Stream.of(Arguments.of(queue));
    }
}