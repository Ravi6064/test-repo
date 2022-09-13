import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println(n + " is armstrong number ");
			} else if (n > 0) {
				int len = String.valueOf(n).length();
				int quo = n;
				int rem = 0;
				double sum = 0;
				while (quo > 0) {

					rem = quo % 10;
					quo = quo / 10;
					sum = sum + Math.pow(Double.valueOf(rem), Double.valueOf(len));
				}
				if (sum == n) {
					System.out.println(n + " is armstrong number ");
				} else {
					System.out.println(n + " is not armstrong number ");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
