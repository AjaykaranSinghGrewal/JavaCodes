package arrays;

import java.util.Arrays;

public class InsertElementIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int index_position = 2;
		int newValue = 5;
		
		for(int i = my_array.length-1; i > index_position; i--){
		    my_array[i] = my_array[i-1];
		}
		my_array[index_position] = newValue;
		System.out.println(Arrays.toString(my_array));
	}

}
