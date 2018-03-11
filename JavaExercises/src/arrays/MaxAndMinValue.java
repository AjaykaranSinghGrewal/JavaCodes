package arrays;

public class MaxAndMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int maxValue = my_array1[0];
		int minValue = my_array1[0];

		for (int i = 0; i < my_array1.length; i++) {
			if(my_array1[i] > maxValue) {
				maxValue = my_array1[i];
			}
			else {
				continue;
			}
		}
		
		for (int i = 0; i < my_array1.length; i++) {
			if(my_array1[i] < minValue) {
				minValue = my_array1[i];
			}
			else {
				continue;
			}
		}
		
		System.out.println("MAX VALUE: " + maxValue);
		System.out.println("MIN VALUE: " + minValue);
	}

}
