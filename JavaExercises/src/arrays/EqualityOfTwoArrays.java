package arrays;

public class EqualityOfTwoArrays {
	private static String equalOrNot;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 =  {2, 5, 7, 9, 11};
		int[] array2 =  {2, 5, 7, 9, 11};
		int[] array3 =  {2, 5, 7, 9, 12};
		  
		equality_checking_two_arrays(array1,  array2);
		equality_checking_two_arrays(array1, array3);
	}

	private static void equality_checking_two_arrays(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		if(array1.length == array2.length) {
			for (int i = 0; i <  array1.length; i++) {
				if (array1[i] == array2[i]) {
					equalOrNot = "Equal";
					continue;
				}
				else if (array1[i] != array2[i]) {
					equalOrNot = "Not Equal";
					break;
				}
			}
		}
		System.out.println(equalOrNot);
	}

}
