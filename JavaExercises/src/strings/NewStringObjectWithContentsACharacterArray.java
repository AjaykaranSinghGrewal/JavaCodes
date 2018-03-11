package strings;

public class NewStringObjectWithContentsACharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] chrArray = {'a','b','c','d','e'};
		//1st way
		String str1 = new String(chrArray);
		//2nd way
		String str2 = String.copyValueOf(chrArray, 0, chrArray.length);

		System.out.println(str1);
		System.out.println(str2);
	}

}
