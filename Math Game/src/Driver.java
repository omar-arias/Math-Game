/*
 * Omar Arias 
 * Math Game
 * A simple addition game
 */

import java.util.Scanner;

public class Driver 
{
	static Scanner input;

	public static void main(String[] args) 
	{
		input = new Scanner(System.in);
		
		int level;
		int firstNumber;
		int secondNumber;
		int min;
		int max;
		int response;
		int answer;
		
		System.out.println("Select a level");
		System.out.println("Level 1 , 2 or 3?");
		level = input.nextInt();

		// numbers 0 - 10,
		if (level == 1)
		{
			min = 0;
			max = 10;
			
			firstNumber = (int) (Math.random() * (max - min + 1) + min);
			secondNumber = (int) (Math.random() * (max - min + 1) + min);
			answer = firstNumber + secondNumber;
			
			
			System.out.println("Solve");
			System.out.println(firstNumber + " + " + secondNumber + " =");
			response = input.nextInt();
			
			if (response == answer)
			{
				System.out.println("Correct! Well done!");
			}
			else
			{
				System.out.println("Oops! The correct answer is " + answer);
			}
		}
		
		// numbers 0 - 100
		if (level == 2)
		{
			min = 0;
			max = 100;
			
			firstNumber = (int) (Math.random() * (max - min + 1) + min);
			secondNumber = (int) (Math.random() * (max - min + 1) + min);
			answer = firstNumber + secondNumber;
			
			
			System.out.println("Solve");
			System.out.println(firstNumber + " + " + secondNumber + " =");
			response = input.nextInt();
			
			if (response == answer)
			{
				System.out.println("Correct! Well done!");
			}
			else
			{
				System.out.println("Oops! The correct answer is " + answer);
			}
		}
		
		// numbers 0 - 1000
		if (level == 3)
		{
			min = 0;
			max = 1000;
			
			firstNumber = (int) (Math.random() * (max - min + 1) + min);
			secondNumber = (int) (Math.random() * (max - min + 1) + min);
			answer = firstNumber + secondNumber;
			
			
			System.out.println("Solve");
			System.out.println(firstNumber + " + " + secondNumber + " =");
			response = input.nextInt();
			
			if (response == answer)
			{
				System.out.println("Correct! Well done!");
			}
			else
			{
				System.out.println("Oops! The correct answer is " + answer);
			}
		}
		
	
	} // End main

} // End Driver
