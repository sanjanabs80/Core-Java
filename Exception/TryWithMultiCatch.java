package com.xworkz.exception.blocks;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryWithMultiCatch {
    public void display(){

            try {
                System.out.println("try block with catch");
                FileReader fileReader = new FileReader("\"C:\\\\Users\\\\Whynew.in\\\\IdeaProjects\\\\Product\\\\src\\\\com\\\\xworkz\\\\product\\\\exception\\\\blocks\\\\sample.txt\"))");
                int[] a={1,3,5};
                System.out.println(a[5]);
            }
            catch (FileNotFoundException |ArrayIndexOutOfBoundsException e) {
                System.out.println("file not found");
                System.out.println(e);
            }


        }
        }


