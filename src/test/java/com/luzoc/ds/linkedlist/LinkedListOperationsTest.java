package com.luzoc.ds.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LinkedListOperationsTest {

    @BeforeEach
    void setUp() {
        LinkedListOperations.head = null;
    }

    @Test
    void shouldInsertInLinkedList() {
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(10));
        Assertions.assertNotNull(LinkedListOperations.head);
        Assertions.assertEquals(1, LinkedListOperations.getTotalNodes());
        Assertions.assertEquals(10, LinkedListOperations.getLastNodeValue());
    }

    @Test
    void shouldInsertTwoNodesInLinkedList() {
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(10));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(20));
        Assertions.assertEquals(2, LinkedListOperations.getTotalNodes());
        Assertions.assertEquals(20, LinkedListOperations.getLastNodeValue());
    }

    @Test
    void shouldInsertNodeOnFirstPosition() {
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(10));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(20));

        LinkedListOperations.insertNodeAtFirst(new SinglyLinkedListNode(5));

        Assertions.assertEquals(3, LinkedListOperations.getTotalNodes());
        Assertions.assertEquals(5, LinkedListOperations.getFirstNodeValue());
    }

    @Test
    void shouldInsertNodeOnSpecificPosition() {
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(10));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(20));

        LinkedListOperations.insertNodeAtSpecificPosition(new SinglyLinkedListNode(15), 2);

        LinkedListOperations.print();
        Assertions.assertEquals(15, LinkedListOperations.getSpecificNodeValue(2));
        Assertions.assertEquals(3, LinkedListOperations.getTotalNodes());
    }

    @Test
    void shouldReturnNullIfListIsEmpty() {
        Assertions.assertNull(LinkedListOperations.deleteNode(2));
    }

    @Test
    void shouldReturnNullIfRemovedFirstElement() {
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(10));
        Assertions.assertNull(LinkedListOperations.deleteNode(1));
    }

    @Test
    void shouldReturnNullIfPositionIsGreaterThanListLength() {
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(10));
        Assertions.assertNull(LinkedListOperations.deleteNode(5));
    }

    @Test
    void shouldReturnIfFirstNodeDeleted() {
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(10));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(20));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(30));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(40));

        Assertions.assertEquals(4, LinkedListOperations.getTotalNodes());

        LinkedListOperations.deleteNode(0);

        Assertions.assertEquals(3, LinkedListOperations.getTotalNodes());
        LinkedListOperations.print();
        Assertions.assertEquals(20, LinkedListOperations.getFirstNodeValue());

    }

    @Test
    void shouldReturnIfSpecificPositionNodeDeleted() {
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(10));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(20));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(30));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(40));

        Assertions.assertEquals(4, LinkedListOperations.getTotalNodes());

        LinkedListOperations.deleteNode(1);

        Assertions.assertEquals(3, LinkedListOperations.getTotalNodes());
        LinkedListOperations.print();
        Assertions.assertEquals(30, LinkedListOperations.getSpecificNodeValue(2));
    }

    @Test
    void shouldPrintReverseList() {
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(10));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(20));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(30));
        LinkedListOperations.insertNodeAtLast(new SinglyLinkedListNode(40));

        LinkedListOperations.print();
        LinkedListOperations.reversePrint();
    }
}