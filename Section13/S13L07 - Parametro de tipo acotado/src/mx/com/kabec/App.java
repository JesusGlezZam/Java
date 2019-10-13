package mx.com.kabec;

class Data<K extends Integer,V extends App> {
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public <E extends Character,N extends Number> void display(E element, N number){
		System.out.println("Element: "+element+" Number: "+number);
	}
	
}

public class App {

	public static void main(String[] args) {
		Data<Integer,App> data = new Data<Integer,App>(1, new App());
		data.display('$', 1);
		data.display('S', 10.0);
		data.display('c', 20.0f);
		data.getValue().test();
        System.out.println(data.getKey());
        data.getValue().greeting();
        System.out.println(data.getValue().getIntegerValue());
        System.out.println(data.getValue().getIntegerValue(10));
	}
	
	public void test(){
		System.out.println("Testing....");
	}
	
	public void greeting() {
		System.out.println("Buenas tardes");
	}
	
	public int getIntegerValue() {
		return 1;
	}
	
	public int getIntegerValue(int value) {
		return value*10;
	}

}
