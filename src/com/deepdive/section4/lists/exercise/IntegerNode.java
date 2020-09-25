package com.deepdive.section4.lists.exercise;

import java.util.Objects;

public class IntegerNode {
    int data;
    IntegerNode next;

    public IntegerNode(int data) {
        this.data = data;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return  data+"" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerNode)) return false;
        IntegerNode that = (IntegerNode) o;
        return data == that.data;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
