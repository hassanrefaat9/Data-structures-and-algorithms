package hassan.com;

public class HashTable<T> {
	Entry[] array;
	int size;

	public HashTable() {
	}

	public HashTable(int size) {
		this.size = size;
		array = new Entry[this.size];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Entry<T>();
		}
	}

	int getHash(int key) {
		return key % size; // many ways
	}

	public void put(int key, T valuo) {
		int index = getHash(key);
		Entry ArrayValuo = array[index];
		Entry newItem = new Entry<T>(key, valuo);
		newItem.next = ArrayValuo.next;
		ArrayValuo.next = newItem;

	}

	public T Get(int key) {
		T valuo = null;
		int index = getHash(key);
		Entry ArrayValuo = array[index];
		while (ArrayValuo.next != null) {
			if (ArrayValuo.GetKey() == key) {
				valuo = (T) ArrayValuo.GetValuo();
				break;
			}
			ArrayValuo = ArrayValuo.next;
		}
		return valuo;
	}
}
