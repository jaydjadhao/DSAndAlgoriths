package com.deepdive.section7.hashtables.exercise;

import com.deepdive.section7.hashtables.vo.Employee;
import com.sun.xml.internal.ws.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

// Remove items from LinkedList using HashMap
public class Challenge2 {
    public static void main(String[] args) {

//        String url = "ENVIROTRAC SAFETY &amp;amp; EROSION  INC";
//        try {
//            String result = htmlDecode(url);
//            System.out.println("URL : " + result);
//
//        } catch (Exception e) {
//            // not going to happen - value came from JDK's own StandardCharsets
//        }
        Employee e1 = new Employee(123, "Ankush", "Manager", 2000);
        Employee e2 = new Employee(124, "John", "Analyst", 2000);
        Employee e3 = new Employee(125, "Johny", "Developer", 2000);
        Employee e4 = new Employee(126, "Janardhan", "Treany", 2000);
        Employee e5 = new Employee(127, "Monali", "Treany", 2000);
        Employee e6 = new Employee(123, "Ankush", "Manager", 2000);
        Employee e7 = new Employee(125, "Johny", "Developer", 2000);
        Employee e8 = new Employee(126, "Janardhan", "Treany", 2000);

        LinkedList<Employee> employees = new LinkedList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);

        System.out.println(" Employee List Before Duplicate Item Deletion");
        employees.forEach(System.out::println);
        System.out.println(" ==============================================");
        removeDuplicate(employees);
        System.out.println(" Employee List After Duplicate Item Deletion");
        employees.forEach(System.out::println);


    }

    private static void removeDuplicate(LinkedList<Employee> employees) {
        HashMap<Integer, Employee> buckets = new HashMap<>();
        int index = 0;
        ArrayList<Integer> removeItem = new ArrayList<>();
        for (Employee employee : employees){
            if (buckets.put(employee.getEmpno(),employee) != null){
                removeItem.add(index);
            }
            index ++;
        }
        int j = 0;
        for (int i : removeItem){
           // System.out.println(i);
            employees.remove(i - j++);
        }
    }
    public static String htmlDecode(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        s = s.replace("&nbsp;", " ");
        s = s.replace("&quot;", "\"");
        s = s.replace("&apos;", "'");
        s = s.replace("&#39;", "'");
        s = s.replace("&lt;", "<");
        s = s.replace("&gt;", ">");
        s = s.replace("&amp;", "&");

        // whitespace patterns
        String zeroOrMoreWhitespaces = "\\s*?";
        String oneOrMoreWhitespaces = "\\s+?";

        // replace <br/> by \n
        s = s.replaceAll(
                "<" + zeroOrMoreWhitespaces + "br" + zeroOrMoreWhitespaces + "/" + zeroOrMoreWhitespaces + ">",
                "\n");
        // replace HTML-tabs by \t
        s = s.replaceAll("<" + zeroOrMoreWhitespaces + "span" + oneOrMoreWhitespaces + "style"
                + zeroOrMoreWhitespaces + "=" + zeroOrMoreWhitespaces + "\"white-space:pre\""
                + zeroOrMoreWhitespaces + ">&#9;<" + zeroOrMoreWhitespaces + "/" + zeroOrMoreWhitespaces + "span"
                + zeroOrMoreWhitespaces + ">", "\t");

        return s;
    }

    public static int length(String s) {
        if (s == null) {
            return 0;
        } else {
            return s.length();
        }
    }

    /**
     * replace plain text without using regex
     */
    public static String replace(String s, String sOld, String sNew) {
        sNew = (sNew == null ? "" : sNew);
        if (s == null || sOld == null) {
            return s;
        }
        return s.replace(sOld, sNew);
    }
}
