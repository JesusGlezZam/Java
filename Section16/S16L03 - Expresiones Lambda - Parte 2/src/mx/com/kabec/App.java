package mx.com.kabec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data {
	private String seriesName;

	public Data(String seriesName) {
		super();
		this.seriesName = seriesName;
	}

	public String getSeriesName() {
		return seriesName;
	}

	@Override
	public String toString() {
		return "Data [name=" + seriesName + "]";
	}

}

public class App {

	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Endeavour"));
		list.add(new Data("Inspector Morse"));
		list.add(new Data("Poirot"));
		list.add(new Data("The Shadow Line"));
		list.add(new Data("The Hollow Crown"));

		/*
		 * Collections.sort(list, new Comparator<Data>() {
		 * 
		 * @Override public int compare(Data o1, Data o2) { return
		 * o1.getSeriesName().compareTo(o2.getSeriesName()); } });
		 */

		Collections.sort(list, (Data o1, Data o2) -> {

			if (o1.getSeriesName().length() < o2.getSeriesName().length()) {
				return -1;
			} else if (o1.getSeriesName().length() > o2.getSeriesName().length()) {
				return 1;
			} else {
				return 0;
			}

		});

		for (Data data : list) {
			System.out.println(data.getSeriesName());
		}

	}
}
