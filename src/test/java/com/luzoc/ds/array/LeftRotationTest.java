package com.luzoc.ds.array;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class LeftRotationTest {

    @Test
    void shouldRotateByZeroPlace() {
        List<Integer> expectedArray = Lists.list( 1, 2, 3, 4, 5);
        List<Integer> actualArray = LeftRotation.rotateLeft(0, createAndGetArrayData());

        Assertions.assertEquals(actualArray, expectedArray);
    }

    @Test
    void shouldRotateByOnePlace() {
        List<Integer> expectedArray = Lists.list(2, 3, 4, 5, 1);
        List<Integer> actualArray = LeftRotation.rotateLeft(1, createAndGetArrayData());

        Assertions.assertEquals(actualArray, expectedArray);
    }

    @Test
    void shouldRotateByTwoPlace() {
        List<Integer> expectedArray = Lists.list( 3, 4, 5, 1, 2);
        List<Integer> actualArray = LeftRotation.rotateLeft(2, createAndGetArrayData());

        Assertions.assertEquals(actualArray, expectedArray);
    }

    @Test
    void shouldRotateByTotalSizeOfArrayPlace() {
        List<Integer> expectedArray = Lists.list( 1, 2, 3, 4, 5);
        List<Integer> actualArray = LeftRotation.rotateLeft(createAndGetArrayData().size(), createAndGetArrayData());

        Assertions.assertEquals(actualArray, expectedArray);
    }

    List<Integer> createAndGetArrayData() {
        return Lists.list(1, 2, 3, 4, 5);
    }
}
