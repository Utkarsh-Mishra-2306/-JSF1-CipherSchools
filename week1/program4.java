package week1;

public class program4 {
    public static void main(String[] args) {
        char ch='A';
        //while loop -  first check condition, if true then enters loop
        while(ch<=90) {
            System.out.println(ch + " ");
            ch++;
        }
        //do-while  - first executes the block then checks condition
        do{
            System.out.print(ch + " ");
            ch++;
        }
        while(ch<='Z');
    }
}