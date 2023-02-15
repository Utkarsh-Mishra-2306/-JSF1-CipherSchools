package week1;

import java.sql.Date;
import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your details: ");
        System.out.println("Enter your current speed: ");
        int speed=sc.nextInt();
        System.out.println("Is it your birthday today? ");
        boolean birthday=sc.nextBoolean();

        if(birthday==true) {
            System.out.println("You are exempted");
        }
        else{
            if(speed>80) {
                System.out.println("High ticket");
            }
            else if(speed<60 && speed>80) {
                System.out.println("Mid ticket");
            }
            else {
                System.out.println("No ticket");
            }
        }
    }
}