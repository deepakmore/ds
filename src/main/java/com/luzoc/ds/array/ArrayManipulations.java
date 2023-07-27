package com.luzoc.ds.array;

import java.util.List;

public class ArrayManipulations {

    // Solution 1 - Time complexity - O(n2)
//    public static long arrayManipulation(int n, List<List<Integer>> queries) {
//        long[] finalArray = createArrayWithNSize(n);
//
//        long maxValue = 0;
//        for (List<Integer> lst: queries) {
//
//            int a = lst.get(0);
//            int b = lst.get(1);
//            int k = lst.get(2);
//
//            for (int i = 0; i <= n; i++) {
//                if(i >= a && i <= b) {
//                    finalArray[i] += k;
//                    if(finalArray[i] > maxValue)
//                        maxValue = finalArray[i];
//                }
//            }
//        }
//        return maxValue;
//    }

    // Solution 2 = O(2n) = O(n)
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] finalArray = createArrayWithNSize(n + 2);

        long maxValue = 0;
        for (List<Integer> lst: queries) {

            int a = lst.get(0);
            int b = lst.get(1);
            int k = lst.get(2);

            finalArray[a] += k;
            finalArray[b + 1] -= k;
        }

        for (int i = 1; i <=n; i++) {
            finalArray[i] = finalArray[i] + finalArray[i-1];
            maxValue = Math.max(maxValue, finalArray[i]);
        }
        return maxValue;
    }

    protected static long[] createArrayWithNSize(int n) {
        return new long[n];
    }
}
