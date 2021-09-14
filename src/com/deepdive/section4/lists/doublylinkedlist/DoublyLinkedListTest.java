package com.deepdive.section4.lists.doublylinkedlist;

import com.deepdive.section4.lists.vo.Employee;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(123,"Ankush", "Manager", 2000);
        Employee e2 = new Employee(124,"John", "Analyst", 2000);
        Employee e3 =new Employee(125,"Johny", "Developer", 2000);
        Employee e4 =new Employee(126,"Janardhan", "Treany", 2000);

        EmployeeLinkedList linkedList = new EmployeeLinkedList();
        // display the list
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());
        //add to front
        linkedList.addToFront(e1);
        linkedList.addToFront(e4);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());
        //add to End
        linkedList.addToEnd(e2);
        linkedList.addToEnd(e3);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());

        //remove from head
        System.out.println("Removed Node : " + linkedList.removeFromFront());
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());
        //remove from end
        System.out.println("Removed Node : " + linkedList.removeFromEnd());
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());

        // addBefore
        linkedList.addBefore(e3, e1);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());

        // addBefore
        linkedList.addBefore(e4, e2);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());

        // addAfter
        linkedList.addAfter(e1, e2);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());

        // addAfter
        linkedList.addAfter(e3, e4);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());
    }
}
