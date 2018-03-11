package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		/*Checking chkacc1 = new Checking("Tom Hardy", "123456789", 1500);
		Savings savacc1 = new Savings("Guy Ritchie", "987654321", 3000);
		
		chkacc1.showInfo();
		System.out.println("********************************");
		savacc1.showInfo();*/
		
		//read a csv file and create a account based on that data
		String file = "C:\\Users\\ajayk\\JavaWorkspace\\BankAccount\\NewBankAccounts.csv";
		
		List<String[]> newCustomers = utilities.CSV.read(file);
		for(String[] newCustomer : newCustomers) {
			String name = newCustomer[0];
			String sSN = newCustomer[1];
			String accountType = newCustomer[2];
			double initDeposit = Double.parseDouble(newCustomer[3]);
			
			//System.out.println("Name: " + name + " SSN: " + sSN + " Balance: " + accountType + " Rate: " + initDeposit);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSN, initDeposit));
			} else {
				System.out.println("Error reading the account");
			}
		}
		
		for(Account acc : accounts) {
			acc.showInfo();
		}
	}
}
