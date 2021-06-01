package com.run;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class SmallestPositive {

    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 6, 4, 1, 2};
        int[] numbers2 = {-1, -3};
        int[] numbers3 = {1, 2, 3};
        int[] numbers4 = {2};
        int[] numbers5 = {0};
        int[] numbers6 = {90, 91, 92, 93};

        System.out.println(getSmallestPositive(numbers1));
        System.out.println(getSmallestPositive(numbers2));
        System.out.println(getSmallestPositive(numbers3));
        System.out.println(getSmallestPositive(numbers4));
        System.out.println(getSmallestPositive(numbers5));
        System.out.println(getSmallestPositive(numbers6));

    }

    private static int getSmallestPositive(int[] numbers) {
        Set<Integer> set = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        Iterator iterator = set.iterator();

        int resp;
        int next = 0;
        int current = 0;
        int startPositiveNumber = 1;

        while (iterator.hasNext()) {
            current = (Integer) iterator.next();
            if (isPositive(current)) {
                resp = checkBeforeNumbers(startPositiveNumber, current, set);
                if (resp > 0) {
                   return resp;
                } else {
                    next = current + 1;
                    startPositiveNumber = current;
                    if (!set.contains(next)) {
                        return next;
                    }
                }
            }
        }
        return 1;
    }

    private static boolean isPositive(int number) {
        return (Integer.signum(number) == -1) ? false : true;
    }

    private static int checkBeforeNumbers(int begin, int end, Set<Integer> set) {
        for (int index = begin; index < end; index++) {
            if (!set.contains(index)) {
                return index;
            }
        }
        return 0;
    }

}
