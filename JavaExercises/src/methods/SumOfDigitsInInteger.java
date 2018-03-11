package methods;

import java.util.Scanner;

public class SumOfDigitsInInteger {
	static int sum;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Input an integer: ");
	    int digits = in.nextInt();
		System.out.println("The sum is " + sumDigits(digits));
	}

	private static int sumDigits(int digits) {
		String[] newArr = Integer.toString(digits).split("");
		
		for (int i = 0; i < newArr.length; i++) {
			sum += Integer.parseInt(newArr[i]);
		}
		return sum;
	}

}
