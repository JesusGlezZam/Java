package mx.com.kabec;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		{
			File file = new File("studyeasy");
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
			   System.out.println("Escritura completada en el archivo");
			   bw.close();
				
			} catch (IOException e) {
				System.out.println("Ocurri{o un error al escribir en el archivo");
			}
			
			try {
				BufferedReader br = new BufferedReader(new FileReader("data\\series.txt"));
				String line;
				System.out.println("***********************");
				while((line = br.readLine()) != null){
					System.out.println(line);
				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
			} catch (IOException e) {
				System.out.println("IOException");
			}
			
		}
	}
}
