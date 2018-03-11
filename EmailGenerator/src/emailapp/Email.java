package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	//Constructor to receive firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department. Return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call a method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your Email is: " + email);
	}
	
	//Ask for the department
	private String setDepartment(){
		System.out.print("Enter the department\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none\n");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice == 1) {
			return "sales";
		} else if(depChoice == 2) {
			return "dev";
		} else if(depChoice == 3) {
			return "acc";
		} else {
			return "";
		}
	}
	
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "QWERTYUIOPLKJHGFDSAZXCVBNM123456789#@$qwertyuioplkjhgfdsazxcvbnm";
		char[] password = new char[length];
		for (int i = 0; i<length ; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	
	//Set alternate email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password){
		this.password = password;
	}
	
	//Get mailbox capacity
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	
	//Get alternate email
	public String getAlternateEmail(){
		return alternateEmail;
	}
	
	//Get changed password
	public String getChangePassword(){
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
