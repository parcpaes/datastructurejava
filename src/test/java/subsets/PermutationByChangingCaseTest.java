package subsets;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PermutationByChangingCaseTest {
    @Test
    @DisplayName("it should return all permutations preserving the character sequence but changing case")
    public void findLetterCaseStringPermutation(){
        PermutationByChangingCase permutation = new PermutationByChangingCase();
        String input = "ab7c";

        List<String> actual = permutation.findLetterCaseStringPermutation(input);
        List<String> expected = List.of("ab7c", "Ab7c", "aB7c", "AB7c", "ab7C", "Ab7C", "aB7C", "AB7C");

        assertThat(actual,containsInAnyOrder(expected.toArray()));
    }
}