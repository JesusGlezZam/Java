package mx.com.kabec;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		{
			File file = new File("data");
			file.mkdir();
			file = new File("data\\series.txt");
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
			   bw.write("Endeavour");	
			   bw.newLine();
			   bw.write("Inspector Morse");
			   bw.newLine();
			   bw.write("Poirot");
			   bw.newLine();
			   bw.write("The Shadow Line");
			   bw.newLine();
			   bw.write("The Hollow Crown");
			   System.out.println("Escritura del archivo completada");
			  
				
			} catch (IOException e) {
				System.out.println("Un error ocurrió al escribir el archivo");
			}
			
			
		}
	}
}
