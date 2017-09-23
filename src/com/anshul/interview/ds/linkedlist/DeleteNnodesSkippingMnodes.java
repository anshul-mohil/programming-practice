package com.anshul.interview.ds.linkedlist;

import com.anshul.interview.ds.LinkedList;

public class DeleteNnodesSkippingMnodes {

    public Node deleteNnodesSkippingMnodes(Node node, int skipNodes, int deleteNodes) {
        if (node == null || deleteNodes == 0)
            return node;
        Node curr = node;
        while (curr != null) {
            //skipNodes
            int sNodes = skipNodes;
            int dNodes = deleteNodes;
            while (--sNodes != 0) {
                if (curr == null)
                    return node;
                curr = curr.next;
            }
            Node catchPointer = curr;
            // securing rest of the list
            curr = (curr == null) ? null : curr.next;
            if (curr == null)
                return node;
            //if delete Nodes > 0
            // it creates a disconnect with rest of the linkedlist
            if (dNodes > 0)
                catchPointer.next = null;

            while (dNodes-- != 0) {
                if (curr == null) {
                    return node;
                }
                curr = curr.next;
            }
            // list remaining after deletion
            catchPointer.next = curr;
        }
        return node;
    }

    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        llist.push(0);
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(6);
        llist.push(7);
        llist.push(8);
        llist.push(9);
        llist.push(10);
        llist.push(11);
        llist.push(12);
        llist.push(13);


        System.out.println("original list");
        llist.printList();

        int skipNode = 3;
        int deleteNode = 1;
        Node newHead = new DeleteNnodesSkippingMnodes().deleteNnodesSkippingMnodes(llist.head, skipNode, deleteNode);

        System.out.println("List after alternating list of elements");
        llist.printList(newHead);
    }
}
