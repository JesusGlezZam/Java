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
		System.out.println("************");
        int position = app.search("Poirot");
        if(position != -1){
        	app.modifyName(position, "Beck");
        	app.displayList(listSeriesNames);	
        }else{
        	System.out.println("Invalid entry");
        }
		
	}
	void displayList(ArrayList<String> names){
		for(String name: names){
			System.out.println(name);
		}	
	}
	void modifyName(int position, String newName){
		listSeriesNames.set(position, newName);
	}
	
	int search(String name){
		return listSeriesNames.indexOf(name);
	}

}
