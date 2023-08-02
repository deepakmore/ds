package com.luzoc.ds.array;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> expectedArray = new ArrayList<>();

        for (int i = d; i < arr.size(); i++) {
            expectedArray.add(arr.get(i));
        }

        for (int i = 0; i < d; i++) {
            expectedArray.add(arr.get(i));
        }

        return expectedArray;
    }
}
