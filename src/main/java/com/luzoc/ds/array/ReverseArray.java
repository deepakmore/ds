package com.luzoc.ds.array;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ReverseArray {
    // Solution 1
//    public static List<Integer> reverseArray(List<Integer> a) {
//        for (int i = 0, j = a.size() -1; i < j; i++, j--) {
//            Integer temp = a.get(i);
//            a.set(i, a.get(j));
//            a.set(j, temp);
//        }
//        return a;
//    }

//    // Solution 2
    public static List<Integer> reverseArray(List<Integer> numbers) {
        Collections.reverse(numbers);
        return numbers;
    }
}
