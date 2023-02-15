package week1;

import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        //get user division and print his rank
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your division");
        int div=sc.nextInt();
        switch(div) {
            case 1: System.out.println("First rank");
                break;
            case 2:
                System.out.println("Second rank");
                break;
            case 3:
                System.out.println("Third rank");
                break;
            default:
                System.out.println("No rank!!");
                break;
        }
    }
}