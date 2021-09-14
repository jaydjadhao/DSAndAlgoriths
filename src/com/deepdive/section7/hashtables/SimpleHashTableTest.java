package com.deepdive.section7.hashtables;


import com.deepdive.section7.hashtables.vo.Employee;

public class SimpleHashTableTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(123,"Ankush", "Manager", 2000);
        Employee e2 = new Employee(124,"John", "Analyst", 2000);
        Employee e3 =new Employee(125,"Johny", "Developer", 2000);
        Employee e4 =new Employee(126,"Janardhan", "Treany", 2000);
        Employee e5 =new Employee(127,"Monali", "Treany", 2000);

        SimpleHashTable ht = new SimpleHashTable();
        // put operation
        ht.put("Ankush", e1);
        ht.put("John", e2);
        ht.put("Johny", e3);
        ht.put("Janardhan", e4);
        ht.put("Monali", e5);

        // Print the Hash Table
        ht.printHashTable();

        // get the values
        System.out.println("get Value by Key Ankush : " + ht.get("Ankush"));
        System.out.println("get Value by Key Janardhan : " + ht.get("Janardhan"));

    }


}
