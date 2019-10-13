package mx.com.kabec;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("data\\file_to_delete1.txt");
		if(file.delete()){
			System.out.println("Archivo borrado exitosamente");
		}else{
			System.out.println("Error al borrar el archivo");
		}

	}
}
