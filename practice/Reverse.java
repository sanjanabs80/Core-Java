package com.xworkz.practice;

public class Reverse {

        public static void main(String[] args)
        {
            String input = "java";

            char[] reverse = input.toCharArray();

            for (int i = reverse.length - 1; i >= 0; i--)
                System.out.print(reverse[i]);
        }
    }

