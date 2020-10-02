package com.deepdive.section7.hashtables.linearprobing;

import com.deepdive.section7.hashtables.vo.Employee;
import com.deepdive.section7.hashtables.vo.StoredEmployee;

public class LinearProbingHashtable {
    private StoredEmployee[] hashtable;

    public LinearProbingHashtable(){
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);

        if(occupied(hashedKey)){
            int stopIndex = hashedKey;

            //check if last index
            if (hashedKey == hashtable.length){
                hashedKey = 0;
            }else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex){
                // rehashing
                hashedKey = rehashKey(hashedKey, 1);
            }
        }
        if(occupied(hashedKey)){
            System.out.println("Sorry, there's already an Employee at position : " + hashedKey);
        }else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }

    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        return (hashedKey == -1) ? null : hashtable[hashedKey].employee;
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if (hashedKey == -1 ) return null;

        Employee emp = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];
        int stopIndex = hashedKey;

        int index = hashedKey == hashtable.length - 1 ? 0 : hashedKey + 1;

        while ( index != stopIndex) {
            if(oldHashtable[index] != null){
                put(oldHashtable[index].key, oldHashtable[index].employee);
            }
            index = (index == hashtable.length - 1) ? 0 : index + 1;
        }
        return emp;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        hashedKey = (hashedKey == hashtable.length - 1) ? 0 : hashedKey + 1;

        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)){
            hashedKey = rehashKey(hashedKey, 1);
        }
        return (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) ? hashedKey : -1;
    }

    private int rehashKey(int position, int skip) {
        return (position + skip) % hashtable.length;
    }

    private boolean occupied(int hashedKey) {
        return hashtable[hashedKey] != null;
    }

    private int hashKey(String key) {
        return key.length()%hashtable.length;
    }

    public void printHashtable(){
        for (int i = 0; i < hashtable.length; i++) {
                System.out.println(" Position " + i + (hashtable[i] == null? ": Empty" : ": " + hashtable[i].employee ));
        }
    }
}
