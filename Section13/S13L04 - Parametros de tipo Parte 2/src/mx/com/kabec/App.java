package mx.com.kabec;

class Data1<K,V>{
	private K key;
	private V value;
	public Data1(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public <E, N> void display(E element, N number){
		System.out.println("Element: "+element+ " Number: "+number);
	}
	
}

public class App {

	public static void main(String[] args) {
		Data1<Integer, String> data = new Data1<Integer, String>(1, "Chaand");
		
		System.out.println("Key: "+data.getKey()+" value: "+data.getValue());
		data.display("2.0", 25);
	}

}