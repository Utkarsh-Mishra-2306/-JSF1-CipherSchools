package week2;

import java.io.File;

public class program11 {
    public static void main(String[] args) {
        File f=new File("/users/dell/Desktop/TestFile.txt");
        if(f.exists()) {
            System.out.println("Printing file details");
            System.out.println("-----------------------");
            System.out.println("File name " + f.getName());
            System.out.println("File Size " + f.length());
            System.out.println("File Path " + f.getAbsolutePath());
            System.out.println("Is File Readable " + f.canRead());
            System.out.println("Is file writable " + f.canWrite());
            
            System.out.println("-------------------");

        }
    }
}