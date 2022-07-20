import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.lang.model.element.Element;

class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));

        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put(']', '[');
        parentheses.put('}', '{');
        parentheses.put(')', '(');

        for (Character c : s.toCharArray()) {
            if (parentheses.containsValue(c))
                stack.add(c);
            else if (stack.empty() || !(stack.pop() == parentheses.get(c)))
                return false;

        }
        return stack.empty();
    }
}