package com.xworkz.practice;

public class Numeric{

        public static boolean onlyDigits (String str,int n)
        {
            for (int i = 0; i < n; i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    return false;
                }
            }

            return true;
        }
        public static void main (String[]args)
        {
            String str = "1234";
            int len = str.length();
            System.out.println(onlyDigits(str, len));
        }
    }




