package studentdatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor: promt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student First Name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter Student Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.println("Enter Student Class Level: \n1 - Freshman \n2 - Sophomore \n3 - Junior \n4 - Senior");
		this.gradeYear = in.nextLine();
		
		setStudentId();

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
		
	}
	
	//Generate an ID
	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		//get in loop, user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			if (! course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance += costOfCourse;
			} else{
				break;
			}
		} while(1 != 0);
		
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	
	//View balance
	public void viewBalance(){
		System.out.println("YOUR BALANCE IS: $" + tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your payment: ");
		int payment = scanner.nextInt();
		
		tuitionBalance -= payment;
		System.out.println("Thank You for your payment of: $" + payment);
		viewBalance();
	}	
}
