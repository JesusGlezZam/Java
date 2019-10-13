package mx.com.kabec;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {

		IntPredicate lessThan18 = i->i<18;
		IntPredicate MoreThan10 = i->i>10;
		
		new App().demo(15, lessThan18, MoreThan10);

	}
	public void demo(int x, IntPredicate lessThan18, IntPredicate MoreThan10){
         if(lessThan18.and(MoreThan10).test(x)){
        	 System.out.println("Entrada válida: es menor que 18 y mayor a 10");
         }else{
        	 System.out.println("Entrada no válida");
         }
	}
	

}
