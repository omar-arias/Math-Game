# Math-Game
A simple addition math game

< revisions / thoughts throughout project >

* Created 3 difficulty levels
    Level 1 uses numbers 1 - 10
    Level 2 uses numbers 1 - 100
    Level 3 uses numbers 1 - 1000
    
* Separated code for playing the game from main and created a new function, playGame(min, max)
    The function takes in the minimun and maximum numbers of a level as parameters.
    
* Added a loop in main that allows the game to be played continuously.

* Separated code for choosing a level from main into its own function, getLevel(numberArray)
   The function takes in numberArray of length 2 and fills it with the minimum and maximum number to be used 
      for the specified level to be played.
   The function playGame() no longer takes in parameters.
   Changed while loop in main to a do while loop.
