package arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSecondMaxValueTest {
    @DisplayName("it shout return second max value")
    @Test
    public void findSecondMaximum(){
        FindSecondMaxValue findSecondMaxValue = new FindSecondMaxValue();
        int arr[] = {-2,-33,-10,-456,-2};

        int actual = findSecondMaxValue.findSecondMaximum(arr);
        int expected = -10;

        assertEquals(expected,actual);
    }
}