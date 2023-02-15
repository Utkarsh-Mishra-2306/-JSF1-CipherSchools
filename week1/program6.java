package week1;

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        //How long is your BURRRRRP?
        Scanner sc=new Scanner(System.in);
        System.out.println("How long is your BUrrrrrrr?");
        int n=sc.nextInt();
        System.out.print("BU");
        for(int i=0; i<=n; i++) {
            System.out.print("r");
        }
        System.out.print("P");
    }
}