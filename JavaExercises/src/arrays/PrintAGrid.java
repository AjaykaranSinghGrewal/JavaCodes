package arrays;

public class PrintAGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i < 10; i++) {
			System.out.println("0 0 0 0 0 0 0 0 0 0");
			System.out.println();
		}*/
		
		int [][]a = new int[10][10];    
		 for(int i = 0; i < 10; i++)
		   {
		      for(int j = 0; j < 10; j++)
		      {
		         System.out.printf("%2d ", a[i][j]);
		      }
		      System.out.println();
		   }
	}

}
