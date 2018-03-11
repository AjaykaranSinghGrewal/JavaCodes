package strings;

public class CompareTwoStringsLexicographically {
	public static void main(String[] args) {
		String str1 = "this is java";
		String str2 = "This Is Java";
		
		if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println(str1 + " ***matches*** " + str2);
		}
		else if (str1.compareToIgnoreCase(str2) < 0) {
			System.out.println(str1 + " ***is less than*** " + str2);
		}
		else if (str1.compareToIgnoreCase(str2) > 0) {
			System.out.println(str1 + " ***is greater than*** " + str2);
		}
		
	}
}
