package com.luzoc.ds.linkedlist;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LinkedListProblemsTest {

    @Test
    void shouldInsertRecords() {
        SinglyLinkedListNode head = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40, 50));
        LinkedListProblems.print(head);
        Assertions.assertEquals(30, LinkedListProblems.getValueOnSpecificLocation(head, 3));
    }

    @Test
    void shouldCompareTwoLinkedList() {
        SinglyLinkedListNode head1 = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40, 50));
        SinglyLinkedListNode head2 = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40, 50));
        SinglyLinkedListNode head3 = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40));

        Assertions.assertTrue(LinkedListProblems.compareLinkedLists(head1, head2));
        Assertions.assertFalse(LinkedListProblems.compareLinkedLists(head1, head3));
    }
}