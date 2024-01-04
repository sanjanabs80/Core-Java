package com.xworkz.exception.blocks;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryWithCatch {

    public void display() {
        try {
            System.out.println("try block with catch");
            FileReader fileReader = new FileReader("\"C:\\\\Users\\\\Whynew.in\\\\IdeaProjects\\\\Product\\\\src\\\\com\\\\xworkz\\\\product\\\\exception\\\\blocks\\\\sample.txt\"))");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            System.out.println(e);

        }

    }
}
