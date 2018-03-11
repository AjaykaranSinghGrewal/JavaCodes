package arrays;

public class EvenAndOddNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {5, 7, 2, 4, 9};
		int evenNos = 0;
		int oddNos = 0;
		
		for(int i = 0; i < array_nums.length; i++) {
			if(array_nums[i] % 2 == 0) {
				evenNos += 1;
			}
			else {
				oddNos += 1;
			}
		}
		System.out.println("Even Numbers: " + evenNos);
		System.out.println("Odd Numbers: " + oddNos);
	}

}
