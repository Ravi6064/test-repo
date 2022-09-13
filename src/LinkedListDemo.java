class Node {
	int value;
	Node next;
}

class LinkedList {

	Node startValue;

	public void insert(int x) {

		if (startValue == null) {
			Node n = new Node();
			n.value = x;
			startValue = n;
		} else {
			Node current = startValue;
			while (current.next != null) {
				current = current.next;
			}
			Node n = new Node();
			n.value = x;
			current.next = n;
		}

	}

	public void delete(int data) {
		boolean isDeleted = false;
		Node previous = null;
		Node current = startValue;
		while (current != null && current.next != null) {
			if (current.value == data) {
				if (previous == null) {
					current.next = null;
				} else {
					previous.next = current.next;
					current.next = null;
				}
				isDeleted = true;
			}
			previous = current;
			current = current.next;
		}
		if (!isDeleted) {
			System.out.println("Element does not exist " + data);
		}
	}

	public void insertAfterNumber(int data, int insertionNumber) {
		boolean isInserted = false;
		Node current = startValue;
		while (current.next != null) {
			if (current.value == insertionNumber) {
				Node current1 = current.next;
				Node n = new Node();
				n.value = data;
				n.next = current1;
				current.next = n;
				isInserted = true;
			}
			current = current.next;
		}
		if (!isInserted) {
			Node n = new Node();
			n.value = data;
			current.next = n;
		}

	}

	public void display() {
		Node current1 = startValue;
		while (current1.next != null) {
			System.out.println(current1.value);
			current1 = current1.next;
		}
		System.out.println(current1.value);
	}
}

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		l.insertAfterNumber(35, 30);
		l.display();
		System.out.println("----------------");
		l.delete(90);
		l.display();

	}

}
