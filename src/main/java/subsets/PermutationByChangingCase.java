package subsets;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
/*
Input: "ad52"
Output: "ad52", "Ad52", "aD52", "AD52"
*/
public class PermutationByChangingCase {
    public List<String> findLetterCaseStringPermutation(String str){
        ArrayList<String> permutations = new ArrayList<>();
        char characters[] = str.toCharArray();
        backtracking(permutations,0,characters);
        return permutations;
    }

    private void backtracking(ArrayList<String> permutations, int index,char[] characters) {
        permutations.add(String.valueOf(characters));
        for(int i=index;i<characters.length;i++){
            if(Character.isLetter(characters[i])){
                characters[i]=Character.toUpperCase(characters[i]);
                backtracking(permutations,i+1,characters);
                characters[i]=Character.toLowerCase(characters[i]);
            }
        }
    }
}
