package com.deepdive.section4.lists.exercise;

import com.deepdive.section4.lists.doublylinkedlist.EmployeeLinkedList;
import com.deepdive.section4.lists.vo.Employee;

public class AddBeforeDoublyLinkedList {
    public static void main(String[] args) {
        Employee e1 = new Employee(123,"Ankush", "Manager", 2000);
        Employee e2 = new Employee(124,"John", "Analyst", 2000);
        Employee e3 =new Employee(125,"Johny", "Developer", 2000);
        Employee e4 =new Employee(126,"Janardhan", "Treany", 2000);

        EmployeeLinkedList linkedList = new EmployeeLinkedList();
        linkedList.addBefore(e1,e2);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());

        linkedList.addToFront(e1);
        linkedList.addBefore(e2,e3);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());

        linkedList.addBefore(e2,e1);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());

        linkedList.addBefore(e3,e1);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());

        linkedList.addBefore(e4,e3);
        linkedList.displayList();
        System.out.println("\nSize : " + linkedList.getSize());
    }
}
