package arrays;

import java.util.LinkedList;

public class FindDuplicateValuesOfArrayOfStringValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] newArray = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		LinkedList<String> linkedList = new LinkedList<String>();
		
		for(int a = 0; a < newArray.length; a++) {
			linkedList.add(newArray[a]);
		}
		
		for(int i = 0; i < linkedList.size(); i++) {
			for(int j = i+1; j < linkedList.size(); j++) {
				if(linkedList.get(i).toLowerCase() == linkedList.get(j).toLowerCase()) {
					linkedList.remove(i);
				}
			}
		}
		
		System.out.println(linkedList);
	}

}
