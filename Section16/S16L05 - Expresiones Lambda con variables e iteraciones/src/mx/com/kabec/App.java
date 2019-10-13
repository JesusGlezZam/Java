package mx.com.kabec;

import java.util.ArrayList;
import java.util.List;

class Data{
	private String seriesName;

	public Data(String seriesName) {
		super();
		this.seriesName = seriesName;
	}

	@Override
	public String toString() {
		return "Data [name=" + seriesName + "]";
	}

	public String getSeriesName() {
		return seriesName;
	}
	
}

public class App {

	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Endeavour"));
		list.add(new Data("Inspector Morse"));
		list.add(new Data("Poirot"));
		list.add(new Data("The Shadow Lin"));
		list.add(new Data("The Hollow Crown"));
	
	    list.forEach(temp->{
	    	
	    	System.out.println(temp.getSeriesName());
	    });
		
		
		
	}

}
