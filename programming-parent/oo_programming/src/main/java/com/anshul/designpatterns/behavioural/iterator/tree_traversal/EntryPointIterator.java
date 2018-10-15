package com.anshul.designpatterns.behavioural.iterator.tree_traversal;

public class EntryPointIterator {

  public static void main(String[] args) {


//        100
//    80         120
//40      90  110    130

    Node n1 = new Node(100);
    Node n2 = n1.left = new Node(80);
    Node n3 = n2.left = new Node(40);

    Node n4 = n2.right = new Node(90);
    Node n5 = n1.right = new Node(120);
    Node n6 = n5.right = new Node(130);
    Node n7 = n5.left = new Node(110);


    PrefixTreeTraversalImpl<Node> prefixTreeTraversal = new PrefixTreeTraversalImpl<>();
    prefixTreeTraversal.pushAll(n1);
    TreeIterator iterator = prefixTreeTraversal.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }


  }
}
