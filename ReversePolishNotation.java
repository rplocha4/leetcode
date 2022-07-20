import java.util.HashSet;
import java.util.Set;

import java.util.Stack;

class ReversePolishNotaion {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[] { "2", "1", "+", "3", "*" }));
        System.out.println(evalRPN(new String[] { "4", "13", "5", "/", "+" }));

        System.out
                .println(evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" }));

    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> signs = new HashSet<>();
        signs.add("+");
        signs.add("-");
        signs.add("*");
        signs.add("/");

        for (String c : tokens) {
            if (!signs.contains(c)) {
                stack.add(Integer.parseInt(c));
                continue;
            }
            int val1 = stack.pop();
            int val2 = stack.pop();

            switch (c) {
                case "+":
                    stack.add(val1 + val2);
                    break;
                case "-":
                    stack.add(val2 - val1);
                    break;
                case "*":
                    stack.add(val1 * val2);
                    break;
                case "/":
                    stack.add(val2 / val1);
            }

        }
        return stack.pop();
    }
}