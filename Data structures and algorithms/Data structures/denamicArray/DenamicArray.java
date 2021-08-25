package hassan.com;

import java.util.Arrays;

public class DenamicArray {
	int[] data;
	int size;

	public DenamicArray() {
		size = 0;
		data = new int[size];
	}

	public int getIlment(int index) {
		return data[index];

	}

	public void addItem(int emint) {
		EnsureCiapcity(size + 1);
		data[size++] = emint;
	}

	public void EnsureCiapcity(int minCopcity) {
		int oldCapcity = data.length;
		if (minCopcity > oldCapcity) {
			int newCapcity = oldCapcity * 2;
			if (newCapcity < minCopcity)
				newCapcity = minCopcity;
			data = Arrays.copyOf(data, newCapcity);
		}

	}

	public int size() {
		return data.length;
	}
}
