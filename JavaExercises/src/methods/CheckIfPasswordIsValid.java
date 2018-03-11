package methods;

import java.util.Scanner;

public class CheckIfPasswordIsValid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();

        /*if (is_Valid_Password(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }*/
        
        String contains = "1234567890qwertyuioplkjhgfdsazxcvbnm";
		String digits = "1234567890";
		String[] newArr = s.split("");
		int count = 0;
		
		for(int i = 0; i < newArr.length; i++) {
			if (newArr[i].contains(digits)) {
				count++;
			}
		}
		System.out.println(count);
		
		/*if (s.length() > 7&& s.contains(contains) && count >= 2 ) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}*/
	}

	/*private static boolean is_Valid_Password(String s) {
		String contains = "1234567890qwertyuioplkjhgfdsazxcvbnm";
		String digits = "1234567890";
		String[] newArr = s.split("");
		int count = 0;
		
		for(int i = 0; i < newArr.length; i++) {
			if (newArr[i].contains(digits)) {
				count++;
			}
		}
		
		if (s.length() > 7 && s.contains(contains) && count >= 2 ) {
			return true;
		}
		else {
			return false;
		}
	}*/

}
