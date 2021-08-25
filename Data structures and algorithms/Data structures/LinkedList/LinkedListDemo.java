package hassan.com;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList(new Node<Integer>(12, null));
		ls.addFirst(new Node<Integer>(11, null));
		ls.addFirst(new Node<Integer>(10, null));
		ls.addFirst(new Node<Integer>(9, null));
		ls.dispaly();
		System.out.println("after delete");
		ls.deleteFirst();
		ls.dispaly();
	}

}
