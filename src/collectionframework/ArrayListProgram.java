package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Declare ArrayList
		ArrayList lst = new ArrayList();// By Default size is 10
//		ArrayList<Integer> lst = new ArrayList<>();
//		ArrayList<String> lst = new ArrayList<>();
//		List<Integer> lst = new ArrayList<>();
		
		lst.add(1);
//		lst.add("Tushar");
//		lst.add('A');
//		lst.add(3.45);
//		
//		lst.add(1, true);
//		System.out.println(lst);
//		System.out.println(lst.size());
//		lst.remove(2);
//		System.out.println(lst.get(2));
//		lst.set(2, "Arjun");
//		System.out.println(lst.isEmpty());
//		System.out.println(lst.contains(false));
		
//		addAll(), removeAll() 
//		System.out.println(lst);
		
//		for(int i =0;i<lst.size();i++) {
//			System.out.print(lst.get(i));
		
//			if(i< lst.size()-1)
//				System.out.print(" ");
//		}
		
//		int i = 0;
		
//		for(Object ob: lst) {
//			System.out.print(ob);
//			
//			if(i<lst.size()-1)
//				System.out.print(" ");
//			i++;
//		}
		
//		Iterator it = lst.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next());
//			
//			if(i<lst.size()-1)
//				System.out.print(" ");
//			i++;
//		}
		
		
		List<Integer> ls = new ArrayList<>();
		ls.add(23);
		ls.add(20);
		ls.add(35);
		ls.add(15);
		ls.add(5);
		
		System.out.println(ls);
//		Collections.sort(ls);
//		Collections.sort(ls, Collections.reverseOrder());
//		Collections.shuffle(ls);
//	    ls = ls.reversed();
//		System.out.println(ls);
		
//		List<Integer> ls1 = new ArrayList<>();
//		ls1.add(21);
//		ls1.add(25);
//		ls1.add(40);
//		System.out.println(ls1);
//		
//		ls.addAll(ls1);
//		System.out.println(ls);
//		ls.removeAll(ls1);
//		System.out.println(ls);
//		ls.addAll(1, ls1);
//		System.out.println(ls);
		
		String[] str = {"Dog", "Cat", "Rat"};
		for(String s:str) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		ArrayList lst2 = new ArrayList(Arrays.asList(str));
		System.out.println(lst2);
		
	}

}
