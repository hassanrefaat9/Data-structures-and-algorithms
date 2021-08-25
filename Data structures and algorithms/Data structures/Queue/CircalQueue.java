package hassan.com;

public class CircalQueue {

	int Front; // beak last end
	int Rear; // first
	int lengh; // counter that counted deleted and added in queue
	int[] Queue; // this is basic queue
	int Size; // size array

	public CircalQueue(int Size) {
		this.Size = Size;
		Queue = new int[this.Size];
		Front = 0;
		Rear = Size - 1;
		lengh = 0;
	}

	public Boolean isEmpaty() { // Check if it is Empty
		return (lengh == 0);
	}

	public Boolean isFull() { // Check if it is full
		return (lengh == Size);
	}

	public void EnQueue(int elment) {
		if (isFull())
			System.out.println("the queue is full so you can not added");
		else {
			Rear = (Rear + 1) % Size; // how add in queue
			Queue[Rear] = elment;
			lengh++;
		}
	}

	public void Dequeue() {
		if (isEmpaty())
			System.out.println("the queue is empety so you con not delete");
		else {
			Front = (Front + 1) % Size;
			lengh--;
		}
	}

	public int getFront() {

		return Queue[Front];
	}

	public int getRear() {
		return Queue[Rear];
	}

	public void printQueue() { // how we do print the queue with for each
		for (int i = Front; i != Rear; i = (i + 1) % Size) {
			System.out.print(Queue[i] + " ");
		}
		System.out.print(Queue[Rear] + " ");
	}
}
