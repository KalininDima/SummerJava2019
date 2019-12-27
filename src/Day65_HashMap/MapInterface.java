package Day65_HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;



/*
 * Data Structure:
 * 				-Arrays
 * 				-Collections framework
 * 				-Map
 * 
 * Map Interface: accepts key and value , both key and value does not support primitives
 * 
 * Set<Value>
 * Map<Key, Value>
 * 
 * Implemented by HAshMap(C), LinkedHAshMap(C), HashTable(C)
 * 
 * extended by SortedMap(I)
 * 
 * SortedMap(I) is implemented by TreeMap(C)
 * 
 * 
 * 
 *  Map<Key, Value> map1 = HashMap<>();
 *  Map<Key, Value> map2 = LinkedHashMap<>();
 *  Map<Key, Value> map3 = HashTable<>();
 *  Map<Key, Value> map4 = TreeMap<>();
 *  
 *  SrtedMap<Key, Value> = new TreeMap<>();
 *  
 *  put(key,value); inserts key and value object to the map
 *  
 *  get(key); retrives the value of the given key
 *  
 *  remove(key); removes the given key object and its value
 *  
 * 	size(); return size of the Map
 * 
 * 	containsKey(Key); verifies if the given key is exist in the Map. Returns boolean
 * 
 * 	containsValue(Value): verifies if the given value is exist in the Map. Returns boolean
 * 
 * keySet(); returns all the keys as Set Interface
 * 
 * clear(): remove everything
 * 
 * HashMap(C): does not maintain the insertion order as its 
 * 
 * LinkedHashMap(C): maintains the insertion order as its
 * 			doubly linked: 
 * 
 * 
 */
public class MapInterface {
	
	public static void main(String[] args) {
		
		Map<String,Double> employyes = new HashMap<>();
		
		//put();
		employyes.put("Dima", 321112.99);
		employyes.put("Valia", 412124.33);
		employyes.put("Ruslan", 4.33);
		System.out.println(employyes);
		double salary1 = employyes.get("Ruslan");
		System.out.println(salary1);
		
		System.out.println(employyes.get("Dima"));
		System.out.println(employyes.get("Valia"));
		
		System.out.println(employyes.size());
		
		Boolean a = employyes.containsKey("Kalinin");
		System.out.println(a);
		boolean b = employyes.containsKey("Dima");
		System.out.println(b);
		
		boolean d = employyes.containsValue(10000031);
		System.out.println(d);
		
		Set<String> set = employyes.keySet();
		System.out.println(set);
		
		Map <String, Integer> map1 = new LinkedHashMap<>();
		map1.put("A", 100);
		map1.put("A", 10);
		map1.put("A", 1);
		map1.put("A", 2);
		map1.put("A", 9);
		
		System.out.println(map1);
	}

}
