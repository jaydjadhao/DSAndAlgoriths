package com.deepdive.section4.lists.exercise;

public class IntegerLinkedList {
    IntegerNode head;
    int size;

    public IntegerNode getHead() {
        return head;
    }

    public void setHead(IntegerNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //toString


    @Override
    public String toString() {
        return head.toString();
    }

    // display the List
    public void displayList() {
        System.out.print("HEAD->");
        IntegerNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode + "->");
            currentNode = currentNode.getNext();
        }
        System.out.print("null \n");
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Add Element in Ascending Order
    public void addInAscOrder(int element) {
        IntegerNode node = new IntegerNode(element);
        IntegerNode curNode = head;
        //get the position to insert in list
        IntegerNode prvNode = null;
        //get the Node more than element so we can insert as previous node
        while (curNode != null && curNode.data < node.data) {
            prvNode = curNode;
            curNode = curNode.getNext();
        }
        if (prvNode == null) {
            addToFront(node);
        } else {
            addAfter(node, prvNode);
        }
        size++;
    }


    public void addToFront(IntegerNode node) {
        //check if list is empty
        if (!isEmpty()) {
            node.setNext(head);
        }
        head = node;
    }

    public void addAfter(IntegerNode srcNode, IntegerNode trgNode) {
        //adding element to the end
        if (trgNode.getNext() != null) {
            srcNode.setNext(trgNode.getNext());
        }
        trgNode.setNext(srcNode);
    }

}
