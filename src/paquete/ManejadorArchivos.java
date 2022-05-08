package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManejadorArchivos {
	public static List<Granito> leer(String archivo) {
		List<Granito> granitos = new ArrayList<Granito>();
		try {
			
			Scanner lectura = new Scanner(new File(archivo));
			int cant = lectura.nextInt();
			for(int i=0; i<cant; i++) {
				granitos.add(new Granito(lectura.nextInt(), lectura.nextInt()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return granitos;
	}
	
	public static void escribir(String archivo, int cant) {
		FileWriter fw;
		try {
			
			fw = new FileWriter(archivo);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(cant);
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
