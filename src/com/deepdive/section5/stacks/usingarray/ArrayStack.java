package com.deepdive.section5.stacks.usingarray;


import com.deepdive.section5.stacks.vo.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack ;
    private int top; // point to next available location

    //Constructor to initialize backing Array
    public ArrayStack(int capacity){
        this.stack = new Employee[capacity];
    }

    // Operations Push, Pop and Peek

    public void push(Employee employee){
        //Check if stack is already full
        if(top == stack.length){
            //Create new Array , Copy the stack elements and assign it to stack
            Employee[] newArray = new Employee[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }

    public Employee pop(){
        //check if stack is Empty
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee emp = stack[--top];
        stack[top] = null;
        return emp;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public Employee peek(){
        //check if stack is Empty
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public int stackSize(){
        return top;
    }

    public void printStack(){
        for (int i = top - 1; i >= 0 ; i--) {
            System.out.println(stack[i]);
        }
    }
}
