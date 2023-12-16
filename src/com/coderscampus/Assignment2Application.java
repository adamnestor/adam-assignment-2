package com.coderscampus;

import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {
		
		// Random Number Generator from 1-100. 
		// random.nextInt(100) would be 0-99, so add 1 and we have 1-100.
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;
	}

}
