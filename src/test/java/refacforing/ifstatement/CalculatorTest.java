package refacforing.ifstatement;

import org.junit.jupiter.api.Test;
import refacforing.ifstatement.useenums.Operator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testCalculatorUsingFactory(){
        Calculator calculator = new Calculator();

        int actual = calculator.calculateUsingFactory(8,9,"+");
        int expected = 17;
        assertEquals(expected,actual);
    }

    @Test
    void testCalculatorUsingEnumOperator(){
        Calculator calculator = new Calculator();
        int actual = calculator.calculateUsingEnums(5,6, Operator.ADD);
        int expected = 11;
        assertEquals(expected,actual);
    }
}