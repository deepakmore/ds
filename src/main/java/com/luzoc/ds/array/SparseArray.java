package com.luzoc.ds.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SparseArray {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Long> stringsWithCounts = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> counts = new ArrayList<>();

        for (String query : queries) {
            if (stringsWithCounts.containsKey(query)) {
                counts.add(stringsWithCounts.get(query).intValue());
            } else {
                counts.add(0);
            }
        }

        return counts;
    }
}
