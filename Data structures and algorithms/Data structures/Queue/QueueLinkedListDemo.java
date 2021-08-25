package hassan.com;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		QueueLinkedList<Integer> li = new QueueLinkedList<Integer>(new NodeDouble<>(12, null, null));
		li.enQueueLInked(new NodeDouble<Integer>(13, null, null));
		System.out.println(li.deQueuelinked());
	}

}
