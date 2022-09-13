import java.util.HashMap;
import java.util.Map;

public class AnagramOptmizedOne {

	public static void main(String[] args) {

		String s1 = "Hellooo".toLowerCase();
		String s2 = "olo0lHe".toLowerCase();
		if(s1.length()!=s2.length()) {
			System.out.println("Not anagram");
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				int count = map.get(s1.charAt(i));
				map.put(s1.charAt(i), count + 1);
			} else {
				map.put(s1.charAt(i), 1);
			}
		}
		int a = 0;
		for (int i = 0; i < s2.length(); i++) {
			if (map.containsKey(s2.charAt(i))) {
				int count = map.get(s2.charAt(i));
				map.put(s2.charAt(i), count - 1);
			} else {
				System.out.println("Its not anagram");
				a++;
				break;
			}
		}
		if (a == 0) {

			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() == 0) {
					a++;
				}
			}
			if (a == map.size()) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}

	}

}
