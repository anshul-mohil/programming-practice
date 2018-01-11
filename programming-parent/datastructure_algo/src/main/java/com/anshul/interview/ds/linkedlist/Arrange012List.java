package com.anshul.interview.ds.linkedlist;

import com.anshul.interview.ds.AlternateHighLowLL;
import com.anshul.interview.ds.LinkedList;

public class Arrange012List {
    public Node arrangeList(Node head) {
        //if empty or only 1 element no need to arrange
        if (head == null || head.next == null)
            return head;

        Node zeroHead = null, oneHead = null, twoHead = null;
        Node zeroTail = null, oneTail = null, twoTail = null;
        Node curr = null;
        Node list = head;

        while (list != null) {
            curr = list;
            list = list.next;
            curr.next = null;

            if ((int) curr.data == 0) {
                //entring elements first time;
                if (zeroHead == null) {
                    zeroHead = curr;
                    zeroTail = curr;
                } else {
                    // insert at tail of the list
                    zeroTail.next = curr;
                    zeroTail = zeroTail.next;
                }
            } else if ((int) curr.data == 1) {
                //entring elements first time;
                if (oneHead == null) {
                    oneHead = curr;
                    oneTail = curr;
                } else {
                    // insert at tail of the list
                    oneTail.next = curr;
                    oneTail = oneTail.next;
                }
            } else if ((int) curr.data == 2) {
                //entring elements first time;
                if (twoHead == null) {
                    twoHead = curr;
                    twoTail = curr;
                } else {
                    // insert at tail of the list
                    twoTail.next = curr;
                    twoTail = twoTail.next;
                }
            }

        }
        Node tailJoiner = (oneHead == null) ? twoHead : (oneTail.next = twoHead);
        tailJoiner = (zeroHead == null) ? tailJoiner : (zeroTail.next = (oneHead == null) ? twoHead : oneHead);
        Node result = (zeroHead == null) ? ((oneHead == null) ? twoHead : oneHead) : zeroHead;
        return result;
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        llist.push(0);
        llist.push(1);
        llist.push(0);


        System.out.println("original list");
        llist.printList();

        Node newHead = new Arrange012List().arrangeList(llist.head);

        System.out.println("List after alternating list of elements");
        llist.printList(newHead);
    }
}
