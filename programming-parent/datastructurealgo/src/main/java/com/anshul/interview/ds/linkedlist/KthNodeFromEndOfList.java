package com.anshul.interview.ds.linkedlist;

public class KthNodeFromEndOfList {
    Node kthNodeFromEnd(Node head, int kthNode) {
        Node tailPointer = head;
        Node secPointer = head;
        if (head == null)
            return null;
        while (kthNode-- != 0 && tailPointer != null) {
            tailPointer = tailPointer.next;
        }
        if (tailPointer == null)
            return null;
        while (tailPointer != null) {
            tailPointer = tailPointer.next;
            secPointer = secPointer.next;
        }
        return secPointer;
    }

    public static void main(String[] args) {
        KthNodeFromEndOfList obj = new KthNodeFromEndOfList();

        Node list1 = obj.createLinkedList1();
        Node retreivedNode = obj.kthNodeFromEnd(list1, 3);
        System.out.println(retreivedNode.data);
    }

    private Node createLinkedList1() {
        Node list1 = new Node<Integer>(1);
        list1.next = new Node<Integer>(8);
        list1.next.next = new Node<Integer>(11);
        list1.next.next.next = new Node<Integer>(13);
        list1.next.next.next.next = new Node<Integer>(14);
        list1.next.next.next.next.next = new Node<Integer>(19);
        list1.next.next.next.next.next.next = new Node<Integer>(26);
        list1.next.next.next.next.next.next.next = new Node<Integer>(27);
        list1.next.next.next.next.next.next.next.next = new Node<Integer>(28);
        return list1;
    }
}
