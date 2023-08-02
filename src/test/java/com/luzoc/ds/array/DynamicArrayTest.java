package com.luzoc.ds.array;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.luzoc.ds.array.DynamicArray.dynamicArray;

@SpringBootTest

public class DynamicArrayTest {

    @Test
    void shouldWork() {
        List<Integer> expectedLA = Lists.list(7, 3);
        List<Integer> actualLA = dynamicArray(2, createAndGetTestData());

        Assertions.assertEquals(expectedLA, actualLA);
    }

    List<List<Integer>> createAndGetTestData() {
        return Lists.list(
                Lists.list(1, 0, 5),
                Lists.list(1, 1, 7),
                Lists.list(1, 0, 3),
                Lists.list(2, 1, 0),
                Lists.list(2, 1, 1)
        );
    }
}
