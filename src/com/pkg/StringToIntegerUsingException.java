package com.pkg;

public class StringToIntegerUsingException {

    public void convertStringToInteger(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
