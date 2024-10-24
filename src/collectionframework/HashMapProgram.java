package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProgram {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap map = new HashMap();
		HashMap<Integer, String> map = new HashMap<>();

		map.put(101, "John");
		map.put(102, "David");
		map.put(103, "Scott");
		map.put(104, "Mary");
		map.put(105, "Tye");
		map.put(103, "X");
		map.put(106, "David");

		System.out.println(map);
		System.out.println(map.get(105));
		map.remove(106);
		System.out.println(map);

		System.out.println(map.containsKey(101));
		System.out.println(map.containsKey(106));

		System.out.println(map.containsValue("Mary"));
		System.out.println(map.containsValue("Y"));

		System.out.println(map.isEmpty());
		System.out.println(map.size());

		System.out.println(map.keySet());
		System.out.println(map.values());

		System.out.println(map.entrySet());

//		for(int i:map.keySet()) {
//			System.out.println(i);
//		}
//		
//		for(String name:map.values()) {
//			System.out.println(name);
//		}

//		for(int i:map.keySet()) {
//			System.out.println(i+" "+map.get(i));
//		}

//		for (Map.Entry entry : map.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}

		Set s = map.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
