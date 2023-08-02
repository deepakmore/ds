package com.luzoc.ds.array;

import java.util.ArrayList;
import java.util.List;


public class DynamicArray {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> qurs = new ArrayList<>();
        List<Integer> expectedLA = new ArrayList<>();
        int lA = 0;

        for (int i = 0; i < n; i++) {
            qurs.add(new ArrayList<>());
        }

        for (int i = 0; i < queries.size(); i++) {
            List<Integer> query = queries.get(i);
            int queryType = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int idx = ((x ^ lA) % n);

            if(queryType == 1) {
                qurs.get(idx).add(y);
            } else {
                int sIdx = y % qurs.get(idx).size();
                lA = qurs.get(idx).get(sIdx);
                expectedLA.add(lA);
            }
        }
        return expectedLA;
    }
}
