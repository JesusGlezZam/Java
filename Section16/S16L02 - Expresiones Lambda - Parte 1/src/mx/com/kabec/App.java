package mx.com.kabec;

public class App {

	public static void main(String[] args) {
		
	    new Thread(()->{			
			System.out.println("Dentro de thread 1");
			System.out.println("Esta es la línea 2");
			}).start();;

	}
}
 