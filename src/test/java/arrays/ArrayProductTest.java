package arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayProductTest {

    @DisplayName("it should return an arr with each index i that contain the product all numbers")
    @Test
    public void findProduct(){
        ArrayProduct product = new ArrayProduct();
        int arr[] ={4,2,1,5,0};

        int actual[] = product.findProduct(arr);
        int expected[] = {0,0,0,0,40};

        assertArrayEquals(expected,actual);
    }
}