package com.deepdive.section9.Trees;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    // constructor
    public TreeNode(int data) {
        this.data = data;
    }
    //operations

    public void insert(int value){
        // if value is duplicate
        if(data == value) return;

        // check in left subtree
        if (value < data){
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            }else {
                leftChild.insert(value);
            }
        }else {
            //check in Right Subtree
            if (rightChild == null){
                rightChild = new TreeNode(value);
            }else {
                rightChild.insert(value);
            }
        }
    }

    public TreeNode get(int value){
        if (data == value) return this;

        //check in left subtree
        if (value < data){
            if (leftChild != null) {
                return leftChild.get(value);
            }
        }else {
            //check in Right subtree
            if (rightChild != null){
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int min(){
        // min value should be in left Subtree
        if(leftChild == null){
            return data;
        }else {
            return leftChild.min();
        }
    }

    public int max(){
        // max value should be in Right Subtree
        if(rightChild == null){
            return data;
        }else {
            return rightChild.max();
        }
    }

    public void traverseInOrder(){
        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.print(data+ ", ");
        if(rightChild != null){
            rightChild.traverseInOrder();
        }
    }

    public void traversePostOrder(){
        if(leftChild != null){
            leftChild.traversePostOrder();
        }
        if(rightChild != null){
            rightChild.traversePostOrder();
        }
        System.out.print(data+ ", ");
    }

    public void traversePreOrder(){
        System.out.print(data+ ", ");
        if(leftChild != null){
            leftChild.traversePreOrder();
        }
        if(rightChild != null){
            rightChild.traversePreOrder();
        }
    }

    //setters, getters and toString
    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
