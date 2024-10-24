package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetProgram {

	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare LinkedHashSet
//		HashSet lset = new HashSet();
		LinkedHashSet lset = new LinkedHashSet();
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
//		LinkedHashSet<String> lhs = new LinkedHashSet<>();
//		Set lhs = new LinkedHashSet<>();
		
		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		
		System.out.println(lset);
		
		//All methods same as HashSet
	}

}
