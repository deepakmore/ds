package com.luzoc.ds.linkedlist;

import net.bytebuddy.dynamic.scaffold.MethodGraph;
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
    void shouldRemoveDuplicateValuesFromSortedLinkedList() {
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

    @Test
    void shouldFindMergingPoint() {
        SinglyLinkedListNode head = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40, 50));
        SinglyLinkedListNode head2 = createAndGetMergingLinkedList(head);

        Integer value = LinkedListProblems.getMergingPointInTwoLinkedList(head, head2);

        Assertions.assertEquals(30, value);
    }

    @Test
    void shouldReturnNullIfThereIsNoMergingNode() {
        SinglyLinkedListNode head = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40, 50));
        SinglyLinkedListNode head2 = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40, 50));

        Integer mergingPointInTwoLinkedList = LinkedListProblems.getMergingPointInTwoLinkedList(head, head2);

        Assertions.assertNull(mergingPointInTwoLinkedList);
    }

    @Test
    void shouldReturnFilledLinkedListInCaseOfEmptyList() {
        SinglyLinkedListNode head = LinkedListProblems.insertNode(Lists.list(10, 20, 30, 40, 50));
        SinglyLinkedListNode newHead = LinkedListProblems.mergeTwoSortedLinkedList(head, null);
        Assertions.assertEquals(newHead, head);

        SinglyLinkedListNode head2 =  LinkedListProblems.insertNode(Lists.list(1, 2, 3, 35, 45));
        newHead = LinkedListProblems.mergeTwoSortedLinkedList(null, head2);
        Assertions.assertEquals(newHead, head2);
    }

    private SinglyLinkedListNode createAndGetMergingLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode head2 = LinkedListProblems.insertNode(Lists.list(90, 100));
        head2.next.next = head.next.next;
        return head2;
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