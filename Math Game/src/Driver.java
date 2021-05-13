/*
 * Omar Arias 
 * Math Game
 * A simple addition game
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	
	static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		String keepPlaying;
		String yes = "y";
		String no = "n";
		
		
		do
		{
			boolean playInput = false;
			
			playGame();
			
			do
			{
				System.out.println("\nWould you like to keep playing? Type:( y or n )\n");
				keepPlaying = input.next();
				
				if (keepPlaying.equalsIgnoreCase(yes) || keepPlaying.equalsIgnoreCase(no))
				{
					playInput = true;
				}
				else
				{
					System.out.println("\nInvalid input, please try again.\n");
				}
				
			}while(playInput == false);
			
			System.out.println("");
			
		}while(keepPlaying.equalsIgnoreCase(yes));
	
		System.out.println("Thanks for playing see you next time!");
		input.close();
	} // End main
/**************************************************************************************
 * This function generates the numbers to be used and executes the game.
 */
	public static void playGame() 
	{
		
		int min;
		int max;
		int answer = -1;
		int number1;
		int number2;
		int response = -1;
		int [] numberArray = new int [2];
		String gameType = null;
		boolean validInput = false;
		String negative = "-";
		String positive = "+";
		boolean validAnswer = false;
		
	
		do
		{
			try
			{
				System.out.println("What type of math problems would you like to solve?");
				System.out.println("Type + for adition or - for subtraction\n");
				gameType = input.next();
				
				if(gameType.equals(negative) || gameType.equals(positive)) 
				{
					validInput = true;
				}
				else
				{
					throw new Exception("\nIncorrect input, try again\n");
				}
			}
			catch (Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			
		}while (validInput == false);
		
		getLevel(numberArray);
		
		min = numberArray[0];
		max = numberArray [1];

		number1 = (int) (Math.random() * (max - min + 1) + min);
		number2 = (int) (Math.random() * (max - min + 1) + min);
		
		if (gameType.equals(negative))	
		{
			while (number1 < number2)	// Used to make sure answer is never negative
			{
				number2 = (int) (Math.random() * (max - min + 1) + min);
			}
			
			answer = number1 - number2;	// Generates subtraction problem
		}
		
		else
		{
			answer = number1 + number2;	// Generates addition problem
		}
		
		do
		{
			try
			{
				System.out.println("\nSolve\n");
				System.out.println(number1 + " " + gameType + " " + number2 + " =");
				response = input.nextInt();
				
				validAnswer = true;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Oops! Please enter a number.");
				input.nextLine();
			}
			
		}while (validAnswer == false);

		if (response == answer) 
		{
			System.out.println("\nWell done, thats correct!");
		} else 
			System.out.println("\nOops! The correct answer is " + answer);
		

	} // End playGame
/****************************************************************************************	
 * This function determines the minimum and maximum numbers to be used depending on the
 * chosen level.
 * @param numberArray, This array holds the minimum and maximum values to be used.
 */
	public static void getLevel (int numberArray [])
	{
		
		int level = 0;
		int min = 0;
		int max = 0;
		boolean validInput = false;
		
		
		do
		{
			try
			{
				System.out.println("\nSelect a level");
				System.out.println("Level 1 , 2 or 3?\n");
				level = input.nextInt();
				
				if(level == 1 || level == 2 || level == 3)
				{
					validInput = true;
				}
				else
				{
					System.out.println("\nInvalid input, try again");
				}
			}

			catch(InputMismatchException ex)
			{
				System.out.println("\nInvalid input, try again");
				input.nextLine();
			
			}
			
		}while(validInput == false);

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
