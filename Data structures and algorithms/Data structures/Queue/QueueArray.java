package hassan.com;

public class QueueArray<T> {
	Object[] ArrayQueue;
	int front;// first item add
	int rear;// last item add
	int size;// size of queue

	public QueueArray(int size) {
		this.size = size;
		ArrayQueue = new Object[this.size];
		front = -1;
		rear = -1;
	}

	public void Enqueue(Object newItem) {
		if (isFull()) {
			System.out.println("queue is empaty");
			return;
		}
		rear = rear + 1;
		ArrayQueue[rear] = newItem;
		if (front == -1)// only execute one time
			front = 0;
	}

	public T Dequeu() {
		if (isEmpaty()) {
			System.out.println("queue is full");
			return null;
		}
		T objectOut = (T) ArrayQueue[front];
		front = front + 1;
		return objectOut;
	}

	Boolean isFull() {
		return (rear == size - 1);

	}

	Boolean isEmpaty() {
		return (front == -1 || front > rear);
	}
}
