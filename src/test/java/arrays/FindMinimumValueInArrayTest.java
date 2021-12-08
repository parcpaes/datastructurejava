package arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumValueInArrayTest {

    @DisplayName("it should return the minimum value of an array")
    @Test
    public void findMinimum(){
        FindMinimumValueInArray findMinValue = new FindMinimumValueInArray();
        int arr[] = {9,2,3,6};

        int actual = findMinValue.findMinimum(arr);
        int expected = 2;

        assertEquals(expected,actual);
    }
}