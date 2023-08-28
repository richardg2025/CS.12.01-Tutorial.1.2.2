# CS.12.01-Tutorial.1.2.2

Consider a guessing game in which a player tries to guess a hidden word. The hidden word contains only capital letters and has a length known to the player. A guess contains only capital letters and has the same length as the hidden word.
After a guess is made, the player is given a hint that is based on a comparison between the hidden word and the guess. Each position in the hint contains a character that corresponds to the letter in the same position in the guess. 
The following rules determine the characters that appear in the hint.

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.2/assets/57818506/c4521be5-b6dc-4bff-8e10-ae3429a808ce)

The HiddenWord class will be used to represent the hidden word in the game. The hidden word is passed to the constructor. The class contains a method, getHint that takes a guess and produces a hint.

For example, suppose the variable puzzle is declared as follows.

HiddenWord puzzle = new HiddenWord("HARPS");

The following table shows several guesses and the hints that would be produced.

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.2/assets/57818506/6498be5c-9c3d-47e3-84c6-3df62b895450)

Write the complete HiddenWord class, including the constructor and any required instance variables and methods. Your implementation must pass all of the tests in the HiddenWordTest class (provided). 
