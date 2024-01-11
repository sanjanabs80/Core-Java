package com.xworkz.practice;

public class SpecialCharacter {

        public static void main(String[] args) {
            String s = "!#java program.,";
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))
                        && !Character.isLetter(s.charAt(i))
                        && !Character.isWhitespace(s.charAt(i))) {
                    count++;
                }
            }
            System.out.println("String has Special Characters\n" + count + " ");

        }
}
