package paquete;

import java.util.ArrayList;
import java.util.List;

public class Actividad {

	public static void main(String[] args) {
		List<Granito> granitos = ManejadorArchivos.leer("src/paquete/in.txt");
		granitos.sort(new ComparadorOrdenadorAncho());
		List<PilaGranito> pilasGranitos = new ArrayList<PilaGranito>();
		pilasGranitos.add(new PilaGranito(granitos.get(0)));
		for(int i=1; i<granitos.size(); i++) {
			int j=0;
			while(j<pilasGranitos.size() && !pilasGranitos.get(j).agregar(granitos.get(i))) {
				j++;
			}
			if(j==pilasGranitos.size()) {
				pilasGranitos.add(new PilaGranito(granitos.get(i)));
			}
		}
		ManejadorArchivos.escribir("src/paquete/out.txt", pilasGranitos.size());
	}

}
