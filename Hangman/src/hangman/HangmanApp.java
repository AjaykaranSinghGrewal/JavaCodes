package hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class HangmanApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] guesses = {"java", "javascript", "python", "php"};
		//LinkedList<String> guesses = getWordList();
		LinkedList<Character> guessedAlphabets = new LinkedList<Character>();
		boolean areWePlaying = true;
		
		
		while (areWePlaying) {
			boolean wordIsGuessed = false;
			int tries = 0;
			
			System.out.println("*********************************************");
			System.out.println("WELCOME");
			char[] randomWordToGuess = guesses[random.nextInt(guesses.length)].toCharArray();
			//char[] randomWordToGuess = guesses.get(random.nextInt(guesses.size()));
			int amountOfGuesses = randomWordToGuess.length;
			char[] playerGuess = new char[amountOfGuesses];
			
			for(int i = 0; i < playerGuess.length; i++) {
				playerGuess[i] = '_';
			}
			
			while (!wordIsGuessed && tries != amountOfGuesses) {
				System.out.println("\nCurrent guesses: " + guessedAlphabets);
				printArray(playerGuess);
				System.out.println("You have " + (amountOfGuesses-tries) + " left. Enter a single character");
				char input = scanner.nextLine().charAt(0);
				
				if (guessedAlphabets.contains(input)) {
					System.out.println("\nThis character is already present. Please choose another one");
					System.out.println(guessedAlphabets);
				}
				else {
					tries++;
				}
				
				if(input == '-') {
					areWePlaying = false;
				}
				else {
					for(int i = 0; i < randomWordToGuess.length; i++) {
						if (randomWordToGuess[i] == input) {
							playerGuess[i] = input;
							guessedAlphabets.add(input);
						}
					}
					
					if(isTheWordGuessed(playerGuess)) {
						wordIsGuessed = true;
						System.out.println("YOU WON!!");
						System.out.println("Want to play another game? (yes/no)");
						String anotherGame = scanner.nextLine();
						if(anotherGame.equalsIgnoreCase("no")) {
							areWePlaying = false;
						}
						guessedAlphabets.clear();
					}
				}
			}
			if(!wordIsGuessed && tries == amountOfGuesses) 
			{
				System.out.println("You are out of guesses");
				System.out.println("Want to play another game? (yes/no)");
				String anotherGame = scanner.nextLine();
				if(anotherGame.equalsIgnoreCase("no")) {
					areWePlaying = false;
				}
				guessedAlphabets.clear();
			}
		}
		
		System.out.println("GAME OVER");
	}

	private static boolean isTheWordGuessed(char[] playerGuesses) {
		for(int i = 0; i < playerGuesses.length; i++) {
			if (playerGuesses[i] == '_') {
				return false;
			}
		}
		return true;
	}

	private static void printArray(char[] playerGuesses) {
		for(int i = 0; i < playerGuesses.length; i++) {
			System.out.print(playerGuesses[i] + " ");
		}
		System.out.println();
	}
	
	/*private static LinkedList<String> getWordList() {
	String inputLine;
	LinkedList<String> list = new LinkedList<String>();
	int counter = 0;
	int maxWords = 100;
	
	try {
		URL wordList = new URL("http://www.joereynoldsaudio.com/wordlist.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(wordList.openStream()));
		
		while((inputLine = in.readLine()) != null) {
			list.add(inputLine);
			counter++;
			if (counter == maxWords) {
				break;
			}
		}
		in.close();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
}*/

}
