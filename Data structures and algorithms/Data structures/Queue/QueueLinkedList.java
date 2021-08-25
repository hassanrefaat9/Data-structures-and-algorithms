package hassan.com;

public class QueueLinkedList<T> {
	NodeDouble<T> Front;
	NodeDouble<T> Rear;

	public QueueLinkedList() {
	}

	public QueueLinkedList(NodeDouble newNode) {
		Rear = newNode;
		Front = newNode;
	}

//add items
	public void enQueueLInked(NodeDouble newNode) {
		Rear.next = newNode;
		newNode.next = null;
		newNode.prevouse = Rear;
		Rear = newNode;
	}

	public T deQueuelinked() {
		T valuo = Front.valuo;
		Front = Front.next;
		Front.prevouse = null;
		return valuo;
	}

}
