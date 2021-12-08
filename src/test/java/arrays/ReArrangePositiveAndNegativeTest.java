package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReArrangePositiveAndNegativeTest {

    @Test
    public void reArrange(){
        ReArrangePositiveAndNegative reArrangePositiveAndNegative = new ReArrangePositiveAndNegative();
        int arr[] = {10,-1,20,4,5,-9,-6};
        reArrangePositiveAndNegative.reArrange(arr);
        int expected[] = {-1,-9,-6,10,20,4,5};

        assertArrayEquals(expected,arr);
    }
}