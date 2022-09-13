import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Accc";
		String s2 = "ccca";

		if (s1.length() != s2.length()) {
			System.out.println("Not Anagrams");

		} else if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Anagrams");
		} else {
			char[] c1 = s1.toLowerCase().toCharArray();
			char[] c2 = s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (String.valueOf(c1).equalsIgnoreCase(String.valueOf(c2))) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}

	}

}
