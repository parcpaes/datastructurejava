package subsets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
class SubsetsWithDuplicatesTest {
    private List<List<Integer>> expectedList;
    private SubsetsWithDuplicates subsets;
    @BeforeEach
    public void setup(){
        subsets = new SubsetsWithDuplicates();
        expectedList = List.of(
                List.of(),
                List.of(1),
                List.of(3),
                List.of(1,3),
                List.of(3,3),
                List.of(1,3,3)
        );
    }

    @Test
    public void it_should_return_subset_with_duplicates_using_bitwise(){
        int numsInputs [] ={1,3,3};

        List<List<Integer>> output =subsets.findSubsets(numsInputs);

        assertThat(output,is(expectedList));
    }
    @Test
    public void it_should_return_subset_with_duplicates_using_bfs(){
        int numsInputs [] ={1,3,3};
        List<List<Integer>> output =subsets.findSubSetsBFS(numsInputs);

        assertThat(output,is(expectedList));
    }

    @ParameterizedTest
    @MethodSource("parameterProviderOdds")
    public void it_should_return_odd_number(int odd){
        assertTrue(subsets.idOdd(odd));
    }


    static int[] parameterProviderOdds(){
        int[] odd = new int[100];
        for(int i=0;i<100;i=i+3){
            odd[i]=i;
        }
        return odd;
    }
}