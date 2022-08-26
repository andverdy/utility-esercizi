package algoritmi;

import java.util.HashSet;
import java.util.Set;

public class SetProva {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
//		set.add(-5);
//		set.add(-4);
//		set.add(-3);
//		set.add(-2);
//		set.add(-1);
//		set.add(0);
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		set.add(5);
//
//		for (Integer num : set) {
//			System.out.println(num);
//		}
		
		Integer i = -5;
		Integer v;
		for(i = -5;i<=5; i++ ) {
			v = new Integer(i);
			set.add(v);
		}
		
		
		System.out.println(set);
		
		
		

	}
}
