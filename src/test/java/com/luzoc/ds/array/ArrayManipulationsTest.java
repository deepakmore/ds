package com.luzoc.ds.array;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ArrayManipulationsTest {

    @Test
    public void shouldCreateArrayWithGivenSize() {
        long[] actual = ArrayManipulations.createArrayWithNSize(5);
        Assertions.assertEquals(5, actual.length);
    }

    @Test
    void shouldProcessWithPositiveQueries() {
        List<List<Integer>> queries = createAndGetQueries();
        long maxExpectedNo = ArrayManipulations.arrayManipulation(10, queries);

        Assertions.assertEquals(10, maxExpectedNo);
    }

    @Test
    void shouldProcessWithSameIndexQueries() {
        List<List<Integer>> queries = createAndGetQueriesSameIndexCase();
        long maxExpectedNo = ArrayManipulations.arrayManipulation(4, queries);

        Assertions.assertEquals(882, maxExpectedNo);
    }

    @Test
    void shouldProcessWithSameValueQueries() {
        List<List<Integer>> queries = createAndGetSameValueQueries();
        long maxExpectedNo = ArrayManipulations.arrayManipulation(5, queries);

        Assertions.assertEquals(200, maxExpectedNo);
    }

    private List<List<Integer>> createAndGetQueries() {
        List<Integer> row1 = Lists.list(1, 5, 3);
        List<Integer> row2 = Lists.list(4, 8, 7);
        List<Integer> row3 = Lists.list(6, 9, 1);

        return Lists.list(row1, row2, row3);
    }

    private List<List<Integer>> createAndGetQueriesSameIndexCase() {
        List<Integer> row1 = Lists.list(2, 3, 603);
        List<Integer> row2 = Lists.list(1, 1, 286);
        List<Integer> row3 = Lists.list(4, 4, 882);
        return Lists.list(row1, row2, row3);
    }

    private List<List<Integer>> createAndGetSameValueQueries() {
        List<Integer> row1 = Lists.list(1, 2, 100);
        List<Integer> row2 = Lists.list(2, 5, 100);
        List<Integer> row3 = Lists.list(3, 4, 100);

        return Lists.list(row1, row2, row3);
    }
}
