package linkedList;

import java.util.LinkedList;

public class RemoveAndReturnFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> c1 = new LinkedList <String> ();
	      c1.add("Red");
	      c1.add("Green");
	      c1.add("Black");
	      c1.add("White");
	      c1.add("Pink");
	      System.out.println("Original linked  list: " + c1);
	       
	 System.out.println("Removed element: "+c1.pop());
	 
	 System.out.println("Linked list after pop operation: "+c1);
	}

}
