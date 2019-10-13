package mx.com.kabec;

class Data{
	private Object obj;

	public Data(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
}

class GenericClass<T>{
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//Data data = new Data("Some String");
		Data data = new Data(1.0);
		
		//String variable =  (String) data.getObj();
		Double varDouble=(Double) data.getObj();
	    System.out.println(varDouble);
	    
	    Data dataInteger=new Data(900);
	    Integer varInteger=(Integer) dataInteger.getObj();
	    System.out.println(varInteger);
        
		
		
		//GenericClass<String> genericData = new GenericClass<String>("Some String from Generic");
		GenericClass<Double> genericData = new GenericClass<Double>(1.0);
		//String dataGeneric = genericData.getData();
		Double dataGeneric = genericData.getData();
		System.out.println(dataGeneric);
		
		GenericClass<Integer> genericDataInteger=new GenericClass<Integer>(900);
		Integer dataIntegerGeneric=genericDataInteger.getData();
		System.out.println(dataIntegerGeneric);

	}

}







