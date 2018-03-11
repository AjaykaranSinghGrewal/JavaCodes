package strings;

import java.util.Scanner;

public class CharAtAGivenIndex {
	
	public static void main(String[] args) {
		String str = "which letter?";
		System.out.println("Enter the Index: ");
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		
		if(index > str.length()) {
			System.out.println("Out of Index");
		}
		else {
			System.out.println(str.charAt(index - 1));
		}
	}
}
