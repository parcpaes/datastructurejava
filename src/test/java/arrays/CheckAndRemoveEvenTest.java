package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckAndRemoveEvenTest {
    @DisplayName("it should return array with odd values")
    @Test
    public void removeEvenOfAnArray(){
        //arrange
        CheckAndRemoveEven removeEven = new CheckAndRemoveEven();
        int input [] ={1, 2, 4, 5, 10, 6, 3};

        //acts
        int actual[] = removeEven.removeEven(input);
        int expected[] = {1,5,3};

        //assert
       assertArrayEquals(expected,actual);
    }

}