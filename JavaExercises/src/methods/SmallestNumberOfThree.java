package methods;

import java.util.Scanner;

public class SmallestNumberOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        
        smallest(x,y,z);
	}

	private static void smallest(double x, double y, double z) {
		// One way
		/*if (x < y && x < z) {
			System.out.println("Smallest: " + x);
		}
		else if (z < y && z < x) {
			System.out.println("Smallest: " + z);
		}
		else {
			System.out.println("Smallest: " + y);
		}*/
		
		//Other Way
		System.out.println(Math.min(Math.min(x, y), z));
	}

}
