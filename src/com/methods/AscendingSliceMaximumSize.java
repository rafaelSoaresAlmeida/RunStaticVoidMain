package com.methods;

import java.util.ArrayList;
import java.util.List;

public class AscendingSliceMaximumSize {

    public static List<Integer> allSlices(Integer[] inputArray) {
        List<Integer> maxSliceStarts = new ArrayList<>();
        maxSliceStarts.add(0);
        int maxSliceLength = 1;
        int currentSliceStart = 0;

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i - 1] >= inputArray[i]) {
                currentSliceStart = i;
            }
            int currentSliceLength = i - currentSliceStart + 1;
            if (currentSliceLength > maxSliceLength) {
                maxSliceStarts.clear();
                maxSliceLength = currentSliceLength;
            }
            if (currentSliceLength == maxSliceLength) {
                maxSliceStarts.add(currentSliceStart);
            }
        }
        return maxSliceStarts;
    }

    public static Integer slice(Integer[] inputArray) {
        Integer maxSliceStart = 0;
        Integer maxSliceLength = 1;
        Integer currentSliceStart = 0;
        for (Integer i = 1; i < inputArray.length; i++) {
            if (inputArray[i - 1] >= inputArray[i]) {
                currentSliceStart = i;
            }
            if (i - currentSliceStart + 1 /* length of the current slice */ > maxSliceLength) {
                maxSliceStart = currentSliceStart;
                maxSliceLength = i - currentSliceStart + 1;
            }
        }
        return maxSliceStart;
    }
}
