package com.deepdive.section4.lists.exercise;

public class IntegerLinkedListTest {
    public static void main(String[] args) {
        IntegerLinkedList linkedList = new IntegerLinkedList();

        linkedList.addInAscOrder(4);
        linkedList.addInAscOrder(2);
        linkedList.addInAscOrder(1);
        linkedList.addInAscOrder(5);


        linkedList.displayList();
        System.out.println(linkedList.getSize());

    }
}
