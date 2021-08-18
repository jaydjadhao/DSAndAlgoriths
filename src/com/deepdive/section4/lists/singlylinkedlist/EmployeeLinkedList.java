package com.deepdive.section4.lists.singlylinkedlist;

import com.deepdive.section4.lists.vo.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public EmployeeNode getHead() {
        return head;
    }

    public void setHead(EmployeeNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return head.toString();
    }

    // methods
    public void addToFront(Employee emp){
        EmployeeNode node = new EmployeeNode(emp);
        node.setNext(head);
        setHead(node);
        size ++;
    }

    public boolean isEmpty(){
        return getHead() == null;
    }

    public EmployeeNode removeFromFront(){
        // check if Linked List is Empty
        if(isEmpty()) return null;

        EmployeeNode removedNode = getHead();
        setHead(getHead().getNext());
        size --;
        removedNode.setNext(null);
        return removedNode;
    }

    // show all elements of the Linked List
    public void displayLinkedList(){
        EmployeeNode currentNode = getHead();
        System.out.print("Head -> ");
        while (currentNode != null){
            System.out.print(currentNode);
            System.out.print(" -> ");
            currentNode = currentNode.getNext();
        }
        System.out.print(" null \n");

    }

}
