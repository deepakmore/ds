package com.luzoc.ds.array;

import org.assertj.core.util.Lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class ReverseArrayTest {

    @Test
    void shouldWorkWithSingleNo() {
        List<Integer> actualList = Lists.list(10);

        List<Integer> expected = ReverseArray.reverseArray(getClonedActualList(actualList));
        assertEquals(expected.get(0), actualList.get(actualList.size() - 1));
    }

    @Test
    void ShouldWorkWithTwoNo() {
        List<Integer> actualList = Lists.list(10, 40);
        List<Integer> expected = ReverseArray.reverseArray(getClonedActualList(actualList));
        assertEquals(expected.get(0), actualList.get(actualList.size() - 1));
    }

    @Test
    void ShouldWorkWithEvenNo() {
        List<Integer> actualList = Lists.list(10, 40, 45, 30);
        List<Integer> expected = ReverseArray.reverseArray(getClonedActualList(actualList));
        assertEquals(expected.get(0), actualList.get(actualList.size() - 1));
    }

    @Test
    void ShouldWorkWithOddNo() {
        List<Integer> actualList = Lists.list(10, 40, 56);
        List<Integer> expected = ReverseArray.reverseArray(getClonedActualList(actualList));
        assertEquals(expected.get(0), actualList.get(actualList.size() - 1));
    }

    private List<Integer> getClonedActualList(List<Integer> actualList) {
        List<Integer> cloneActualList = Lists.list();
        cloneActualList.addAll(actualList);
        return cloneActualList;
    }
}
