package collectionframework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare LinkedList
		LinkedList l = new LinkedList(); // No Default size
//		LinkedList<Integer> ll = new LinkedList<>();
//		LinkedList<String> ll = new LinkedList<>();
//		List<Integer> ll = new LinkedList<>();
		
		l.add(1);
//		l.add("Tushar");
//		l.add(34.45);
//		l.add('A');
//		l.add(null);
//		
//		System.out.println(l);
//		System.out.println(l.size());
//		l.remove(3);
//		System.out.println(l);
//		l.add(2, true);
//		System.out.println(l);
//		
//		System.out.println(l.get(2));
//		l.set(4, 'N');
//		System.out.println(l);
//		
//		System.out.println(l.contains(false));
//		System.out.println(l.contains('N'));
//		
//		System.out.println(l.isEmpty());
		
//		for(int i =0;i<l.size();i++) {
//			System.out.print(l.get(i));
		
//			if(i<l.size()-1)
//				System.out.print(" ");
//		}
		
		int i = 0;
		
//		for(Object ob:l) {
//			System.out.print(ob);
//			
//			if(i<l.size()-1)
//				System.out.print(" ");
//			i++;
//		}
		
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next());
//			
//			if(i<l.size()-1)
//				System.out.print(" ");
//			i++;
//		}
		
		LinkedList<Character> ll = new LinkedList<>();
		ll.add('D');
		ll.add('V');
		ll.add('A');
		ll.add('B');
		ll.add('N');
		
//		System.out.println(ll);
//		Collections.sort(ll);
//		Collections.sort(ll, Collections.reverseOrder());
//		Collections.shuffle(ll);
//		ll = ll.reversed();
		
		System.out.println(ll);
		
		List<Character> l1 = new LinkedList<>();
		l1.add('Z');
		l1.add('C');
		l1.add('J');
		
//		ll.addAll(l1);
//		System.out.println(ll);
//		ll.removeAll(l1);
//		System.out.println(ll);
//		ll.addAll(1, l1);
//		System.out.println(ll);
		
//		System.out.println(l1);
//		l1.addFirst('A');
//		l1.addLast('F');
//		System.out.println(l1);
//		
//		System.out.println(l1.getFirst());
//		System.out.println(l1.getLast());
//		
//		l1.removeFirst();
//		l1.removeLast();
//		System.out.println(l1);
		
//		String[] str = {"Dog","Cat","Rat"};
//		for(String s:str) {
//			System.out.print(s);
//			
//			if(i<str.length-1)
//				System.out.print(" ");
//			i++;
//		}
//		
//		System.out.println();
//		List<String> l2 = new LinkedList<>(Arrays.asList(str));
//		System.out.println(l2);
	}
}
