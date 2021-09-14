package com.deepdive.section5.stacks.usinglinkedlist;

import com.deepdive.section5.stacks.vo.Employee;

public class LinkedStackTest {

    public static void main(String[] args) {

        Employee e1 = new Employee(123,"Ankush", "Manager", 2000);
        Employee e2 = new Employee(124,"Jahn", "Analyst", 2000);
        Employee e3 =new Employee(125,"Johny", "Developer", 2000);
        Employee e4 =new Employee(126,"Janardhan", "Treany", 2000);

        LinkedStack stack = new LinkedStack();
        System.out.println("Size : " + stack.stackSize());
        stack.printStack();

        // push operation
        stack.push(e1);
        stack.push(e2);
        stack.push(e3);
        stack.push(e4);
        System.out.println("Size : " + stack.stackSize());
        stack.printStack();

        // peek Operation
        System.out.println("Picked Item  : " + stack.peek());
        System.out.println("Size : " + stack.stackSize());
        stack.printStack();

        // pop Operation
        System.out.println("Popped Item  : " + stack.pop());
        System.out.println("Popped Item : " + stack.pop());
        System.out.println("Popped Item : " + stack.pop());
        System.out.println("Popped Item : " + stack.pop());
        System.out.println("Size : " + stack.stackSize());
        stack.printStack();

    }
}
