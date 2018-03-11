package schoolmanagementsystem;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feePaid;
	private int feeTotal;
	
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		//initially feePaid is 0
		feePaid = 0;
		//total feeTotal is $30,000
		feeTotal = 30000;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFeePaid() {
		return feePaid;
	}

	public int getFeeTotal() {
		return feeTotal;
	}

	public int getGrade() {
		return grade;
	}
	
	public void payFee(int fee) {
		feePaid += fee;
		School.updateTotalMoneyEarned(feePaid);
	}
	
	public int getRemainingFee() {
		return feeTotal - feePaid;
	}
}
