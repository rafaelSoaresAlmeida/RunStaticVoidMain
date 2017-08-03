package com.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

    public static void  putNumbersInIndex(){

        List<Integer> source = new ArrayList<Integer>(Arrays.asList(1,2,3,5,7));
        source.add(4,6);
        System.out.println(source.toString());
    }

}
