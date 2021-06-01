package com.run;

import java.util.Iterator;
import java.util.TreeSet;

public class FoundMissedNumber {

    public static void main(String[] args) {
        foundMissedNumber("267850010");
        foundMissedNumber("15436792");
    }

    public static void foundMissedNumber(final String str) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();

        for (int i = 0; i < str.length(); i++) {
            numbers.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }

        int currentNumber = 0;
        Iterator<Integer> iterator = numbers.iterator();

        if (iterator.hasNext()) {
            currentNumber = iterator.next();
        }

        int nextRight;
        while (iterator.hasNext()) {
            int nextNumber = iterator.next();

            nextRight = currentNumber + 1;

            if(nextRight != nextNumber){
                System.out.println("missed-> " + nextRight);
                break;
            }

//            System.out.println("current-> " + currentNumber);
//            System.out.println("next-> " + nextNumber);
            
            currentNumber = nextNumber;
        }

    }
}
