package mx.com.kabec;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		{
			File directory = new File("c:\\series\\europe\\data");
			directory.mkdirs();
			System.out.println("Directorio creado");
			File file = new File("c:\\series\\europe\\data\\series.txt");
			file.createNewFile();
			System.out.println("Archivo creado");
			
		}
	}
}
