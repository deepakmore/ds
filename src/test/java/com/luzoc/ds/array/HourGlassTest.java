package com.luzoc.ds.array;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class HourGlassTest {

    @Test
    void shouldWorkWithAllZero() {
        List<List<Integer>> testData = createAndGetAllZeros();
        int maxSum = HourGlass.hourglassSum(testData);

        Assertions.assertEquals(0, maxSum);
    }

    @Test
    void shouldWorkWithPositiveNums() {
        List<List<Integer>> testData = createAndGetPositiveNums();
        int maxSum = HourGlass.hourglassSum(testData);

        Assertions.assertEquals(19, maxSum);
    }

    @Test
    void shouldWorkWithNegativeAndPositiveNums() {
        List<List<Integer>> testData = createAndGetPositiveAndNegativeNums();
        int maxSum = HourGlass.hourglassSum(testData);

        Assertions.assertEquals(28, maxSum);
    }


    @Test
    void shouldWorkWithFailedCase() {
        List<List<Integer>> testData = createAndGetFailedCaseNums();
        int maxSum = HourGlass.hourglassSum(testData);

        Assertions.assertEquals(13, maxSum);
    }


    private List<List<Integer>> createAndGetAllZeros() {
        List<Integer> row1 = Lists.list(0, 0, 0, 0, 0, 0);
        List<Integer> row2 = Lists.list(0, 0, 0, 0, 0, 0);
        List<Integer> row3 = Lists.list(0, 0, 0, 0, 0, 0);
        List<Integer> row4 = Lists.list(0, 0, 0, 0, 0, 0);
        List<Integer> row5 = Lists.list(0, 0, 0, 0, 0, 0);
        List<Integer> row6 = Lists.list(0, 0, 0, 0, 0, 0);
        return Lists.list(row1, row2, row3, row4, row5, row6);
    }

    private List<List<Integer>> createAndGetPositiveAndNegativeNums() {
        List<Integer> row1 = Lists.list(-9, -9, -9, 1, 1, 1);
        List<Integer> row2 = Lists.list(0, -9, 0, 4, 3, 2);
        List<Integer> row3 = Lists.list(-9, -9, -9, 1, 2, 3);
        List<Integer> row4 = Lists.list(0, 0, 8, 6, 6, 0);
        List<Integer> row5 = Lists.list(0, 0, 0, -2, 0, 0);
        List<Integer> row6 = Lists.list(0, 0, 1, 2, 4, 0);
        return Lists.list(row1, row2, row3, row4, row5, row6);
    }

    private List<List<Integer>> createAndGetFailedCaseNums() {
        List<Integer> row1 = Lists.list(1, 1, 1, 0, 0, 0);
        List<Integer> row2 = Lists.list(0, 1, 0, 0, 0, 0);
        List<Integer> row3 = Lists.list(1, 1, 1, 0, 0, 0);
        List<Integer> row4 = Lists.list(0, 9, 2, -4, -4, 0);
        List<Integer> row5 = Lists.list(0, 0, 0, -2, 0, 0);
        List<Integer> row6 = Lists.list(0, 0, -1, -2, -4, 0);
        return Lists.list(row1, row2, row3, row4, row5, row6);
    }

    List<List<Integer>> createAndGetPositiveNums() {
        List<Integer> row1 = Lists.list(1, 1, 1, 0, 0, 0);
        List<Integer> row2 = Lists.list(0, 1, 0, 0, 0, 0);
        List<Integer> row3 = Lists.list(1, 1, 1, 0, 0, 0);
        List<Integer> row4 = Lists.list(0, 0, 2, 4, 4, 0);
        List<Integer> row5 = Lists.list(0, 0, 0, 2, 0, 0);
        List<Integer> row6 = Lists.list(0, 0, 1, 2, 4, 0);
        return Lists.list(row1, row2, row3, row4, row5, row6);
    }
}
