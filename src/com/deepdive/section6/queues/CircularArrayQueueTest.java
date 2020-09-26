package com.deepdive.section6.queues;

import com.deepdive.section6.queues.vo.Employee;

public class CircularArrayQueueTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(123,"Ankush", "Manager", 2000);
        Employee e2 = new Employee(124,"Jahn", "Analyst", 2000);
        Employee e3 =new Employee(125,"Johny", "Developer", 2000);
        Employee e4 =new Employee(126,"Janardhan", "Treany", 2000);

        CircularArrayQueue queue = new CircularArrayQueue(10);
        System.out.println("Size : " + queue.size());
        queue.printQueue();

        // add operation
        queue.add(e1);
        queue.add(e2);
        queue.add(e3);
        queue.add(e4);
        System.out.println("Size : " + queue.size());
        queue.printQueue();

        // peek Operation
        System.out.println("Picked Item  : " + queue.peek());
        System.out.println("Size : " + queue.size());
        queue.printQueue();

        // remove Operation
        System.out.println("Removed Item  : " + queue.remove());
        System.out.println("Removed Item : " + queue.remove());

        System.out.println("Size : " + queue.size());
        queue.printQueue();
    }
}
