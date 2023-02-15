package week1;

import java.util.Random;
import java.util.Scanner;
public class program3 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int computerChoice=rnd.nextInt(20);

        for(int i=1; i<=6; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your guess: ");
            int guess=sc.nextInt();
            if(guess>computerChoice) {
                System.out.println("OOPS! YOUR GUESS IS TOO HIGH!!");
            }
            else if(guess< computerChoice){
                System.out.println("YOUR GUSS IS TOO LOW!!");
            }
            else {
                System.out.println("YOU GUESSED CORRECTLY");
            }
        }
        System.out.println("Computer choice : " + computerChoice);
    }
}