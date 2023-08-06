package com.luzoc.ds.linkedlist;

import java.util.List;
import java.util.Objects;

public class LinkedListProblems {

    public static SinglyLinkedListNode insertNode(List<Integer> list) {
        SinglyLinkedListNode head = new SinglyLinkedListNode(list.get(0));
        SinglyLinkedListNode node = head;

        for (int i = 1; i < list.size(); i++) {
            node.next = new SinglyLinkedListNode(list.get(i));
            node = node.next;
        }
        return head;
    }

    public static void print(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static Integer getValueOnSpecificLocation(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode node = head;
        int counter = 0;
        while(node != null) {
            if(counter == position) {
                return node.data;
            }
            node = node.next;
            counter ++;
        }
        return null;
    }

    public static boolean compareLinkedLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        return (head1 == head2);
    }

    public static SinglyLinkedListNode reverseLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode cur = head;
        SinglyLinkedListNode prev = null;

        while (cur != null) {
            SinglyLinkedListNode temp = cur.next;

            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }

    public static SinglyLinkedListNode removeDuplicatesFromSortedLinkedList(SinglyLinkedListNode head) {
        if(head == null || head.next == null) return head;

        SinglyLinkedListNode cur = head.next;
        SinglyLinkedListNode prev = head;

        while(cur != null) {
            if (prev.data != cur.data) {
                prev.next = cur;
                prev = cur;
            }
            cur = cur.next;
        }
        prev.next = null;
        return head;
    }

    public static int getTotalNodes(SinglyLinkedListNode head) {
        int counter = 0;
        while (head != null) {
            counter ++;
            head = head.next;
        }
        return counter;
    }

    public static Boolean identifyCyclicLinkedList(SinglyLinkedListNode head) {

        SinglyLinkedListNode cur = head;
        SinglyLinkedListNode forward = head;

        while (forward != null && forward.next != null) {
            cur = cur.next;
            forward = forward.next.next;
            if(cur == forward) return true;
        }

        return false;
    }
}
