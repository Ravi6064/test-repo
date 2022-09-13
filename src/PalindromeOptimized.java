
public class PalindromeOptimized {

	public static void main(String[] args) {

		String s1 = "HaiiaHaa".toLowerCase();
		int mid = s1.length() / 2 - 1;

		int count = 0;
		for (int i = 0; i <= mid; i++) {
			if (!(s1.charAt(i) == s1.charAt(s1.length() - i - 1))) {
				System.out.println("Not a palindrome");
				count = 1;
				break;
			}
		}

		if (count == 0) {
			System.out.println("Palindrome");
		}
	}

}
