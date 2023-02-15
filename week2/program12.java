package week2;

import java.io.File;

public class program12 {
    public static void main(String[] args) {
        File f=new File("/Users/dell/Desktop/Downloads/datasets");
        String[] files=f.list();
        for(String file:files) {
            System.out.println(file);
        }    
    }
}
