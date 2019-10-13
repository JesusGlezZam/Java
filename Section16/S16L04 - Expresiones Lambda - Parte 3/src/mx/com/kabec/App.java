package mx.com.kabec;

interface Lamda{
	abstract public int demo();
	
}

public class App {
	public static void main(String[] args) {
		Lamda lamda = ()->{
		    System.out.println("Enunciado 1");	
			return 10;
		};
			
		System.out.println(lamda.demo());
	
		
	}

}
