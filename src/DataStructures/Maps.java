package DataStructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Implement map interfaces
		Map<Integer, String> hMap = new TreeMap<Integer, String>();
		mapUtility(hMap);

	}
	
	public static void mapUtility(Map<Integer, String> map) {
		// 1. Add key-Value pairs
		map.put(101, "Steve");
		map.put(502, "Roger");
		map.put(22, "Jennifer");
		map.put(315, "Mika");
		map.put(36, "Ellie");
		map.put(750, "Kelly");
		
		// 2. Access elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all key-value pairs: " + map);
		System.out.println(map.get(502));
		
		// 3. Iterate through map of key-value pairs?
		for(Integer key : map.keySet()) {
			System.out.println("[KEY: " + key + ".  VALUE: " + map.get(key) + "]");
		}
		
	}

}
