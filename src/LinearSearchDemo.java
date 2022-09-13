
public class LinearSearchDemo {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int key = 50;
		int b = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == key) {
				System.out.println(" number exists " + a[i]);
				b++;
				break;
			}
		}
		if (b == 0) {
			System.out.println(" Number not exists ");
		}

	}

}
