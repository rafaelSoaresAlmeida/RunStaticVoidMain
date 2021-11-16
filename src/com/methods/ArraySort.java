package com.methods;

import java.util.*;
import java.util.stream.IntStream;

public class ArraySort {

    public static void sortArrayWithDuplicates(int[] ints) {
        printValues(IntStream.of(ints).boxed().sorted(Comparator.naturalOrder()).mapToInt(i -> i).toArray());
    }

    public static void sortArrayWithDuplicates(Integer[] integers) {
        Arrays.sort(integers);
        printValues(integers);
    }


    public static void sortArrayWithOutDuplicates(Integer[] integers) {
       // LinkedHashSet hs = new LinkedHashSet();
        Set integerSet = new TreeSet();
        Collections.addAll(integerSet, integers);

        printValues(integerSet);
        printValues(integerSet);
    }

    private static void printValues(int[] ints){
        System.out.println("Begin ints");
        Arrays.stream(ints).forEach(x -> System.out.println(x));
    }

    private static void printValues(Integer[] ints){
        System.out.println("Begin Integer");
        Arrays.stream(ints).forEach(x -> System.out.println(x));
    }

    private static void printValues(Set list){
        System.out.println("Begin treeset");
        list.stream().forEach(x -> System.out.println(x) );
    }


    public static void reverse(Integer[] ints){
        Collections.reverse(Arrays.asList(ints));
        printValues(ints);
    }

}
