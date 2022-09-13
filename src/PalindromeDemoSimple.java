
public class PalindromeDemoSimple {

	public static void main(String[] args) {
		String s1 = "H".toLowerCase();
		StringBuffer sb = new StringBuffer(s1);
		if (s1.equals(sb.reverse().toString())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
