package com.anshul.interviewmagnasoft;


public class SwapNElementsLinkedList {

  private int size;

  public static void printLinkedList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
    System.out.println();
  }

  /**
   * @param head head of the linkedlist
   * @param k    number of elements to reverse
   * @return reversed link list
   */
  public Node reverse(Node head, int k) {

    Node current = head;
    Node next = null;
    Node prev = null;

    if (k > size || k <= 1) {
      return head;
    }
    int counter = 0;
    // reverse a linkedlist algo with addtional
    // condition (reverse only k elements)
    while (current != null && counter < k) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
      counter++;
    }

    // this part is for recursively calling same method
    // to reverse entire linkedlist
    if (next != null) {
      head.next = reverse(next, k);
    }
    // after recursion current & next would be null so prev will
    // be next;
    return prev;
  }

  public Node createListOfNElements(int n) {
    Node dummyNode = new Node(0, null);
    Node curr = dummyNode;
    for (int i = 1; i <= n; i++) {
      curr.next = new Node(i, null);
      curr = curr.next;
    }
    this.size = n;
    return dummyNode.next;
  }

  /**
   * Node of a linkedlist
   */
  class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }

  }
}
