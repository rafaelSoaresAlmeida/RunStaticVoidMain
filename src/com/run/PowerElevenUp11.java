package com.run;

import com.methods.PowerCalculate;

import java.math.BigInteger;

public class PowerElevenUp11 {

    //Given a value n, where n is in the range [0 .. 500], return the number of digits equal to 1 in the decimal representation of the number 11n.

/*    As multiplication by 11 is a shift and addition (*1 + *10), 11n can be done symbolicly by n such steps.

    Use an array of n+1 digit values, the least significant at index 0 (hence reversed).
    https://codereview.stackexchange.com/questions/233278/counting-number-of-1-digits-in-the-value-of-11n/233314*/


    public static void main(String[] args) {
        System.out.println(solution(2));

    }

    public static int solution(int n) {
        final BigInteger elevenUpN = BigInteger.valueOf(11).pow(n);
        final String repr = elevenUpN.toString();
        return (int) repr.codePoints().filter(cp -> cp == '1').count();
    }
}
