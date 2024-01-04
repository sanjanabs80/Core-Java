package com.xworkz.exception.blocks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithMultipleCatchAndFinally {
FileReader fileReader=null;
    public void display() throws IOException {
        FileReader fileReader=null;
        try {
            System.out.println("try block with catch");
             fileReader = new FileReader("\"C:\\\\Users\\\\Whynew.in\\\\IdeaProjects\\\\Product\\\\src\\\\com\\\\xworkz\\\\product\\\\exception\\\\blocks\\\\sample.txt\"))");
            int[] a={1,3,5};
            System.out.println(a[5]);
        }
        catch (FileNotFoundException e) {
            System.out.println("file not found");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("running finally in try with multiple catch");
fileReader.close();
        }

    }
}
