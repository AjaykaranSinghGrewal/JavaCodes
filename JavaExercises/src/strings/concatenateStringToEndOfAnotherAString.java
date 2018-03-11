package strings;

public class concatenateStringToEndOfAnotherAString {

	public static void main(String[] args) {
		/*String str1 = "Yaya";
		String str2 = "Dodo";
		
		System.out.println(str1.concat(str2));*/
		
		StringBuffer sb1 = new StringBuffer("Yaya");
		StringBuffer sb2 = new StringBuffer("Dodo");
		sb1.append(sb2);
		
		System.out.println(sb1);
		
		
	}

}
