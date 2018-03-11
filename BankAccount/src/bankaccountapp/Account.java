package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking account
	private String name;
	private String sSN;
	private double balance;
	protected String accountNumber;
	protected double rate;
	private static int index = 10000;
	
	//constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		//Set Account Number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber(){
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randNumber = (int) (Math.random() * Math.pow(10, 3));
		
		return lastTwoOfSSN + uniqueID + randNumber;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance += accruedInterest;
		System.out.println("Compound Interest: $" + accruedInterest);
		printBalance();
	}
	
	//list common methods
	public void showInfo() {
		System.out.println("Name: " + name + " SSN: " + sSN + " Balance: " + balance + " Rate: " + rate + "%");
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing: $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing: $" +amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transferring: $" + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance + "\n");
	}
}
