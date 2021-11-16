package com.run;

import java.util.*;

public class Duplicates {

    public Set<Integer> findDuplicates(List<Integer> listContainingDuplicates) {
        final Set<Integer> setToReturn = new HashSet<>();
        final Set<Integer> set1 = new HashSet<>();

        for (Integer yourInt : listContainingDuplicates) {
            if (!set1.add(yourInt)) {
                setToReturn.add(yourInt);
            }
        }
        return setToReturn;
    }


    Map<String,String> example = new HashMap<String,String>();



    public static void main(String[] args) {
    }






}
