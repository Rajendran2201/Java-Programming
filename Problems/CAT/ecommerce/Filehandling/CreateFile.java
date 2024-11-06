package ecommerce.Filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
        
            File file = new File("sample.txt"); 
            if (file.createNewFile()) {
                System.out.println("The file " + file.getName() + " has been created.");
            } else {
                System.out.println("The file " + file.getName() + " already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


/*
javac ecommerce/Filehandling/CreateFile.java
java ecommerce.Filehandling.CreateFile

OUTPUT: 

The file example.txt already exists.

 * 
 * 
 */