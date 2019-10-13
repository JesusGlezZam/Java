package mx.com.kabec;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack<Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		demo.push(100);
		
		if(demo.isEmpty()){
			System.out.println("La pila está vacía");
		}else{
			System.out.println("La pila no está vacía");
		}
		
		System.out.println(demo.search(56));
		
	}

}
