package com.luzoc.ds.linkedlist;

import java.util.List;

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
        int counter = 1;
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
}
