package mx.com.kabec;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names> {
	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length()) {
			return 0;
		} else if (name.length() < obj.name.length()) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return name;
	}
    
}

public class App {

	public static void main(String[] args) {

		List seriesNames = new LinkedList<>();
		seriesNames.add(new Names("Endeavour"));
		seriesNames.add(new Names("Inspector Morse"));
		seriesNames.add(new Names("Poirot"));
		seriesNames.add(new Names("The Shadow Line"));
		
		App app = new App();
		app.printList(seriesNames);
		
		Collections.sort(seriesNames);
		System.out.println("******************");
		app.printList(seriesNames);

	}

	void printList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}

}