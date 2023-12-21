package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Exercise3Method {

	void whileLoop () {
		// Random Number Generator from 1-100. 
		// random.nextInt(100) would be 0-99, so add 1 and we have 1-100.
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;
		
		//for easy of testing
		System.out.println(randomNum);
		
		// User picks a number 
				
		Scanner keyboard = new Scanner(System.in);
				
		System.out.println("Pick a number between 1 and 100.");
		int input = 0;
				
		//Players only receive 5 guesses within range
		int guess = 0;
		while (guess < 5) {
			//If guess is outside of range
			input = keyboard.nextInt();
			if (input < 1 || input > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again.");
		}
			//If guess is inside of range
			else if (input >= 1 && input <= 100) {
				
				if (input < randomNum) {
					System.out.println("Please pick a higher number.");
					guess++;
				}
				else if (input > randomNum) {
					System.out.println("Please pick a lower number.");
					guess++;
				}
				else if (input == randomNum) {
					break;
				}
					
			}
		} 
		//Either the user has won or lost
		if (input == randomNum) {
			System.out.println("You win!");
		}
		else {
		System.out.println("You lose, the number to guess was " + randomNum + ".");
		} 
		keyboard.close();
	}	
		
}
