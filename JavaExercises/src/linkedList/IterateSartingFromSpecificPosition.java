package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateSartingFromSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		      l_list.add("Red");
		      l_list.add("Green");
		      l_list.add("Black");
		      l_list.add("White");
		      l_list.add("Pink");
		// set Iterator at specified index
		   Iterator p = l_list.listIterator(1);

		   // print list from second position
		   while (p.hasNext()) {
		   System.out.println(p.next());
		   }

	}

}
