package com.methods;

public class PowerCalculate {

    /* Function to calculate x raised to the power y */
    public static int power(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            return power(x, y / 2) * power(x, y / 2);
        } else {
            return x * power(x, y / 2) * power(x, y / 2);
        }
    }


    /* Java code for extended version of power function
that can work for float x and negative y  O(logn) */
    public static float power(float x, int y) {
        if (y == 0) {
            return 1;
        }
        float temp = power(x, y / 2);
        if (y % 2 == 0) {
            return temp * temp;
        } else {
            if (y > 0) {
                return x * temp * temp;
            } else {
                return (temp * temp) / x;
            }
        }
    }


}
