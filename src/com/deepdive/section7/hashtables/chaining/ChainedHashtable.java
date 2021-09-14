package com.deepdive.section7.hashtables.chaining;

import com.deepdive.section7.hashtables.vo.Employee;
import com.deepdive.section7.hashtables.vo.StoredEmployee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {
    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
    }

    // hashkey operation
    public int hashKey(String key) {
        //return Math.abs(key.hashCode() % hashtable.length);
        return key.length()%hashtable.length;
    }

    // put, get and remove operation
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] == null) {
            hashtable[hashedKey] = new LinkedList<StoredEmployee>();
        }
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        // Get element from LinkedList
        if (hashtable[hashedKey] == null) return null;

        StoredEmployee employee = null;
        boolean flag = false;
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key)) {
                flag = true;
                break;
            }
        }
        return flag ? employee.employee : null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] == null) return null;
        else {
            ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
            StoredEmployee emp = null; int i = 0;
            while (iterator.hasNext()) {
                StoredEmployee employee = iterator.next();
                if (employee.key.equals(key)) {
                    hashtable[hashedKey].remove(i);
                    return employee.employee;
                }
                i++;
            }
        }
        return null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null || hashtable[i].isEmpty()) {
                System.out.println("Position " + i + " : Empty");
            } else {
                System.out.print("Position " + i + " : ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee + "->");
                }
                System.out.println("null");
            }
        }
    }
}
