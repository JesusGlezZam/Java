package mx.com.kabec;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		{
			File file = new File("series.txt");
			file.createNewFile();
			System.out.println("Archivo creado");

		}
	}
}
