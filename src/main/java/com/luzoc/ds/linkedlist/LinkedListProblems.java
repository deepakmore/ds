package com.luzoc.ds.linkedlist;

import java.util.*;

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

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }


    public static Integer getMergingPointInTwoLinkedList(SinglyLinkedListNode head, SinglyLinkedListNode head2) {
        //Space Complexity O(n) - Time Complexity O(n+m)
//        Set<SinglyLinkedListNode> values = new HashSet<>();
//
//        while (head != null) {
//            values.add(head);
//            head = head.next;
//        }
//
//        while (head2 != null) {
//            if(values.contains(head2)) {
//                return head2.data;
//            }
//            head2 = head2.next;
//        }
//        return -1;

        // Space Complexity O(1) - Time Complexity O(n)
        SinglyLinkedListNode a = head;
        SinglyLinkedListNode b = head2;

        while(a != b) {
            a = a == null? head2 : a.next;
            b = b == null? head : b.next;
        }
        return a == null? null : a.data;
    }

    public static SinglyLinkedListNode mergeTwoSortedLinkedList(SinglyLinkedListNode head, SinglyLinkedListNode head2) {
        if(head == null) return head2;
        if(head2 == null) return head;

        SinglyLinkedListNode l1 = head;
        SinglyLinkedListNode l2 = head2;

        if(l1.data > l2.data) {
            SinglyLinkedListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }

        SinglyLinkedListNode res = new SinglyLinkedListNode(l1.data);
        SinglyLinkedListNode itr = res;
        l1 = l1.next;

        while(l1!= null && l2 != null) {
            SinglyLinkedListNode temp = null;

            if(l1.data >= l2.data) {
                temp = new SinglyLinkedListNode(l2.data);
                itr.next = temp;
                itr = itr.next;
                l2 = l2.next;
            } else {
                temp = new SinglyLinkedListNode(l1.data);
                itr.next = temp;
                itr = itr.next;
                l1 = l1.next;
            }
        }

        itr.next = l1 == null ? l2 : l1;
        return res;
    }
}
