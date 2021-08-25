package hassan.com;

public class LinkedList {
	Node head;

	public LinkedList(Node head) {
		this.head = head;
	}

	public void addFirst(Node newNode)// bio=(1)
	{
		newNode.next = head;
		head = newNode;

	}

	public void deleteFirst() // bio=(1)
	{
		head = head.next;
	}

	public void dispaly() {
		Node n = head;
		while (n != null) {
			System.out.println(n.valuo);
			n = n.next;

		}
	}
}
