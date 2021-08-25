package hassan.com;

public class CircalQueueDimo {
	public static void main(String[] args) {
		CircalQueue d = new CircalQueue(10);
		d.EnQueue(10);
		d.EnQueue(20);
		d.EnQueue(30);
		d.EnQueue(40);
		d.EnQueue(50);
		d.EnQueue(80);
		d.EnQueue(90);
		d.EnQueue(980);
		d.printQueue();
		System.out.println("\n this aftre delete");
		d.Dequeue();
		d.Dequeue();
		d.Dequeue();
		d.printQueue();
		System.out.println("Front euqel");
		System.out.println(d.getFront());
		System.out.println("rear euqel");
		System.out.println(d.getRear());
		d.EnQueue(60);
		System.out.println("Front euqel");
		System.out.println(d.getFront());
		System.out.println("rear euqel");
		System.out.println(d.getRear());
	}
}
