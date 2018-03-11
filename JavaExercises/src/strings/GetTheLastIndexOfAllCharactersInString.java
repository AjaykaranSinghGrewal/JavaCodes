package strings;

public class GetTheLastIndexOfAllCharactersInString {
	public static void main(String[] args) {
		String str1 = "The quick brown fox jumps over the lazy dog";
		String str2 = "abcdefghijklmnopqrstuvwxyz";
		
		String[] alphabetArray = str2.split("");
		
		for (int i = 0; i < alphabetArray.length; i++) {
			System.out.println(alphabetArray[i] + " : " +  str1.lastIndexOf(alphabetArray[i]));
		}
	}
}
