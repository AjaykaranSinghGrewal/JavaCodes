package arrays;

public class AverageOfArrayExceptLargestAndLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {5, 7, 2, 4, 9};
		int maxValue = array_nums[0];
		int minValue = array_nums[0];
		double sum = 0;
		
		for(int i = 0; i < array_nums.length; i++) {
			if(array_nums[i] > maxValue) {
				maxValue = array_nums[i];
			}
			else {
				continue;
			}
		}
		
		for(int i = 0; i < array_nums.length; i++) {
			if(array_nums[i] < minValue) {
				minValue = array_nums[i];
			}
			else {
				continue;
			}
		}
		
		for(int i = 0; i < array_nums.length; i++) {
			if(array_nums[i] == minValue || array_nums[i] == maxValue) {
				continue;
			}
			else {
				sum += array_nums[i];
			}
		}

		System.out.println(sum/array_nums.length);
	}

}
