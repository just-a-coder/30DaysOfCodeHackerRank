package com.pkg.linkedlist;

import java.util.HashSet;
import java.util.Set;

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

    public static Node removeDuplicates(Node head) {
        if (head == null) {
            return head;
        }
        Node curTemp = head;
        Node prevTemp = head;
        Set<Integer> hashSet = new HashSet<>();

        while (curTemp != null) {
            if (hashSet.contains(curTemp.data)) {
                prevTemp.next = curTemp.next;
            } else {
                hashSet.add(curTemp.data);
                prevTemp = curTemp;
            }
            curTemp = curTemp.next;
        }
        return head;
    }
}
