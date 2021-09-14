package com.deepdive.section4.lists.singlylinkedlist;

import com.deepdive.section4.lists.vo.Employee;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(123,"Ankush", "Manager", 2000);
        Employee e2 = new Employee(124,"Jahn", "Analyst", 2000);
        Employee e3 =new Employee(125,"Johny", "Developer", 2000);
        Employee e4 =new Employee(126,"Janardhan", "Treany", 2000);

        EmployeeLinkedList linkedList = new EmployeeLinkedList();
        linkedList.addToFront(e1);
        linkedList.addToFront(e2);
        linkedList.addToFront(e3);
        linkedList.addToFront(e4);

        linkedList.displayLinkedList();
        System.out.println("Size : " + linkedList.getSize());

        System.out.println(linkedList.removeFromFront());
        linkedList.displayLinkedList();
        System.out.println("Size : " + linkedList.getSize());
    }
}
