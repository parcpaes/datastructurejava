package arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatingIntegerTest {

    @DisplayName("it should return the first unique integer")
    @Test
    public void findFirstUnique(){
        FirstNonRepeatingInteger nonRepeatingInteger = new FirstNonRepeatingInteger();
        int arr[] = {4,5,1,2,0,4,5};

        int actual = nonRepeatingInteger.findFirstUnique(arr);
        int expected = 1;

        assertEquals(expected,actual);
    }
}