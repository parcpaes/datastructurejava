package refacforing.ifstatement.factoryMethod;

import refacforing.ifstatement.factoryMethod.Addition;
import refacforing.ifstatement.factoryMethod.Division;
import refacforing.ifstatement.factoryMethod.Operation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperatorFactory {
    static Map<String, Operation> operationMap = new HashMap<>();
    static{
        operationMap.put("+",new Addition());
        operationMap.put("/",new Division());
    }

    public static Optional<Operation> getOperation(String operator){
        return Optional.ofNullable(operationMap.get(operator));
    }
}
