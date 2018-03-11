package arrays;

import java.util.Arrays;

public class ReverseAnArrayOfIntegers {
	public static void main(String[] args) {
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		int j = 0;
		
		int[] my_array2 = new int[14];
		
		for (int i = my_array1.length-1; i >= 0; i--) {
			my_array2[j] = my_array1[i];
			j++;
		}
		
		System.out.println(Arrays.toString(my_array2));
	}
}
