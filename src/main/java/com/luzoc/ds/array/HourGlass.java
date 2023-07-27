package com.luzoc.ds.array;

import java.util.List;

public class HourGlass {

    public static int hourglassSum(List<List<Integer>> arr) {
        int maxValue = -9999999;

        for (int i = 0, j = 0; i < 4;) {
            int sumVal = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                    + arr.get(i+1).get(j+1)
                    + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

            maxValue = Math.max(sumVal, maxValue);
            j++;
            if(j >= 3) {
                i++;
                j = 0;
            }
        }
        return maxValue;
    }
}
