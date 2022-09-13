import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class NthLargestNumber {

	public static void main(String[] args) {
		int a[] = { 10, 30, 40, 56, 78, 987, 876, 12, 30 };
		Set<Integer> set = new TreeSet<>();
		for (Integer e : a) {
			set.add(e);
		}
		System.out.println(set.size());
		System.out.println(new ArrayList<>(set).get(set.size() - 4));
	}

}
