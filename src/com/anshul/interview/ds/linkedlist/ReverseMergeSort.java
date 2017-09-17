package com.anshul.interview.ds.linkedlist;

import com.anshul.interview.ds.LinkedList;
import sun.awt.image.ImageWatched;

public class ReverseMergeSort {
    public Node reverseMergeSort(Node l1, Node l2) {
        l1 = reverse(l1);
        System.out.println(" List one after reversal");
        new LinkedList().printList(l1);
        l2 = reverse(l2);
        System.out.println("List two after reversal");
        new LinkedList<Integer>().printList(l2);
        return merge(l1, l2);
    }

    private Node reverse(Node list) {
        if (list == null || list.next == null)
            return list;
        Node prev = null;
        while (list.next != null) {
            //securing list
            Node next = list.next;
            list.next = prev;
            //incrementing pointers
            prev = list;
            list = next;
        }
        list.next = prev;
        return list;
    }

    private Node merge(Node list1Head, Node list2Head) {

        if (list1Head == null || list2Head == null)
            return (list1Head == null) ? list2Head : list1Head;

        Node destHead = new Node(-1);
        Node destTail = destHead;
        while (true) {
            if (list1Head == null || list2Head == null)
                break;

            if ((int) list1Head.data > (int) list2Head.data) {
                //updating destination list
                destTail.next = list1Head;
                destTail = destTail.next;
                // incrementing list whoes element already entertained
                list1Head = list1Head.next;
                // after next element secure remove link
                destTail.next = null;

            } else {
                destTail.next = list2Head;
                destTail = destTail.next;
                // incrementing counter to remove current node
                list2Head = list2Head.next;

                destTail.next = null;
            }
        }
        destTail = (list1Head == null) ? (destTail.next = list2Head) : (destTail.next = list1Head);

        return destHead.next;
    }

    // Test invocation method
    public static void main(String[] args) {
        Node list1 = new Node<Integer>(1);
        list1.next = new Node<Integer>(8);
        list1.next.next = new Node<Integer>(11);
        list1.next.next.next = new Node<Integer>(13);
        list1.next.next.next.next = new Node<Integer>(14);
        list1.next.next.next.next.next = new Node<Integer>(19);
        list1.next.next.next.next.next.next = new Node<Integer>(26);
        list1.next.next.next.next.next.next.next = new Node<Integer>(27);
        list1.next.next.next.next.next.next.next.next = new Node<Integer>(28);

        Node list2 = new Node<Integer>(10);
        list2.next = new Node<Integer>(12);
        list2.next.next = new Node<Integer>(14);
        list2.next.next.next = new Node<Integer>(15);
        list2.next.next.next.next = new Node<Integer>(16);

        //     Node list = new MergeSortedLinkedList().mergeLists(list1, list2);
        //  Node list = new ReverseMergeSort().reverse(list1);
        //  new LinkedList().printList(list);

        Node list = new ReverseMergeSort().reverseMergeSort(list1, list2);
        System.out.println("List after merging");
        new LinkedList().printList(list);

    }
}
