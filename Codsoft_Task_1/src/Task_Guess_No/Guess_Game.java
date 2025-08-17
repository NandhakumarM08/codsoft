package Task_Guess_No;

import java.util.Random;
import java.util.Scanner;

public class Guess_Game {
	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        Random r = new Random();
	        boolean playAgain = true;
	        int point = 0;
	        System.out.println(" Welcome to Guess the Number!");
	        while (playAgain) {
	            int n = r.nextInt(1, 101); // Range 1 to 100
	            int attempts = 0;
	            boolean guessed = false;
	            System.out.println("\nGuess a number between 1 and 100");
	            System.out.println("You have 9 attempts!");
	            for (int i = 1; i <= 9; i++) {
	                System.out.print("Attempt " + i + ": ");
	                int guess = scan.nextInt();
	                scan.nextLine(); // consume newline
	                attempts++;
	                if (guess == n) {
	                    System.out.println(" Correct! The number was " + n);
	                    point++;
	                    System.out.println("Points: " + point);
	                    System.out.println("Attempts taken: " + attempts);
	                    guessed = true;
	                    break;
	                } else if (guess > n) {
	                    System.out.println(" Your guess is too high!");
	                } else {
	                    System.out.println(" Your guess is too Low");
	                }
	            }
	            if (!guessed) {
	                System.out.println(" Out of attempts! The number was: " + n);
	            }
	            System.out.print("Do you want to play again? (yes/no): ");
	            String response = scan.nextLine();
	            playAgain = response.equalsIgnoreCase("yes");
	        }
	        System.out.println("Thanks for playing! Final score: " + point);
	        scan.close();
	    }
	}


