package arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeArrayTest {

    @DisplayName("it should return a merged array with sorted elements")
    @Test
    public void mergeArray(){
        //Arrange
        MergeArray mergeArray = new MergeArray();
        int arr1[] = {1,3,4,5};
        int arr2[] ={2,6,7,8};

        //Act
        int actual[] = mergeArray.mergeArray(arr1,arr2);
        int expected[] = {1, 2, 3, 4, 5, 6, 7, 8};

        //assert
        assertArrayEquals(expected,actual);
    }
}