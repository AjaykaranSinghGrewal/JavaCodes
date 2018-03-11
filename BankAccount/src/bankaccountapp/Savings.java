package bankaccountapp;

public class Savings extends Account{
	//List properties specific to savings account
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize savings account properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
		
	private void setSafetyDepositBox() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	//list any methods specific to savings account
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println("Your Savings Account features:\n " + "Safety Deposit Box Id: " + safetyDepositBoxId
						+ "\n Safety Deposit Box Key: " + safetyDepositBoxKey + "\n");		
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
}
