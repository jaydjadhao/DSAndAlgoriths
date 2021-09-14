package com.deepdive.section7.hashtables;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(16,6.0f);
        int[] ints = {10,20,30,40,50,60,70,80,90,100,15,11,22,33,44,55,66,77,88,99,110,76
                ,12,24,36,48,60,72,84,108,120,1,2,3,4,5,6,7,8,9,15,16,17,18,19,23,25,26,27,28,29,31,32,34,35,36,37,38,39
                ,41,42,43,45,46,47,49,51,52,53,54,57,58,59,61,62,63,65,67,68,69,71,73,74,75,150};
        map.put(null,null);
        for (int i:ints){
            map.put(i,i);
        }
        System.out.println("Size : " + map.size());

        try {
            Field tableField = HashMap.class.getDeclaredField("table");
            tableField.setAccessible(true);
            Object[] table = (Object[]) tableField.get(map);
            System.out.println("Capacity : " + table == null ? 0 : table.length);
            for (int i = 0; i <table.length; i++) {
                System.out.println("Bucket " + i +" : "+ table[i]);
//               if(table[i] != null){
//                   System.out.println(table[i].getClass());
//                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //print the Hashmap
        int i = 0;
        for (Map.Entry entry: map.entrySet()){
            System.out.println("Entry " + i++ + " : "+ entry);
        }
        System.out.println("======================================");
        String str = "ENVIROTRAC SAFETY &amp;amp; EROSION  INC";
        System.out.println("checkSpecialCharacters : " + checkSpecialCharacters(str));
        System.out.println(" isValidName: " + isValidName(str));

    }

    public static boolean isValidName(String s)
    {
        return Pattern.matches("[0-9a-zA-Z #,.'&/\\-@!$%*()_+={}|:;`\\[\\]\\^\\~\\\\]+", s);
    }
    public static boolean checkSpecialCharacters(String inputStr)
    {
        char[] inp = inputStr.toCharArray();
        int tmpInt;
        boolean isValid = true;
        for (int i = 0; i < inputStr.length(); i++)
        {
            tmpInt = inp[i];
            if (tmpInt > 128)
            {
                isValid = false;
                break;
            }
        }

        if (isValid)
            return true;
        else
            return false;
    }
}
