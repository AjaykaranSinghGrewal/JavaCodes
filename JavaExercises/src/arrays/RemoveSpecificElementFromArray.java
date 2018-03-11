package arrays;

import java.util.Arrays;

public class RemoveSpecificElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int removeIndex = 1;
		int[] new_array = new int[my_array.length-1];
		int newIndex = 0;
		
		//One way
		/*for (int i = 0; i < my_array.length; i++) {
			if(i == removeIndex) {
				continue;
			}
			else {
				new_array[newIndex] = my_array[i];
				newIndex++;
			}
		}*/
		
		//Another way
		for(int i = removeIndex; i < my_array.length -1; i++){
	        my_array[i] = my_array[i + 1];
	      }
		
		//System.out.println(Arrays.toString(new_array));
		System.out.println(Arrays.toString(my_array));
	}

}
