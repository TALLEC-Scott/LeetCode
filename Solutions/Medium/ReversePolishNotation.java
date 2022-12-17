package Medium;

import java.util.Stack;

public class ReversePolishNotation {


    // It is guaranteed that the given RPN expression is always valid and no div by 0
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();
        Integer op1, op2;
        for (String token :
                tokens) {
            switch (token) {

                case "+" -> {
                    op2 = operands.pop();
                    op1 = operands.pop();
                    operands.add(op1 + op2);
                }
                case "-" -> {
                    op2 = operands.pop();
                    op1 = operands.pop();
                    operands.add(op1 - op2);
                }
                case "*" -> {
                    op2 = operands.pop();
                    op1 = operands.pop();
                    operands.add(op1 * op2);
                }
                case "/" -> {
                    op2 = operands.pop();
                    op1 = operands.pop();
                    operands.add(op1 / op2);
                }
                    case default -> operands.add(Integer.parseInt(token));
            }
        }
        return operands.peek();
    }

    public static void main(String[] args) {
        var x = new ReversePolishNotation();
        var input = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        var res = x.evalRPN(input   );
        System.out.println(res);

    }
}