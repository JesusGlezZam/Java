package mx.com.kabec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Name implements Comparable<Name>{
	private String name;

	public Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}

	@Override
	public int compareTo(Name o) {
		return getName().compareTo(o.getName());
	}
	
}

public class App {

	public static void main(String[] args) {
		Set<Name> set = new HashSet<>();
		set.add(new Name("Chaand"));
		set.add(new Name("John"));
		set.add(new Name("Aafiya"));
		set.add(new Name("Armaan"));
		set.add(new Name("Mia"));
		set.add(new Name("Chaand"));
		
		
		List<Name> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);
		for(Name name: list){
			System.out.println(name);
		}
		System.out.println(Collections.binarySearch(list, new Name("TEst")));
		
	}

}




