package week1;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        int salary=sc.nextInt();
        if(salary>=5000) {
            int HRA=(10*salary)/100;
            System.out.println("HRA is: " + HRA);
            int DA=(20*salary)/100;
            System.out.println("DA is " + DA);
        }
        else {
            int HRA= (20*salary)/100;
            System.out.println("Hra is " + HRA);
            int DA=(30*salary)/100;
            System.out.println("Da is " + DA);
        }
    }
}