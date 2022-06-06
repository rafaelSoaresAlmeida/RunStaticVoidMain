package com.run;

import java.util.Locale;

public class NonFirstRepeatedWord {
    public static void main(String[] args) {
        System.out.println(checkNonFirstRepeatedChar("Rafael"));
        System.out.println(checkNonFirstRepeatedChar("lllllll"));
    }

    public static char checkNonFirstRepeatedChar(String input){
        input = input.toUpperCase(Locale.ROOT);
        char nonFirsRepeated = 0;
        for(char i :input.toCharArray()){
            if ( input.indexOf(i) == input.lastIndexOf(i)) {
                nonFirsRepeated = i;
                break;
            }
        }
        return nonFirsRepeated;
    }
}
