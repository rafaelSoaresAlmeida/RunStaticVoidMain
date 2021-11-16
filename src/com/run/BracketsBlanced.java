package com.run;

import java.util.Stack;

public class BracketsBlanced {

    public static boolean isBalanced(String input) {

        if (input == null || "".equals(input)) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        char currentCharacter;

        for (int index = 0; index < input.length(); index++) {

            currentCharacter = input.charAt(index);

            if (currentCharacter == '(') {
                stack.push(currentCharacter);
            }

            if (currentCharacter == ')') {

                if (stack.isEmpty()) {
                    return false;
                }

                char lastCharacter = stack.peek();

                if (currentCharacter == ')' && lastCharacter == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return (stack.isEmpty()) ? true : false;
    }


    public static void main(String[] args) {
        System.out.println(isBalanced(null));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced("(())()"));
        System.out.println(isBalanced(")()("));
        System.out.println(isBalanced("()"));
        System.out.println(isBalanced("("));
        System.out.println(isBalanced(")"));
    }


}
