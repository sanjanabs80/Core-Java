package com.xworkz.exception.blocks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithFinally {
    FileReader fileReader=null;
    public void display() throws IOException {

        try{

            fileReader = new FileReader("C:\\Users\\Whynew.in\\IdeaProjects\\Product\\src\\com\\xworkz\\product\\exception\\blocks\\sample.txt");
            System.out.println(fileReader.read());
            System.out.println("using try with finally");
        }

        finally {
            fileReader.close();

        }
    }




}
