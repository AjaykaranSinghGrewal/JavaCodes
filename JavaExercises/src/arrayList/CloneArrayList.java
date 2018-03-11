package arrayList;

import java.util.ArrayList;

public class CloneArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c1= new ArrayList<String>();
		ArrayList<String> newc1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        newc1 = (ArrayList<String>) c1.clone();
        System.out.println("Cloned array list: " + newc1);
	}

}
