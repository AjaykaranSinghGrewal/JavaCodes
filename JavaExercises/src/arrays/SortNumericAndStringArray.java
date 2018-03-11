package arrays;

import java.util.Arrays;

public class SortNumericAndStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array1 = {5,1,2,8,9,7,6,3,4,0};
		Arrays.sort(my_array1);
	            
	    String[] my_array2 = {
	            "Java",
	            "Python",
	            "PHP",
	            "C#",
	            "C Programming",
	            "C++"
	        };
	    Arrays.sort(my_array2);
	    
	    for (int i : my_array1) {
	    	System.out.println(i);
	    }
	    
	    System.out.println();
	    
	    for (String i : my_array2) {
	    	System.out.println(i);
	    }
	}

}
