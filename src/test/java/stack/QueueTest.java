package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private Queue<Integer> queue;
    @BeforeEach
    void setUp() {
       queue = new Queue<>(6);
    }

    @Test
    void queueIsEmpty(){
        assertTrue(queue.isEmpty());
        queue.enqueue(11);
        assertFalse(queue.isEmpty());
    }

    @Test
    void testSize(){
        assertAll("assert size",
                ()->{
                    assertEquals(0,queue.size());
                },
                ()->{
                    queue.enqueue(11);
                    assertEquals(1,queue.size());
                },
                ()->{
                    queue.enqueue(6);
                    assertEquals(2,queue.size());
                },
                ()->{
                    queue.enqueue(5);
                    assertEquals(3,queue.size());
                }
        );
    }

    @Test
    void testFullQueue(){
        queue.enqueue(11);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(11);
        assertFalse(queue.isFull());
        queue.enqueue(23);
        assertTrue(queue.isFull());
    }

    @Test
    void testDequeue(){
        queue.enqueue(11);
        queue.enqueue(6);

        Optional<Integer> expectedV1 = Optional.of(11);
        assertEquals(expectedV1.of(11).get(),queue.dequeue());

        Optional<Integer> expectedV2 = Optional.of(11);
        assertEquals(expectedV2.of(6).get(),queue.dequeue());
    }

    @Test
    void testNoSuchElementException(){
        assertThrows(NoSuchElementException.class,()->queue.dequeue());
    }

    @Test
    void testEqualsQueueElements(){
        queue.enqueue(11);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(11);
        queue.enqueue(23);

        Integer expected[] = {11,6,5,20,11,23};
        assertArrayEquals(expected,queue.toArray());
    }

    @Test
    void testTopElementOfQueue(){
        queue.enqueue(11);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(11);
        assertAll(() -> {
                    Optional<Integer> topExpected = Optional.of(11);
                    assertEquals(topExpected.get(), queue.top());
                    assertEquals(topExpected.get(), queue.dequeue());
                },
                ()->{
                    Optional<Integer> topExpected = Optional.of(6);
                    assertEquals(topExpected.get(), queue.top());
                    assertEquals(topExpected.get(), queue.dequeue());
                },
                ()->{
                    Optional<Integer> topExpected = Optional.of(5);
                    assertEquals(topExpected.get(), queue.top());
                    assertEquals(topExpected.get(), queue.dequeue());

                },
                ()->{
                    queue.enqueue(23);
                    queue.enqueue(7);
                    Optional<Integer> topExpected = Optional.of(20);
                    assertEquals(topExpected.get(), queue.top());
                    assertEquals(topExpected.get(), queue.dequeue());
                }
        );
    }
}