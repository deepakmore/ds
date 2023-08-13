package com.luzoc.ds.linkedlist;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DoublyLinkedListNodeProblemsTest {

    @Test
    void shouldCreateDoublyLinkedList() {
        DoublyLinkedListNode actualHead = DoublyLinkedListNodeProblems.createDoublyLinkedList(Lists.list(10, 20, 30, 40, 50));
        int count = DoublyLinkedListNodeProblems.getTotalNodes(actualHead);
        Assertions.assertEquals(5, count);
    }

    @Test
    void shouldPrintNodeValues() {
        DoublyLinkedListNode actualHead = DoublyLinkedListNodeProblems.createDoublyLinkedList(Lists.list(10, 20, 30, 40, 50));
        String values = DoublyLinkedListNodeProblems.printNodeValues(actualHead);

        Assertions.assertEquals("10 20 30 40 50", values);
    }

    @Test
    void shouldInsertNodeOnFirstPosition() {
        DoublyLinkedListNode actualHead = null;
        DoublyLinkedListNode head = DoublyLinkedListNodeProblems.insertNode(actualHead, 10, 1);

        Assertions.assertNotEquals(head, actualHead);
    }

    @Test
    void shouldInsertNodeOnFirstPositionIfListIsNotEmpty() {
        DoublyLinkedListNode actualHead = DoublyLinkedListNodeProblems.createDoublyLinkedList(Lists.list(10, 20, 30, 40, 50));
        DoublyLinkedListNode head = DoublyLinkedListNodeProblems.insertNode(actualHead, 10, 1);

        Assertions.assertNotEquals(DoublyLinkedListNodeProblems.getTotalNodes(head), DoublyLinkedListNodeProblems.getTotalNodes(actualHead));
    }

    @Test
    void shouldInsertDataInSortedListIfFirstElementIsGreaterThanData() {
        DoublyLinkedListNode head = DoublyLinkedListNodeProblems.createDoublyLinkedList(Lists.list(10, 20, 40, 50));
        DoublyLinkedListNode actualHead = DoublyLinkedListNodeProblems.insertNodeInSortedLinkedList(head, 5);

        Assertions.assertEquals("5 10 20 40 50", DoublyLinkedListNodeProblems.printNodeValues(actualHead));
    }

    @Test
    void shouldInsertDataInSortedListIfAddingAtLastPosition() {
        DoublyLinkedListNode head = DoublyLinkedListNodeProblems.createDoublyLinkedList(Lists.list(10, 20, 40, 50));
        DoublyLinkedListNode actualHead = DoublyLinkedListNodeProblems.insertNodeInSortedLinkedList(head, 55);

        Assertions.assertEquals("10 20 40 50 55", DoublyLinkedListNodeProblems.printNodeValues(actualHead));
    }

    @Test
    void shouldInsertDataInSortedListIfAddingAtMiddlePosition() {
        DoublyLinkedListNode head = DoublyLinkedListNodeProblems.createDoublyLinkedList(Lists.list(10, 20, 40, 50));
        DoublyLinkedListNode actualHead = DoublyLinkedListNodeProblems.insertNodeInSortedLinkedList(head, 30);

        Assertions.assertEquals("10 20 30 40 50", DoublyLinkedListNodeProblems.printNodeValues(actualHead));
    }

    @Test
    void shouldReverseTheList() {
        DoublyLinkedListNode head = DoublyLinkedListNodeProblems.createDoublyLinkedList(Lists.list(10, 20, 40, 50));
        DoublyLinkedListNode actualNode = DoublyLinkedListNodeProblems.reverseLinkedList(head);

        Assertions.assertEquals("50 40 20 10", DoublyLinkedListNodeProblems.printNodeValues(actualNode));
    }
}