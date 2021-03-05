/*
 * Omar Arias 
 * Math Game
 * A simple addition game
 */

import java.util.Scanner;

public class Driver {
	static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int level;
		int min = 0;
		int max = 0;

		String keepPlaying = "y";

		System.out.println("Select a level");
		System.out.println("Level 1 , 2 or 3?");
		level = input.nextInt();

		if (level == 1) // numbers 0 - 10
		{
			min = 0;
			max = 10;
		}

		if (level == 2) // numbers 0 - 100
		{
			min = 0;
			max = 100;
		}

		if (level == 3) // numbers 0 - 1000
		{
			min = 0;
			max = 1000;
		}

		playGame(min, max);
	

	} // End main

	public static void playGame(int min, int max) 
	{

		int answer;
		int firstNumber;
		int secondNumber;
		int response;

		firstNumber = (int) (Math.random() * (max - min + 1) + min);
		secondNumber = (int) (Math.random() * (max - min + 1) + min);
		answer = firstNumber + secondNumber;

		System.out.println("Solve");
		System.out.println(firstNumber + " + " + secondNumber + " =");
		response = input.nextInt();

		if (response == answer) 
		{
			System.out.println("Correct! Well done!");
		} else 
			System.out.println("Oops! The correct answer is " + answer);
		

	} // End playGame

} // End Driver
