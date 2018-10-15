package com.anshul.interviewmagnasoft;

public class EntryPoint {
  public static void main(String[] args) {

    SwapNElementsLinkedList obj = new SwapNElementsLinkedList();
    SwapNElementsLinkedList.Node listOfNElements = obj.createListOfNElements(5);

    obj.printLinkedList(listOfNElements);
    SwapNElementsLinkedList.Node reverse = obj.reverse(listOfNElements, 2);

    obj.printLinkedList(reverse);

  }
}
