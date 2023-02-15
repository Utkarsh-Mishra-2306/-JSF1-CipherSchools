package week2;

import java.io.BufferedReader;
import java.io.FileReader;

public class program13 {
    public static void main(String[] args) {
        FileReader fr=new FileReader("/Users/dell/Desktop/rhyme.txt");
        BufferedReader br=new BufferedReader(fr);

        String line;
        
        while((line=br.readLine()!=null)) {
            System.out.println(line);
        }
    }
}
