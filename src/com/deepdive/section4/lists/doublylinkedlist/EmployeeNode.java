package com.deepdive.section4.lists.doublylinkedlist;

import com.deepdive.section4.lists.vo.Employee;

import java.util.Objects;

public class EmployeeNode {
    EmployeeNode previous;
    Employee emp;
    EmployeeNode next;

    //constructor
    public EmployeeNode(Employee emp) {
        this.emp = emp;
    }
    // getters and setters

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    //toString
    @Override
    public String toString() {
        return  emp.toString();
    }
    //Equals and hash code

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeNode)) return false;
        EmployeeNode node = (EmployeeNode) o;
        return getEmp().equals( node.getEmp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmp());
    }
}
