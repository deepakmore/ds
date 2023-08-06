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

    @Test
    void shouldReverseLinkedListAndGetNodeValueFromTail() {
        SinglyLinkedListNode head = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40, 50));
        SinglyLinkedListNode newHead = LinkedListProblems.reverseLinkedList(head);
        LinkedListProblems.print(newHead);

        Assertions.assertEquals(50, LinkedListProblems.getValueOnSpecificLocation(newHead,0 ));
        Assertions.assertEquals(40, LinkedListProblems.getValueOnSpecificLocation(newHead, 1));
    }

    @Test
    void shouldRemoveDuplicateValuesFromTheAscendingLinkedList() {
        SinglyLinkedListNode head = LinkedListProblems.insertNode(Lists.list(10, 10, 20, 20, 20, 30, 30, 30, 30, 30, 40, 50, 50));
        SinglyLinkedListNode newHead = LinkedListProblems.removeDuplicatesFromSortedLinkedList(head);

        LinkedListProblems.print(newHead);
        Assertions.assertEquals(5, LinkedListProblems.getTotalNodes(newHead));

    }
}