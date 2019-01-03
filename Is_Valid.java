package Leetcode;

import java.util.Stack;

public class Is_Valid {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');

            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String []args) {

        Is_Valid result = new Is_Valid();

    }

    }

