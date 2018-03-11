package linkedList;

import java.util.LinkedList;

public class RemoveAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<String>();
		   // use add() method to add values in the linked list
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		          l_list.add("Pink");
		          l_list.add("orange");
		      
		     // print the list
		   System.out.println("The Original linked list: " + l_list);

		  // Removing all the elements from the linked list
		   
		   /*//One Way 
		   l_list.removeAll(l_list);*/
		   
		   //Another way
		   l_list.clear();
		 
		    System.out.println("The New linked list: " + l_list);

	}

}
