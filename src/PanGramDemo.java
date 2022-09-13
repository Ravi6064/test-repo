import java.util.HashSet;
import java.util.Set;

public class PanGramDemo {

	public static void main(String[] args) {
		String s1 = "abcdefghijklmnopqrstuXvwyzzzzzzz#@".toLowerCase();
		if (s1.isEmpty() || s1.length() < 26) {
			System.out.println("Not a pangram");
		}
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s1.length(); i++) {
			set.add(s1.charAt(i));
		}
		int a = 0;
		for (int i = 'a'; i <= 'z'; i++) {
			//System.out.println(i);
			if (!set.contains((char)i)) {
				a++;
				System.out.println("Not a pangram");
				break;
			}
		}
		if (a == 0) {
			System.out.println("Pangram");
		}
	}

}
