package hassan.com;

public class NodeDouble<T> {
	T valuo;
	NodeDouble next;
	NodeDouble prevouse;

	public NodeDouble(T valuo, NodeDouble next, NodeDouble prevouse) {
		this.next = next;
		this.prevouse = prevouse;
	}
}
