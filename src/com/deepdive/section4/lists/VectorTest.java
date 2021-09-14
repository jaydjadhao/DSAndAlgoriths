package com.deepdive.section4.lists;

import com.deepdive.section4.lists.vo.Employee;

import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        List<Employee> employees = new Vector<>();

        // add employees
        employees.add(new Employee(123,"Ankush", "Manager", 2000));
        employees.add(new Employee(124,"Jahn", "Analyst", 2000));
        employees.add(new Employee(125,"Johny", "Developer", 2000));
        employees.add(new Employee(126,"Janardhan", "Treany", 2000));

        display(employees);

        System.out.println("employees.get(1) : " + employees.get(1));
        System.out.println("employees.contains() : " + employees.contains(new Employee(126,"Janardhan", "Treany", 2000)));
        System.out.println("employees.listIterator() : " + employees.listIterator(1));
        System.out.println("employees.remove() : " + employees.remove(3));
        System.out.println("employees.set() : " + employees.set(2,new Employee(126,"Janardhan", "Treany", 2000)));
        display(employees);
        employees.add(employees.size() ,new Employee(125,"Johny", "Developer", 2000));
        display(employees);

    }

    public static void display(List<Employee> employees){
        employees.forEach(System.out::println);
    }
}
