package com.deepdive.section7.hashtables;

import com.deepdive.section7.hashtables.vo.Employee;

public class SimpleHashTable {
    private Employee[] hashTable;

    public SimpleHashTable(){
        hashTable = new Employee[10];
    }

    private int hashKey(String key){
        return key.length() % hashTable.length;
    }

    public void put(String key, Employee emp){
        int hashedKey = hashKey(key);
        if(hashTable[hashedKey] != null){
            System.err.println("Sorry, An Employee already exists at position : "+ hashedKey);
        }else {
            hashTable[hashedKey] = emp;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashTable[hashedKey];
    }

    public void printHashTable(){
        for(Employee emp : hashTable){
            System.out.println(emp);
        }
    }
}
