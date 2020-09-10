package validParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (Character cr : s.toCharArray()) {
            if (cr == '(' || cr == '[' || cr == '{') {
                stack.push(cr);
            } else if (cr == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (cr == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (cr == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
