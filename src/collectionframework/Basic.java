package collectionframework;

public class Basic {

	public static void main(String[] args) {
		
//		int[] a = new int[5];
//		Fixed size(Not Resizable)
//		Homogenous data(Same type of data)
//		No underlaying data structure(No Readymade methods)
		
//		Collection Framework - is a collection of interface and class which use to store group of objects.

//		1.Collection(I) -> Collections(C) { java.util, methods - sort() }
//		{add(object ob), addAll(Collection C), remove(object ob), removeAll(Collection C), retainAll(Collection C),
//		clear(), isEmpty(), size(), contains(object ob), containsAll(Collection C), toArray(Collection C)}
		
//		>A. List(I){Ordered collection, Duplicates allowed, Null Allowed} -> ArrayList(C), LinkedList(C)<-Deque(I), Vector(C) > Stack(C)
//		ArrayList(C){access value} -> {add(index, object ob), addAll(index, Collection C), remove(index), get(index),
//		set(index, object ob)}
		
//		LinkedList(C){insertion, deletion} -> {addFirst(object ob), addLast(object ob); removeFirst(object ob), removeLast(object ob); 
//	    getFirst(object ob), getLast(object ob)}
		
//		>B. Set(I){Unordered collection, Duplicates not allowed, Null Allowed} -> HashSet(C), LinkedHashSet(C)
//		HashSet(C){Unordered collection, fast access, Searching, unique elements} -> 
//		{add(), addAll(), remove(), removeAll(), contains(), containsAll(), isEmpty()}
//		LinkedHashSet(C) {Ordered Collection, fast access, Searching, unique elements} ->
//		{add(), addAll(), remove(), removeAll(), contains(), containsAll(), isEmpty()}
		
//		>C. Queue(I){Ordered collection, Prior to process} -> Deque(I), BlockingQueue(I), BlockingDeque(I), PriorityQueue(C), LinkedList(C)
		
//		2.Map(I){Unordered collection, Key(Duplicates not allowed):Value(Duplicates allowed)}-> HashMap(C), LinkedHashMap(C), Hashtable(C)
//		>HashMap(C){Searching is fast, Non-Synchronized(not thread safe), Performance High, one null keys/multiple null values, only duplicate values not key same as HashMap } -> 
//		{put(K,V), putAll(Map m), get(K), remove(K), containsKey(K), containsValue(V), isEmpty(), size(), clear(),
//		keySet(), values(), entrySet()> getKey(), getValue()}
		
//		>Hashtable(C){Synchronized(thread safe), Performance Low, Null not allowed (keys/values), only duplicate values not key same as HashMap} -> 
//		{put(K,V), putAll(Map m), get(K), remove(K), containsKey(K), containsValue(V), isEmpty(), size(), clear(), 
//	    keySet(), values(), entrySet()> getKey(), getValue()}
	}

}
