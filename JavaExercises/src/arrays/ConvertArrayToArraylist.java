package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
		ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
		  
		System.out.println(list);
	}

}
