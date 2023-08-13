package com.luzoc.ds.linkedlist;

import java.util.List;

public class DoublyLinkedListNodeProblems {

    public static DoublyLinkedListNode insertNode(DoublyLinkedListNode actualHead, int data, int position) {
        if(actualHead == null)
            return new DoublyLinkedListNode(data);
        return null;
    }

    public static DoublyLinkedListNode createDoublyLinkedList(List<Integer> numbers) {

        DoublyLinkedListNode head = numbers.size() != 0? new DoublyLinkedListNode(numbers.get(0)) : null;
        DoublyLinkedListNode cur = head;

        for (int i = 1; i < numbers.size(); i++) {
            DoublyLinkedListNode temp = new DoublyLinkedListNode(numbers.get(i));
            cur.next = temp;
            temp.prev = cur;
            cur = temp;
        }
        return head;
    }

    public static int getTotalNodes(DoublyLinkedListNode actualHead) {
        int counter = 0;
        while (actualHead != null) {
            counter ++;
            actualHead = actualHead.next;
        }
        return counter;
    }

    public static DoublyLinkedListNode insertNodeInSortedLinkedList(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode cur = head;
        DoublyLinkedListNode prev = null;
        DoublyLinkedListNode temp = new DoublyLinkedListNode(data);

        if(cur == null)
             return new DoublyLinkedListNode(data);
        while(cur != null) {
            if(cur.data >= data) {
                // First Position
                temp.next = cur;
                cur.prev = temp;

                if(prev == null) {
                    head = temp;
                } else {
                    temp.prev = prev;
                    prev.next = temp;
                }
                return head;
            }
            prev = cur;
            cur = cur.next;
        }

        // Last position
        prev.next = temp;
        temp.prev = prev;

        return head;
    }

    public static String printNodeValues(DoublyLinkedListNode head) {
        DoublyLinkedListNode cur = head;
        StringBuilder builder = new StringBuilder();
        while(cur != null) {
            builder.append(cur.data).append(" ");
            cur = cur.next;

        }
        return builder.toString().trim();
    }

    public static DoublyLinkedListNode reverseLinkedList(DoublyLinkedListNode head) {
       if(head.next == null && head.prev == null) return head;

       DoublyLinkedListNode cur = head;
       DoublyLinkedListNode prev = null;

       while (cur != null) {
           DoublyLinkedListNode temp = cur;
           cur = cur.next;
           temp.next = prev;
           temp.prev = cur;
           prev = temp;
       }
       return prev;
    }
}
