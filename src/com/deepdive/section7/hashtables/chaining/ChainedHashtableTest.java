package com.deepdive.section7.hashtables.chaining;

import com.deepdive.section7.hashtables.linearprobing.LinearProbingHashtable;
import com.deepdive.section7.hashtables.vo.Employee;

public class ChainedHashtableTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(123,"Ankush", "Manager", 2000);
        Employee e2 = new Employee(124,"John", "Analyst", 2000);
        Employee e3 =new Employee(125,"Johny", "Developer", 2000);
        Employee e4 =new Employee(126,"Janardhan", "Treany", 2000);
        Employee e5 =new Employee(127,"Monali", "Treany", 2000);
        Employee e6 =new Employee(127,"Suraj", "Treany", 2000);
        Employee e7 =new Employee(127,"Bunty", "Treany", 2000);


        ChainedHashtable ht = new ChainedHashtable();
        // put operation
        ht.put("Ankush", e1);
        ht.put("John", e2);
        ht.put("Johny", e3);
        ht.put("Janardhan", e4);
        ht.put("Monali", e5);

        // Print the Hash Table
        ht.printHashtable();
        System.out.println("===============================================");

        // get the values
        System.out.println("get Value by Key Ankush : " + ht.get("Ankush"));
        System.out.println("get Value by Key Janardhan : " + ht.get("Janardhan"));
        System.out.println("get Value by Key Monali : " + ht.get("Monali"));

        System.out.println("===============================================");

        // put and remove operation
        ht.put(e6.getEmpName(),e6);
        ht.put(e7.getEmpName(),e7);
        ht.printHashtable();

        System.out.println("===============================================");
        System.out.println("Remove Value by Key Ankush : " + ht.remove("Ankush"));
        ht.printHashtable();
        System.out.println("===============================================");

        System.out.println("Remove Value by Key Johny : " + ht.remove("Johny"));
        ht.printHashtable();
        System.out.println("===============================================");

    }
}
