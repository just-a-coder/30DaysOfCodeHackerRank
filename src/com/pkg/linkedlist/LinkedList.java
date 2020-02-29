package com.pkg.linkedlist;

public class LinkedList {
    public static  Node insert(Node head,int data) {

        Node nd = new Node(data);
        if (head == null) {
           head = nd;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nd;
            nd.next = null;
        }
        return head;
    }
}
