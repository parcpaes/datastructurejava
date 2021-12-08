package arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightRotateArrayTest {

    @Test
    @DisplayName("it should return an array rotated by one element from right to left")
    public void rotateArray(){
        RightRotateArray rotateArray = new RightRotateArray();
        int arr[] = {1,2,3,4,5};

        rotateArray.rotateArray(arr);
        int expected[] = {5,1,2,3,4};

        assertArrayEquals(expected,arr);
    }
}