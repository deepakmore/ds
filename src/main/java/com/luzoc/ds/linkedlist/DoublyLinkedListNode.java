package com.luzoc.ds.linkedlist;


public class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    public DoublyLinkedListNode() { }

    public DoublyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
