package arrays;

import java.util.Arrays;

public class CopyAnArrayByIteratingOverIt {
	public static void main(String[] args) {
		int[] my_array1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] my_array2 = new int[10];
		
		for(int i = 0; i < my_array1.length; i++) {
			my_array2[i] = my_array1[i];
		}
		
		System.out.println(Arrays.toString(my_array2));
	}
}
