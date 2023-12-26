package com.xworkz.examples;

public class Split {

    public static void main(String args[]) {
        String s1 = "Java is a object oriented programming language";
        String[] words = s1.split("\\s");

        for (String w : words) {
            System.out.println(w);
        }
    }
}

