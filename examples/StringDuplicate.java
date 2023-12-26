package com.xworkz.examples;

public class StringDuplicate {


        static final int NO_OF_CHARS = 256;

        static void findDuplicates(String str) {
            int[] count = new int[NO_OF_CHARS];

            for (int i = 0; i < str.length(); i++) {
                count[str.charAt(i)]++;
            }

            for (int i = 0; i < NO_OF_CHARS; i++) {
                if (count[i] > 1) {
                    System.out.println((char) i + " - " + count[i] + " times");
                }
            }
        }

        public static void main(String[] args) {
            String input = "Java Programming";
            System.out.println("Duplicate characters in the string '" + input + "':");
            findDuplicates(input);
        }
    }

