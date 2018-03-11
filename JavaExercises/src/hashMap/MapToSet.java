package hashMap;

import java.util.HashMap;
import java.util.Set;

public class MapToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  hash_map.put(6, "Green");
		  // create set view for the map
		  Set set = hash_map.entrySet();
		  // check set values
		  System.out.println("Set values: " + set);
	}

}
