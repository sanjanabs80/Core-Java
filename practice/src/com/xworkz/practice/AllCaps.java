package com.xworkz.practice;

public class AllCaps {
    public static void main(String[] args) {
        String str = "Welcome to Java ";
        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                System.out.println(str.charAt(i));
            }
        }
    }
}

