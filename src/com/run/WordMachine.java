package com.run;

import java.util.Stack;
import java.util.regex.Pattern;

public class WordMachine {

    public static final int MAX = 0xFFFFF;
    public static final int MIN = 0;
    private static final Pattern NUMERIC = Pattern.compile("\\d+");
    private static final Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        System.out.println(wordMachineCalc("4 5 6 - 7 +"));
        System.out.println(wordMachineCalc("13 DUP 4 POP 5 DUP + DUP + -"));
        System.out.println(wordMachineCalc("5 6 + -"));
        System.out.println(wordMachineCalc("3 DUP 5 - -"));
    }

    public static int wordMachineCalc(final String sequence) {
        try {
            final String[] elements = sequence.split(" ");
            for (String element : elements) {
                if (NUMERIC.matcher(element).matches()) {
                    push(Integer.valueOf(element));
                } else {
                    makeOperation(element);
                }
            }
            return pop();
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }


    private static void push(final int number) {
        withinRange(number);
        stack.push(number);
    }

    private static int pop() {
        return stack.pop();
    }

    private static void makeOperation(final String operation) {
        switch (operation) {
            case "POP":
                pop();
                break;
            case "DUP":
                dup();
                break;
            case "+":
                add();
                break;
            case "-":
                sub();
                break;
            default:
                throw new IllegalArgumentException("Operation not found");
        }
    }

    private static void dup() {
        hasElements(1);
        push(stack.peek());
    }

    private static void add() {
        hasElements(2);
        push(stack.pop() + stack.pop());
    }

    private static void sub() {
        hasElements(2);
        push(stack.pop() - stack.pop());
    }

    private static void hasElements(final int size) {
        if (stack.size() < size) {
            throw new IllegalArgumentException("Too few elements available");
        }
    }

    private static void withinRange(final int size) {
        if (size < MIN || size > MAX) {
            throw new IllegalArgumentException("Input under/overflow");
        }
    }
}
