package arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] newArray = {20, 20, 30, 40, 50, 50, 50};
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		for(int a = 0; a < newArray.length; a++) {
			linkedList.add(newArray[a]);
		}
		
		for(int i = 0; i < linkedList.size(); i++) {
			for(int j = 0; j < linkedList.size(); j++) {
				if(linkedList.get(i) == linkedList.get(j) && i != j) {
					linkedList.remove(i);
				}
			}
		}
		
		System.out.println(linkedList);
	}

}
