package easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class parantases {

    public static void main(String[] args) {
        new parantases().run();
    }

    public void run() {
        String s = "([]{})";
        System.out.println(isValid(s));
    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (char c : chars) {
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if (top - c == -1 || top - c == -2)
                    stack.pop();
                else
                    stack.push(c);
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
