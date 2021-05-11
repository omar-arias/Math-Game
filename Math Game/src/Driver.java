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

		char keepPlaying;
		
		do
		{
			playGame();
			
			System.out.println("\nWould you like to keep playing? Type:( y or n )");
			keepPlaying = input.next().charAt(0);
			
		}while(keepPlaying == 'y');
	
		System.out.println("\nThanks for playing see you next time!");
		input.close();
	} // End main
/**************************************************************************************
 * This function generates the numbers to be used and executes the game.
 */
	public static void playGame() 
	{
		
		int min;
		int max;
		int answer = 000;
		int number1;
		int number2;
		int response;
		int [] numberArray = new int [2];
		String gameType;
		
		System.out.println("Type + for adition or - for subtraction");
		gameType = input.next();
		
		
		getLevel(numberArray);
		
		min = numberArray[0];
		max = numberArray [1];

		number1 = (int) (Math.random() * (max - min + 1) + min);
		number2 = (int) (Math.random() * (max - min + 1) + min);
		
		if (gameType.equals("-"))
		{
			while (number1 < number2)
			{
				number2 = (int) (Math.random() * (max - min + 1) + min);
			}
			
			answer = number1 - number2;
		}
		
		else
		{
			answer = number1 + number2;
		}
		
		
		
		

		System.out.println("Solve");
		System.out.println(number1 + " " + gameType + " " + number2 + " =");
		response = input.nextInt();

		if (response == answer) 
		{
			System.out.println("Well done, thats correct!");
		} else 
			System.out.println("Oops! The correct answer is " + answer);
		

	} // End playGame
/****************************************************************************************	
 * This function determines the minimum and maximum numbers to be used depending on the
 * chosen level.
 * @param numberArray, This array holds the minimum and maximum values to be used.
 */
	public static void getLevel (int numberArray [])
	{
		
		int level;
		int min = 0;
		int max = 0;
		
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
		
		numberArray [0] = min;
		numberArray [1]= max;
		
	} // End getLevel
	
} // End Driver
