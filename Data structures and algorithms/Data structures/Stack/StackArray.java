package hassan.com;

public class StackArray<T> {
	int size;
	Object[] ArrayStack;
	int top = -1;

	public StackArray(int size) // constrctor
	{
		this.size = size;
		ArrayStack = new Object[this.size];
	}

	public void push(Object newItem) {
		if (IsFull()) // if stack is full
		{
			System.out.println("stack is full");
			return;
		}
		top = top + 1;
		ArrayStack[top] = newItem;

	}

	public Boolean IsFull() {
		return (top == size - 1); // coundtion if fill or empaty
	}

	public T pop() {
		if (isImpaty()) {
			System.out.println("stack is empaty");
			return null;
		}
		T item = (T) ArrayStack[top];
		top = top - 1;
		return item;
	}

	public Boolean isImpaty() {
		return (top == -1);
	}

	public void display() {
		for (Object s : ArrayStack) {
			System.out.println(s);
		}
	}
}