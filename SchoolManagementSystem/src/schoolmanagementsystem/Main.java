package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher(1, "Joanne", 500);
		Teacher t2 = new Teacher(2, "Kiley", 750);
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(t1);
		teachers.add(t2);
		
		Student s1 = new Student(1, "Tom", 4);
		Student s2 = new Student(2, "Harry", 12);
		Student s3 = new Student(3, "Maine", 6);
		Student s4 = new Student(4, "Dakota", 2);
		Student s5 = new Student(5, "Aiysa", 4);
		
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		School school = new School(teachers, students);
		
		
		s1.payFee(5000);
		s2.payFee(5000);
		s3.payFee(5000);
		s4.payFee(5000);
		s5.payFee(5000);
		
		
		//System.out.println("STUDENTS IN THE SCHOOL: " + students);
		System.out.println("TOTAL MONEY EARNED: " + school.getTotalMoneyEarned());
		System.out.println("********************************************");
		
		t1.receiveSalary(t1.getSalary());
		t2.receiveSalary(t2.getSalary());
		
		//System.out.println("TEACHERS IN THE SCHOOL: " + teachers);
		System.out.println("TOTAL MONEY SPENT: " + school.getTotalMoneySpent());
		
		System.out.println("********************************************");
		System.out.println("TOTAL MONEY MADE BY THE SCHOOL: " + school.totalMoneyMadeBySchool());
		
		
	}

}
