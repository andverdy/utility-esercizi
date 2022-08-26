package algoritmi;

import java.util.TreeSet;

public class StrutturaSetOrdinataSenzaDuplicati {

	public static void main(String[] args) {
//		Set<Integer> hash_Set = new HashSet<Integer>();
//
//		hash_Set.add(2);
//		hash_Set.add(5);
//		hash_Set.add(1);
//		hash_Set.add(7);
//		hash_Set.add(1);
//
//		Iterator<Integer> it = hash_Set.iterator();
//	     while(it.hasNext()){
//	        System.out.println(it.next());
//	     }
//	     
	     
	     
	     TreeSet<Integer> ts = new TreeSet<Integer>();
	     ts.add(16);
	     ts.add(16);
	     ts.add(777);
	     ts.add(1);
	     ts.add(10025);
	     ts.add(25);
	     System.out.println(ts);
	     for (Integer s: ts)
	         System.out.println(s);
	}

}
