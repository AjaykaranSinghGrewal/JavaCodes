package schoolmanagementsystem;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		salaryEarned = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateMoneySpent(salaryEarned);
	}
}
