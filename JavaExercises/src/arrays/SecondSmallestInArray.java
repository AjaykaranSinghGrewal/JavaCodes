package arrays;

import java.util.Arrays;

public class SecondSmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array = {-1, 4, 0, 2, 7, -3};
		Arrays.sort(my_array);
		
		System.out.println("SECOND MIN VALUE: " + my_array[1]);
	}

}
