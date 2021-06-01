package com.run;

public class PrintCodilityTestCoders {


    private static final String CODILITY = "Codility";
    private static final String TEST = "Test";
    private static final String CODERS = "Coders";

    public static void main(String[] args) {
        printConsecutiveNumbers(24);
    }

    public static void printConsecutiveNumbers(final int number) {
        for (int num = 1; num <= number; num++) {
            System.out.println(printWord(num));
        }
    }

    public static String printWord(final int number) {
        final StringBuilder stringBuilder = new StringBuilder();
        if (isDivisibleBy2(number)) {
            stringBuilder.append(CODILITY);
        }

        if (isDivisibleBy3(number)) {
            stringBuilder.append(TEST);
        }

        if (isDivisibleBy5(number)) {
            stringBuilder.append(CODERS);
        }

        return (stringBuilder.toString().equals("") ? Integer.toString(number) : stringBuilder.toString());
    }

    static boolean isDivisibleBy5(final int number) {
        return (isDivisible(number, 5));
    }

    static boolean isDivisibleBy2(final int number) {
        return (isDivisible(number, 2));
    }

    static boolean isDivisibleBy3(final int number) {
        return (isDivisible(number, 3));
    }

    static boolean isDivisible(final int number, final int divisor) {
        return (number % divisor == 0) ? true : false;
    }

}
