package com.deepdive.section2.aabon;

import java.util.regex.Pattern;

public class TestString {


    public static void main(String[] args) {
        String lname = "L&L?BUSINESS?LL";
        if (isEmpty(lname) && (!isValidName(lname) || lname.length() > 40))
        {
            System.out.println("SSO_INVALID_LAST_NAME");
        }else {
            System.out.println("VALID_LAST_NAME");
        }

         String cust_last_name = lname
                .replaceAll("[^0-9a-zA-Z #,.'&/\\-@!$%*()_+={}|:;`\\[\\]\\^\\~\\\\\"]", " ").trim();

        if (cust_last_name.length() > 60)
        {
            System.out.println("SSO_INVALID_LAST_NAME");
        }
        System.out.println("lname : " + cust_last_name);
    }

    public static boolean isValidName(String s)
    {
        return Pattern.matches("[0-9a-zA-Z #,.'&/\\-@!$%*()_+={}|:;`\\[\\]\\^\\~\\\\\"]+", s);
    }


    public static boolean isEmpty(String s)
    {
        if (s == null)
            return true;

        if (s.trim().equals(""))
            return true;

        return false;
    }
}
