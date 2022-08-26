package algoritmi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortComparator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(131);
		list.add(13);
		list.add(31);
		list.add(1);
		list.add(3);
		list.add(24);
		list.add(65);

		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer lhs, Integer rhs) {
				// -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
				return lhs < rhs ? -1 : (lhs > rhs) ? 1 : 0;
			}
		});
		System.out.println(list);
	}
}
