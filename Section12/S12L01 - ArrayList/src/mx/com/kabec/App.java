package mx.com.kabec;

import java.util.ArrayList;

public class App {

	static ArrayList<String> listSeriesNames = new ArrayList<>();
	
	public static void main(String[] args) {
		listSeriesNames.add("Endeavour");
		listSeriesNames.add("Inspector Morse");
		listSeriesNames.add("Poirot");
		listSeriesNames.add("The Shadow Line");
		listSeriesNames.add("The Hollow Crown");
		listSeriesNames.add("War and Peace");
		listSeriesNames.add("Professor T");
		listSeriesNames.add("IT Crowd");
		App app = new App();
		app.displayList(listSeriesNames);
	/*	app.removeNameByPosition(0);
		System.out.println("************");
		app.displayList(listNames);
		System.out.println("************");
		System.out.println(listNames.get(0));
		System.out.println(listNames.get(1)); */
		
		System.out.println("************");
		app.removeSeriesNameByString("The Shadow Line");
		app.displayList(listSeriesNames);
		System.out.println("************");
		System.out.println(listSeriesNames.get(5));
		

	}
	void displayList(ArrayList<String> names){
		for(String name: names){
			System.out.println(name);
		}
		
	}
	void removeSeriesNameByPosition(int position){
	   listSeriesNames.remove(position);
	}
	void removeSeriesNameByString(String name){
		listSeriesNames.remove(name);
	}

}
