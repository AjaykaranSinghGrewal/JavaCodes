package adventureGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		//Game Variables
		String[] enemies = {"Skeleton", "Zombie", "Assassin", "Killer"};
		int maxEnemyHealth = 100;
		int enemyAttackDamage = 25;
		
		//Player Variables
		int playerHealth = 100;
		int playerAttackDamage = 50;
		int numHealthPotions = 3;
		int healthPotionHealAmount = 30;
		int healthPotionDropChance = 50; //percentage
		
		boolean running = true;
		
		System.out.println("WELCOME TO THE DUNGEON");
		
		GAME:
		while (running) {
			System.out.println("----------------------------------------");
			
			//set enemy health to a random number between 0 and maxEnemyHealth
			int enemyHealth = rand.nextInt(maxEnemyHealth);
			//select an enemy from the array
			String enemy = enemies[rand.nextInt(enemies.length)];
			
			System.out.println("\t# " +enemy+ " appeared! #\n");
			
			while (enemyHealth > 0) {
				System.out.println("\tYour HP: " + playerHealth);
				System.out.println("\t" +enemy+ "'s HP: " +enemyHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Drink health potion");
				System.out.println("\t3. Run");
				
				String input = in.nextLine();
				
				if (input.equals("1")) {
					int damageDealt = rand.nextInt(playerAttackDamage);
					int damageTaken = rand.nextInt(enemyAttackDamage);
					
					enemyHealth -= damageDealt;
					playerHealth -= damageTaken;
					
					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
					System.out.println("\t> You receive the " + damageTaken + " in retaliation.");
					
					if(playerHealth < 1) {
						System.out.println("\t> You have taken too much damage, you are too weak to go on");
						break;
					}
				}
				else if (input.equals("2")) {
					if (numHealthPotions > 0) {
						playerHealth += healthPotionHealAmount;
						numHealthPotions--;
						
						System.out.println("\t> You drank a health potion, healing yourself for " + healthPotionHealAmount + ".");
						System.out.println("\t> Your health is: " + playerHealth + " HP. " + "You have " + numHealthPotions + " left.");
					}
					else {
						System.out.println("\t You have no health potions left! Defeat enemies for a chance to get one.");
					}
				}
				else if (input.equals("3")){
					System.out.println("\t You ran away");
					continue GAME;
				}
				else {
					System.out.println("\tINVALID COMMAND");
				}
			}
			
			if (playerHealth < 1) {
				System.out.println("You limp outof the dungeon, weak for battle");
				break;
			}
			
			System.out.println("----------------------------------------");
			System.out.println(" # " + enemy + " was defeated. # ");
			System.out.println(" # You have " + playerHealth + " HP left. # ");
			
			//conditional to drop health potion of enemy was defeated, 50% chance of the drop
			if (rand.nextInt(100) > healthPotionDropChance) {
				numHealthPotions++;
				System.out.println(" # The enemy dropped a health potion. # ");
				System.out.println(" # You have " + numHealthPotions + "health potion(s). # ");
			}
			
			System.out.println("----------------------------------------");
			System.out.println("What would you like to do?");
			System.out.println("1. Continue Fighting");
			System.out.println("2. Exit Dungeon");
			
			String input = in.nextLine();
			
			while (!input.equals("1") && !input.equals("2")) {
				System.out.println("INVALID COMMAND");
				input = in.nextLine();
			}
			
			if (input.equals("1")) {
				System.out.println("You choose to continue fighting");
			}
			else if (input.equals("2")) {
				System.out.println("Exit Dungeon from your adventures.");
				break;
			}
		}
		
		System.out.println("###################");
		System.out.println("THANKS FOR PLAYING");
		System.out.println("###################");
		
	}

}
