package hassan.com;

public class QueueArrayDemo {
	public static void main(String[] args) {
		QueueArray<String> q = new QueueArray<>(5);
		q.Enqueue("hassan");
		q.Enqueue("ali");
		q.Enqueue("mohamed ");

		System.out.println(q.Dequeu());
	}
}
