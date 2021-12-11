package stack.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostFixTest {
    @Test
    void testEvaluatePostFix(){
        PostFix postFix = new PostFix();
        String expression = postFix.infixToPostFix("5*((6/3)-2*(8*9)/6)+9");
        int expected = -101;
        int actual = postFix.evaluatePostPix(expression);
        assertEquals(expected,actual);
    }
}