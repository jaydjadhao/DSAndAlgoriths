package com.deepdive.section10.heaps;

public class Heap {
    private int[] heap;
    private int size;

    //constructor
    public Heap(int capacity){
        this.heap = new int[capacity];
    }

    // Operations
    public void insert(int value){
        if(isFull()){
            throw new IndexOutOfBoundsException("Heap is Full");
        }
        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }

    public int peek(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Heap is Empty");
        }
        return heap[0];
    }

    public int delete(int index){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Heap is Empty");
        }
        int parent = getParent(index);
        int deletedValue = heap[index];

        //assign last value to deleted index
        heap[index] = heap[size - 1];

        if (index == 0 || heap[index] < heap[parent]){
            fixHeapBelow(index, size-1);
        }else {
            fixHeapAbove(index);
        }
        size --;
        return deletedValue;
    }

    // sort : once call sort method heap will not be a heap
    public void sort(){
        int lastHeapIndex = size - 1;
        for (int i = 0; i < lastHeapIndex; i++) {
            int tmp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = tmp;

            fixHeapBelow(0, lastHeapIndex - i - 1);
        }
    }

    public int size(){
        return size;
    }

    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        int parent = getParent(index);

        while (index > 0 && newValue > heap[parent]){
            heap[index] = heap[parent];
            index = parent;
            parent = getParent(index);
        }

        heap[index] = newValue;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;

        while (index <= lastHeapIndex){
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            if(leftChild <= lastHeapIndex){
                if (rightChild > lastHeapIndex){
                    childToSwap = leftChild;
                }else {
                    childToSwap = heap[leftChild] > heap[rightChild] ? leftChild : rightChild;
                }

                if (heap[index] < heap[childToSwap]){
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                }else {
                    break;
                }

                index = childToSwap;
            }else {
                break;
            }
        }
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

    private int getChild(int index, boolean isLeft) {
        return 2 * index + (isLeft ? 1 : 2);
    }

    private boolean isFull() {
        return heap.length == size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + ", ");
        }
        System.out.println();
    }
}
