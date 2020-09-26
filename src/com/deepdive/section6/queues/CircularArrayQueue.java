package com.deepdive.section6.queues;

import com.deepdive.section6.queues.vo.Employee;

import java.util.NoSuchElementException;

public class CircularArrayQueue {
    private Employee[] queue ;
    private int front ;
    private int back ;

    public CircularArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    // Operations
    public int size(){
        return front <= back ? back - front : back - front + queue.length;
    }

    public void add(Employee employee){
        //check if Queue is full
        if(size() == queue.length - 1 ){
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue,front,newArray,0,queue.length - front);
            System.arraycopy(queue,0,newArray,queue.length - front,back);

            queue = newArray;
            front = 0;
            back = size();
        }
        queue[back++] = employee;
    }

    public Employee remove(){
        //check queue is Empty
        if(size() == 0){
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front++] = null;
        //check if only one item was in queue and now queue is Empty
        if(size() == 0){
            front = 0;
            back = 0;
        }else if(front == queue.length){ // removed element was last element
            front =0;
        }
        return employee;
    }

    public Employee peek(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public void printQueue(){
        if(front <= back){
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }

}
