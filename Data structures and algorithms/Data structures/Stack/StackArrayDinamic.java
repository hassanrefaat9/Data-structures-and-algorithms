package hassan.com;

import java.util.Arrays;

public class StackArrayDinamic<T> {
	int Size;
	Object[] ArrayStack;
	int top;

	public StackArrayDinamic(int Size) {
		this.Size = Size;
		ArrayStack = new Object[Size];
		top = -1;
	}

	public void ensureCapcity(int miCapcity) {
		int oldCapsity = ArrayStack.length;
		if (miCapcity > oldCapsity) {
			int newCapcity = oldCapsity * 2;
			if (miCapcity < oldCapsity)
				newCapcity = oldCapsity;
			ArrayStack = Arrays.copyOf(ArrayStack, newCapcity);
		}
	}

	public void push(Object newItem) {
		ensureCapcity(top + 1);
		// if(top!=Size-1) {
		// if(isFull())
		// {
		// System.out.println("stack is full");
		// return;
		// }
		top = top + 1;
		ArrayStack[top] = newItem;
		// }
	}

	public boolean isFull() {
		return (top == Size - 1);
	}

	public T pop() {
		if (isImpate()) {
			System.out.println("stac is empaty");
			return null;
		}

		T item = (T) ArrayStack[top];
		top = top - 1;
		return item;
	}

	public Boolean isImpate() {
		return (top == -1);
	}
}
