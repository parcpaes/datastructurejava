package stack.challenge;

import java.util.Stack;

public class PostFix {
    public static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public String infixToPostFix(String expression){
        if(expression.isEmpty()) return "";
        String result = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            char character = expression.charAt(i);
            if(precedence(character)>0){
                while(!stack.isEmpty() && precedence(stack.peek())>= precedence(character)){
                    result+=stack.pop();
                }
                stack.push(character);
            }else if(character==')'){
                char x = stack.pop();
                while(x!='('){
                    result+=x;
                    x = stack.pop();
                }
            }else if(character=='('){
                stack.push(character);
            }else{
                result+=character;
            }
        }
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }

    public int evaluatePostPix(String expression){
        if(expression.isEmpty()) throw new IllegalStateException("Expression is empty");
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            char character = expression.charAt(i);
            if(Character.isDigit(character)){
                stack.push(Integer.parseInt(""+character));
            }else{
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(evaluate(character,operand1,operand2));
            }
        }
        return stack.pop();
    }

    private int evaluate(char character, int operand1, int operand2) {
        switch (character){
            case '+':
                return operand1+operand2;
            case '-':
                return operand1-operand2;
            case '*':
                return operand1*operand2;
            case '/':
                return operand1/operand2;
        }
        return 0;
    }

    public static void main(String[] args) {
        String exp = "((2*3)+(5*4))-9";
    }
}
