package com.deepdive.section4.lists.doublylinkedlist;

import com.deepdive.section4.lists.vo.Employee;

public class EmployeeLinkedList {
    EmployeeNode head;
    EmployeeNode tail;
    int size;

    //getters and setters

    public EmployeeNode getHead() {
        return head;
    }

    public void setHead(EmployeeNode head) {
        this.head = head;
    }

    public EmployeeNode getTail() {
        return tail;
    }

    public void setTail(EmployeeNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    // Operations: addTOFront(), addToEnd(), removeFromFront(), removeFromEnd(), addBetweenNodes(),
    // removeBetweenNodes(), addBefore(), addAfter(), display(), isEmpty()

    public void displayList() {
        System.out.print("HEAD->");
        EmployeeNode currentNode = getHead();
        while (currentNode != null) {
            System.out.print(currentNode);
            System.out.print("<==>");
            currentNode = currentNode.getNext();
        }
        System.out.print("TAIL");
    }

    public boolean isEmpty() {
        return getHead() == null;
    }

    // addToFront
    public void addToFront(Employee emp) {
        EmployeeNode node = new EmployeeNode(emp);
        // check if list is Empty , adding first element
        if (isEmpty()) {
            tail = node;
        } else {
            node.setNext(head);
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    // addToEnd
    public void addToEnd(Employee emp) {
        EmployeeNode node = new EmployeeNode(emp);
        //check if List is Empty , add as first item
        if (this.isEmpty()) {
            head = node;
        } else {
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    //removeFromFront
    public EmployeeNode removeFromFront() {
        //1.check if list is Empty, return null
        //2.check if list contains only one item, return the item and make head and tail as null
        //3. else remove first node and set previous and next accordingly

        if (isEmpty()) return null;

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    //removeFromEnd
    public EmployeeNode removeFromEnd() {
        // check if list is empty
        if (isEmpty()) return null;
        //assign tail to removedNode
        EmployeeNode removedNode = tail;

        //check if list have only single element
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    // add before
    public void addBefore(Employee srcEmp, Employee trgtEmp) {
        //check if list is Empty
        if (isEmpty()) {
            System.err.println("List Is Empty!!!");
            return;
        }
        //search for the targetNode if returns null means search item is not found
        EmployeeNode targetNode = searchNode(trgtEmp);
        if (targetNode == null) {
            System.err.println("Target item is not Found in List !!!");
            System.err.println("Target Item : " + trgtEmp);
        } else {
            EmployeeNode srcNode = new EmployeeNode(srcEmp);
            //check if need to add as first node
            if (targetNode.getPrevious() == null) {
                head = srcNode;
            } else {
                //set links for src Node
                srcNode.setPrevious(targetNode.getPrevious());
                targetNode.getPrevious().setNext(srcNode);
            }
            srcNode.setNext(targetNode);
            targetNode.setPrevious(srcNode);
            size++;
        }


    }

    public EmployeeNode searchNode(Employee emp) {
        EmployeeNode node = new EmployeeNode(emp);
        // Traverse the list and compare
        EmployeeNode currentNode = head;
        while (currentNode != null && !currentNode.equals(node)) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void addAfter(Employee srcEmp, Employee trgtEmp) {
        //check if list is Empty
        if (isEmpty()) {
            System.err.println("List Is Empty!!!");
            return;
        }
        //search for the targetNode if returns null means search item is not found
        EmployeeNode targetNode = searchNode(trgtEmp);
        if (targetNode == null) {
            System.err.println("Target item is not Found in List !!!");
            System.err.println("Target Item : " + trgtEmp);
        } else {
            EmployeeNode srcNode = new EmployeeNode(srcEmp);
            //check if node need to add as last node
            if (targetNode.getNext() == null) {
                tail = srcNode;
            } else {
                //set links for src Node
                srcNode.setPrevious(targetNode);
                targetNode.getNext().setPrevious(srcNode);
            }
            srcNode.setNext(targetNode.getNext());
            targetNode.setNext(srcNode);
            size++;
        }


    }

}
