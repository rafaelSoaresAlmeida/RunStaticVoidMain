package com.run;

import java.util.Arrays;

public class ClosestToZero {

    static int[] one = {7, 5, 9, 1, 4}; // 1
    static int[] two = {-15, -7, -9, -14, -12}; // -7
    static int[] three = {-10, -10}; // -10
    static int[] four = {15, -7, 9, 14, 7, 12}; // 7
    static int[] five = {}; // 0


    public static int computeClosestToZero(int[] ts) {

        if(ts == null || ts.length == 0){
            return 0;
        }

        int currentValue = 0;
        int closestVal = ts[0];
        Arrays.sort(ts);

        for (int index = 0; index < ts.length; index++) {
            currentValue = ts[index] * ts[index];
            if (currentValue <= (closestVal * closestVal)) {
                closestVal = ts[index];
            }
        }
        return closestVal;
    }

    public static void main(String[] args) {
        System.out.println(computeClosestToZero(one));
        System.out.println(computeClosestToZero(two));
        System.out.println(computeClosestToZero(three));
        System.out.println(computeClosestToZero(four));
        System.out.println(computeClosestToZero(five));
    }

}
