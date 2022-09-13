
public class SecondLargestNum {

	public static void main(String[] args) {
		int a[] = { 4, 5, 1, 20, 39, 7, 8 };
		int firstLargest = 0;
		int secondLargest = 0;
		//O(n)
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				if (a[i] > firstLargest) {
					firstLargest = a[i];
				} if (a[i + 1] > secondLargest) {
					secondLargest = a[i + 1];
				}
			} else {
				if (a[i + 1] > firstLargest) {
					firstLargest = a[i + 1];

				} if (a[i] > secondLargest) {
					secondLargest = a[i];
				}
			}
		}
		System.out.println(firstLargest + " " + secondLargest);

	}

}
