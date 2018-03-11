package arrays;

public class SumOfTwoEqualToTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {1,2,3,4,5,6,7};
		int target = 7;
		
		for(int i = 0; i < myArr.length; i++) {
			for(int j = 0; j < myArr.length/2; j++) {
				if((myArr[i] + myArr[j] == target) && i != j) {
					System.out.println(myArr[i] + " + " + myArr[j] + " = " + target);
				}
			}
		}
	}

}
