package mx.com.kabec;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T>{
	private T myVariable;

	public Data(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
}

public class App {
 public static void main(String[] args) {
		List<Data<Integer>> elements = new LinkedList<>();
		List<Data<String>> elementsString = new LinkedList<>();
		List<Data<Double>> elementsDouble = new LinkedList<>();
		List<Data<Float>> elementsFloat = new LinkedList<>();
		elementsString.add(new Data<String>("Some text"));
		elementsDouble.add(new Data<Double>(1.0));
		elements.add(new Data<Integer>(1));
		elementsString.add(new Data<String>("%"));
		elementsFloat.add(new Data<Float>(5.0f));
		
		App app=new App();
		app.displayInteger(elements);
		app.displayString(elementsString);
		app.displayDouble(elementsDouble);
		app.displayFloat(elementsFloat);
}
 
 void displayInteger(List<Data<Integer>> list) {
	 ListIterator<Data<Integer>> iterator= list.listIterator();
	 while(iterator.hasNext()) {
		 System.out.println("Element Integer: "+iterator.next().getMyVariable());
	 }
 }
 void displayString(List<Data<String>> list) {
	 ListIterator<Data<String>> iterator= list.listIterator();
	 while(iterator.hasNext()) {
		 System.out.println("Element String: "+iterator.next().getMyVariable());
	 }
 }
 void displayDouble(List<Data<Double>> list) {
	 ListIterator<Data<Double>> iterator= list.listIterator();
	 while(iterator.hasNext()) {
		 System.out.println("Element Double: "+iterator.next().getMyVariable());
	 }
 }
 void displayFloat(List<Data<Float>> list) {
	 ListIterator<Data<Float>> iterator= list.listIterator();
	 while(iterator.hasNext()) {
		 System.out.println("Element Float: "+iterator.next().getMyVariable());
	 }
 }

}


