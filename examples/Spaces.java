package com.xworkz.examples;

public class Spaces {


        public static void main(String[] args) {
            String sentence = "this is a java class";
            System.out.println("Original sentence: " + sentence);

            sentence = sentence.replaceAll("\\s", "");
            System.out.println("After replacement: " + sentence);
        }
    }
