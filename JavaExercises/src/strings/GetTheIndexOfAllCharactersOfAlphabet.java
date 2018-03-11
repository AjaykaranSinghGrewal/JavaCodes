package strings;

import java.lang.reflect.Array;

public class GetTheIndexOfAllCharactersOfAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "The quick brown fox jumps over the lazy dog";
		String str2 = "abcdefghijklmnopqrstuvwxyz";
		
		String[] alphabetArray = str2.split("");
		
		for (int i = 0; i < alphabetArray.length; i++) {
			System.out.println(alphabetArray[i] + " : " +  str1.indexOf(alphabetArray[i]));
		}
	}

}
