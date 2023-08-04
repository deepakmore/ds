package com.luzoc.ds.linkedlist;

public class LinkedListOperations {
    static SinglyLinkedListNode head = null;

    public static void insertNodeAtFirst(SinglyLinkedListNode nodeToInsert) {
        if(head != null)
            nodeToInsert.next = head;
        head = nodeToInsert;
    }

    public static void insertNodeAtLast(SinglyLinkedListNode nodeToInsert) {
        if(head == null)
            head = nodeToInsert;
        else {
            SinglyLinkedListNode node = head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = nodeToInsert;
        }
    }

    public static void insertNodeAtSpecificPosition(SinglyLinkedListNode nodeToInsert, int position) {
        if(head == null) {
            head = nodeToInsert;
            return;
        }
        int counter = 1;

        SinglyLinkedListNode node = head;
        while(node != null) {
            if(counter == position - 1) {
                nodeToInsert.next = node.next;
                node.next = nodeToInsert;
                return;
            }
            node = node.next;
            counter ++;
        }
    }

    public static SinglyLinkedListNode deleteNode(int position) {
        if(head == null || (head.next == null && position == 0)) return null;
        if(position == 0) {
            head = head.next;
            return head;
        }
        int counter = 0;
        SinglyLinkedListNode forward = head.next;
        SinglyLinkedListNode backward = head;

        while(forward != null) {

            if(counter == position - 1) {
                backward.next = forward.next;
                forward.next = null;
                return head;
            }
            forward = forward.next;
            backward = backward.next;
            counter ++;
        }
        return null;
    }

    public static void print() {
        SinglyLinkedListNode node = head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static int getTotalNodes() {
        SinglyLinkedListNode node = head;
        int counter = 0;
        while(node != null) {
            counter ++;
            node = node.next;
        }
        return counter;
    }

    public static int getLastNodeValue() {
        if(head == null) return 0;

        SinglyLinkedListNode node = head;
        while(node.next != null) {
            node = node.next;
        }
        return node.data;
    }

    public static int getFirstNodeValue() {
        if(head == null) return 0;
        return head.data;
    }

    public static int getSpecificNodeValue(int position) {
        if(head == null) return 0;
        int counter = 1;
        SinglyLinkedListNode node = head;
        while(node != null) {
            if(counter == position) return node.data;
            node = node.next;
            counter ++;
        }
        return 0;
    }
}