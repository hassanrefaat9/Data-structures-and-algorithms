package hassan.com;

public class Entry<T> {
	int key;
	T valuo;
	Entry next;

	public Entry(int key, T valuo) {
		this.key = key;
		this.valuo = valuo;
		next = null;
	}

	public Entry() {
		next = null;
	}

	public int GetKey() {
		return key;
	}

	public T GetValuo() {
		return valuo;
	}
}
