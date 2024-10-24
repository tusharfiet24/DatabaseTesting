package collectionframework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableProgram {
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {

		Hashtable<Integer, String> t = new Hashtable<>(); // By Default size is 11, Load Factor is 0.75
//		Hashtable<Integer, String> t = new Hashtable<>(100);
//		Hashtable<String, Integer> t = new Hashtable<>(100, 0.80);
//		Map t = new Hashtable();

		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Smith");
//		t.put(null, "X");
//		t.put(104, null);
		System.out.println(t);
		System.out.println(t.get(103));
		System.out.println(t.getOrDefault(105, "Default"));
		t.remove(102);
		System.out.println(t);

		System.out.println(t.containsKey(103));
		System.out.println(t.containsKey(102));

		System.out.println(t.containsValue("Smith"));
		System.out.println(t.containsValue("Y"));

		System.out.println(t.isEmpty());

		System.out.println(t.keySet());
		System.out.println(t.values());

//		for(int k:t.keySet()) {
//			System.out.println(k+" "+t.get(k));
//		}

//		for (Map.Entry entry : t.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}
		
		Set s = t.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry) it.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
