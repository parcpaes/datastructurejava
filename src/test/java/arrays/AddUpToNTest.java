package arrays;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;

class AddUpToNTest {

    @DisplayName("it should return two value that add up are N")
    @Test
    public void findSum(){
        AddUpToN add = new AddUpToN();
        int sum = 27;
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};

        int[] actual = add.findSum(arr,sum);
        int[] expected ={6,21};

        assertThat(List.of(actual),Matchers.containsInAnyOrder(expected));
    }

}