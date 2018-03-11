package strings;

import java.util.Calendar;

public class PrintCurrentDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
	    System.out.println("Current Date and Time :"); 
	    System.out.format("%tB %te, %tY%n", c, c, c);
	    System.out.format("%tl:%tM %tp%n", c, c, c); 
	}

}
