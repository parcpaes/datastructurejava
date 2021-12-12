package refacforing.ifstatement;

import refacforing.ifstatement.factoryMethod.Operation;
import refacforing.ifstatement.factoryMethod.OperatorFactory;
import refacforing.ifstatement.useenums.Operator;

public class Calculator {

    public int calculate(int a, int b, String operator){
        int result = Integer.MIN_VALUE;
        if("+".equals(operator)){
            result = a+b;
        }else if("*".equals(operator)){
            result=a*b;
        }else if("/".equals(operator)){
            result=a/b;
        }else if("-".equals(operator)){
            result = a-b;
        }
        return result;
    }

    public int calculateUsingFactory(int a,int b, String operator){
        Operation targetOperation = OperatorFactory
                .getOperation(operator)
                .orElseThrow(()->new IllegalArgumentException("Invalid Operator"));
        return targetOperation.apply(a,b);
    }

    public int calculateUsingEnums(int a, int b, Operator operator){
        return operator.apply(a,b);
    }
}
