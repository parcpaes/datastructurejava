package stack.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberTest {
    @Test
    void testGeneratedBinaryNumbers(){
        BinaryNumber binaryNumber = new BinaryNumber();
        String[] actual = binaryNumber.finBin(5);
        String[] expected = {"1","10","11","100","101"};
        assertArrayEquals(expected,actual);
    }
}