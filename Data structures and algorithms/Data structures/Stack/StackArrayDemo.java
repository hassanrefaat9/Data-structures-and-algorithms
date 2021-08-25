package hassan.com;

public class StackArrayDemo {

	public static void main(String[] args) {
		StackArray<Integer> st = new StackArray<>(5);
		st.push(10);
		st.push(12);
		st.push(30);
		st.push(40);
		System.out.println(st.pop());
		st.display();

	}

}
