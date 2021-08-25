package hassan.com;

public class HashTeableDimo {

	public static void main(String[] args) {
		HashTable<String> hash = new HashTable<>(5);
		hash.put(10, "hassam");
		hash.put(11, "6m");
		hash.put(15, "ha54sam");
		hash.put(13, "has3am");
		System.out.println(hash.Get(10));
	}

}
