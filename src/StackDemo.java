import java.util.ArrayList;
import java.util.List;

public class StackDemo {

	static int top = -1;

	static List<Integer> list = new ArrayList<>();

	public static void push(int n) {
		list.add(n);
		top++;
	}

	public static int pop() {
		return list.remove(top--);
	}

	public static void main(String[] args) {

		push(10);
		push(20);
		push(5);
		push(30);
		push(3);
		push(90);

		System.out.println(pop());
		System.out.println(pop());
		
		push(200);
		System.out.println(pop());

		System.out.println(list);

	}

}
