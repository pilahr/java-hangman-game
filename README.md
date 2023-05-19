= HANGMAN GAME =



<img width="661" alt="C19C751A-CB5F-4219-B8CF-D3C32058970D" src="https://github.com/pilahr/java-hangman-game/assets/125895065/7ddc6d6d-abca-475b-a53d-5fca90dce183">
<img width="577" alt="4B0E1769-A009-40F8-A368-D608053F8411" src="https://github.com/pilahr/java-hangman-game/assets/125895065/f613903a-6554-45aa-8b4b-f013d7f33e1d">



Hangman game made in Java

- Player given 10 lives to play
- The hint of the word showed as underscore
- Lives deducted when the player guesss wrong letter, guess the numbers and special charactors instead of the letter
- The correct guessed letter will appear on the line
- If a player guess more than one letter, the first letter will show as a guess letter

The game contains 9 Java classes
- Main : contains main logic of the game
- GameInitialiser : runs when the game starts, greets, explains how to play and takes player name as an input
- RandomWord : generate the word from the array, random them to use in the game
- PlayerInput : has a functionality to take the keyboard input from the player
- Lives : initiates and prints the lives
- DrawHangman : contains the drawing of hangman for each amount of live left
- PopNotUsed : contains a list of alphabets and has a functionality to pop them out when the user already guessed that letter
- GameFinishChecker: contains the method to return a boolean to check if the game finished
- GameOver : contains a method to print the message and the word in the end when no lives left

