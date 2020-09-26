package com.deepdive.section6.queues;

import com.deepdive.section6.queues.vo.Employee;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue ;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    // Operations add, remove, peek, size, and printQueue

    public void add(Employee employee){
        //check if Queue is full
        if(back == queue.length){
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue,front,newArray,front,size());
            queue = newArray;
        }
        queue[back++] = employee;
    }

    public Employee remove(){
        //check if queue is empty
        if(size() == 0){
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front ++] = null;

        //check if removed only one item
        if(size() == 0){
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek(){
        //check if queue is Empty
        if (size() == 0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public void printQueue(){
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

    public int size() {
        return back - front;
    }


}
