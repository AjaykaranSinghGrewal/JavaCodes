package blackjack;

import java.util.Scanner;

public class Blackjack {
	public static void main(String[] args) {
		System.out.println("WELCOME TO BLACKJACK");
		
		//create our playing deck
		Deck playingDeck = new Deck();
		playingDeck.createFullDeck();
		playingDeck.shuffle();
		
		//create a deck for the player and dealer
		Deck playerDeck = new Deck();
		Deck dealerDeck = new Deck();
		
		boolean endRound = false;
		double playerMoney = 100.00;
		double playerBet;
		Scanner userInput = new Scanner(System.in);
		
		//Game loop
		while (playerMoney > 0) {
			//take player bet
			System.out.println("You have $" + playerMoney + ". How much would you like to bet?");
			playerBet = userInput.nextDouble();
			
			if (playerBet > playerMoney) {
				System.out.println("You cannot bet more then you have!");
				break;
			}
			
			//start dealing
			//player gets two cards
			playerDeck.draw(playingDeck);
			playerDeck.draw(playingDeck);
			
			//dealer gets two cards
			dealerDeck.draw(playingDeck);
			dealerDeck.draw(playingDeck);
			
			while (true) {
				System.out.println("Your hand: ");
				System.out.print(playerDeck.toString());
				System.out.println("\nYour hand is valued at: " + playerDeck.cardsValue());
				
				//display dealer hand
				System.out.println("Dealer Hand: " + dealerDeck.getCard(0).toString() + " and [Hidden]");
				
				//hit or stand?
				System.out.println("Would you like to (1)Hit or (2)Stand ?");
				int response = userInput.nextInt();
				
				if(response == 1) {
					playerDeck.draw(playingDeck);
					System.out.println("You draw a: " + playerDeck.getCard(playerDeck.deckSize() - 1).toString());
					
					//bust if over 21
					if(playerDeck.cardsValue() > 21) {
						System.out.println("BUST. Currently values at: " + playerDeck.cardsValue());
						playerMoney -= playerBet;
						endRound = true;
						break;
					}
				}
				if (response == 2) {
					break;
				}
			}
			
			//reveal dealer's cards
			System.out.println("Dealer Cards: " + dealerDeck.toString());
			
			//see if dealer has more points than player
			if (dealerDeck.cardsValue() > playerDeck.cardsValue() && endRound == false) {
				System.out.println("DEALER BEATS YOU");
				playerMoney -= playerBet;
				endRound = true;
			}
			//dealer draws at 16, stands at 17
			while (dealerDeck.cardsValue() < 17 && endRound == false) {
				dealerDeck.draw(playingDeck);
				System.out.println("Dealer Draws: " +dealerDeck.getCard(dealerDeck.deckSize() - 1).toString()	);
			}
			//display total value for dealer
			System.out.println("Dealer's hand is valued at: " + dealerDeck.cardsValue());
			//determine if dealer is busted
			if (dealerDeck.cardsValue() > 21 && endRound == false) {
				System.out.println("Dealer busts! YOU WIN!!!!");
				playerMoney += playerBet;
				endRound = true;
			}
			
			//determine if push
			if(playerDeck.cardsValue() == dealerDeck.cardsValue() && endRound == false) {
				System.out.println("Push");
				endRound = true;
			}
			
			if(playerDeck.cardsValue() > dealerDeck.cardsValue() && endRound == false) {
				System.out.println("YOU WIN!!!!");
				playerMoney += playerBet;
				endRound = true;
			}
			else if(endRound == false) {
				System.out.println("You lose the hand.");
				playerMoney -= playerBet;
				endRound = true;
			}
			
			//move all player's and dealer's cards back to the deck after game is over
			playerDeck.moveAllToDeck(playingDeck);
			dealerDeck.moveAllToDeck(playingDeck);
			System.out.println("End of hand.");
		}
		
		System.out.println("GAME OVER!!! YOU'RE OUT OF MONEY");
		System.out.println(playingDeck);
	}
}
