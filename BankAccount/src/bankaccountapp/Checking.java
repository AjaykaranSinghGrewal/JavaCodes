package bankaccountapp;

import java.security.PublicKey;

public class Checking extends Account {
	//List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}

	//list any methods specific to checking account
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checking");
		super.showInfo();
		System.out.println("Your Checking Account features:\n " +  "Debit Card Number: " + debitCardNumber
						+ "\n Debit Card Pin: " + debitCardPin + "\n");
		
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * 0.15;
	}
}
