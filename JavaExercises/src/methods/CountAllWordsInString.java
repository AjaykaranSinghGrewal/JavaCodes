package methods;

import java.util.Arrays;

public class CountAllWordsInString {
	public static int count;

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		
		System.out.println(coundWords(str));
	}

	private static int coundWords(String str) {
		String[] strArr = str.split("");
	
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] != " ") {
				count++;
			}
		}
		return count;
	}

}
