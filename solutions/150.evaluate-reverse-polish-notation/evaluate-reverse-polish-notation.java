class Solution {
public  int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num2 = operands.pop();
                int num1 = operands.pop();
                int num = 0;
                switch (token) {
                    case "+":
                        num = num1 + num2;
                        break;
                    case "-":
                        num = num1 - num2;
                        break;
                    case "*":
                        num = num1 * num2;
                        break;
                    case "/":
                        num = num1 / num2;
                        break;
                }
                operands.push(num);
            } else {
                operands.push(Integer.valueOf(token));
            }
        }
        return operands.peek();
    }
}