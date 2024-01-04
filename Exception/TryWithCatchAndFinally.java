package com.xworkz.exception.blocks;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithCatchAndFinally {
             FileReader fileReader=null;

    public void display() throws IOException {
            try {
                System.out.println("try block with catch");
                FileReader fileReader = new FileReader("C:\\Users\\Whynew.in\\IdeaProjects\\Product\\src\\com\\xworkz\\product\\exception\\blocks\\sample.txt");
            }
            catch (FileNotFoundException e) {
                System.out.println("file not found");
                System.out.println(e);

            }
            finally {

                System.out.println("closing file with try catch");
            }

    }
}
