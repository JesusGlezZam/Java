package mx.com.kabec;

interface Lambda{
	public void demo(); 
}

public class App {

	public static void main(String[] args) {
		
		Lambda lambda = ()->{
			System.out.println("Enunciado 1");
			System.out.println("Enunciado 2");
		};
		lambda.demo();
		
	}
}
