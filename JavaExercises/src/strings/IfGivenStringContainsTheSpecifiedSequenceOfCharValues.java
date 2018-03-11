package strings;

import java.util.Scanner;

public class IfGivenStringContainsTheSpecifiedSequenceOfCharValues {

	public static void main(String[] args) {
		String str1 = "string to be tested";
		
		Scanner scanner = new Scanner(System.in);
		String str2 = scanner.next().toLowerCase();
		
		if(str1.contains(str2)) {
			System.out.println(str1 + " containes " + str2);
		}
		else {
			System.out.println(str1 + " does not containes " + str2);
		}
	}

}
