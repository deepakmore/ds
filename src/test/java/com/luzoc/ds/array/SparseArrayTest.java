package com.luzoc.ds.array;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SparseArrayTest {
    @Test
    void shouldWork() {
        List<String> strings = Lists.list("aba", "baba", "aba", "xzxb");
        List<String> queries = Lists.list("aba", "xzxb", "ab");
        List<Integer> expectedCounts = Lists.list(2, 1, 0);

        List<Integer> actualCounts = SparseArray.matchingStrings(strings, queries);

        Assertions.assertEquals(actualCounts, expectedCounts);
    }
}
