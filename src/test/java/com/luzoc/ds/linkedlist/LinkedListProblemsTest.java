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
        Assertions.assertEquals(30, LinkedListProblems.getValueOnSpecificLocation(head, 2));
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

    @Test
    void shouldReturnFalseIfLinkedListIsNotCyclic() {
        SinglyLinkedListNode head = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40, 50));
        Boolean isCyclic = LinkedListProblems.identifyCyclicLinkedList(head);

        Assertions.assertFalse(isCyclic);
    }

    @Test
    void shouldReturnTrueIfLinkedListIsCyclic() {
        SinglyLinkedListNode head = createAndGetCyclicLinkedList();
        Boolean isCyclic = LinkedListProblems.identifyCyclicLinkedList(head);

        Assertions.assertTrue(isCyclic);
    }

    SinglyLinkedListNode createAndGetCyclicLinkedList() {
        SinglyLinkedListNode head = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40, 50));
        SinglyLinkedListNode cur = head;
        SinglyLinkedListNode temp = head.next.next;
        do {
            if (cur.next == null) {
                cur.next = temp;
                break;
            }
            cur = cur.next;
        } while (true);
        return head;
    }
}