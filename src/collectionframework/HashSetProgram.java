package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetProgram {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet(); // By Default size is 16, Load Factor(Fill ratio) is 0.75
//		HashSet<Integer> set = new HashSet<>(100(size), 0.80(LoadFactor));
//		HashSet<String> set = new HashSet<>();
//		Set<String> set = new HashSet<>();
		
		set.add(100);
		set.add("welcome");
		set.add(16.4);
		set.add('A');
		set.add(true);
		set.add(null);
		
		System.out.println(set);
		
		set.remove(16.4);
		System.out.println(set);
		System.out.println(set.contains(16.4));
		System.out.println(set.isEmpty());
		
		int i =0;
//		for(Object s: set) {
//			System.out.print(s);
//			
//			if(i<set.size()-1)
//				System.out.print(" ");
//			i++;
//		}
		
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next());
//			
//			if(i<set.size()-1)
//				System.out.print(" ");
//			i++;
//		}
		
//		HashSet<Integer> evenNumber = new HashSet<>();
//		
//		evenNumber.add(2);
//		evenNumber.add(4);
//		evenNumber.add(6);
//		
//		System.out.println(evenNumber);
//		
//        HashSet<Integer> numbers = new HashSet<>();
//		
//        numbers.add(2);
//        numbers.add(4);
//        numbers.add(6);
//        
//        System.out.println(numbers);
//        
//        evenNumber.addAll(numbers);
//        evenNumber.add(10);
//        System.out.println(evenNumber);
//        
//        evenNumber.removeAll(numbers);
//        System.out.println(evenNumber);
		
		HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        
        System.out.println(set1);
        
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println(set2);
        
        //union
//        set1.addAll(set2);
//        System.out.println(set1);
        
        //intersection
//        set1.retainAll(set2);
//        System.out.println(set1);
        
        //difference
//        set1.removeAll(set2);
//        System.out.println(set1);
        
        //subset
        System.out.println(set1.containsAll(set2));
	}

}
