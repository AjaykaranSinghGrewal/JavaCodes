package linkedList;

import java.util.LinkedList;

public class ReverseIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		
		for (int i = l_list.size()-1; i >= 0; i--){
			System.out.println(l_list.get(i));
		}

	}

}
