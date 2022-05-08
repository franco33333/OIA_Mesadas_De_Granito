package paquete;

import java.util.Comparator;

public class ComparadorOrdenadorAncho implements Comparator<Granito>{

	@Override
	public int compare(Granito o1, Granito o2) {
		if(o1.getAncho() == o2.getAncho()) {
			return o1.getLargo() - o2.getLargo();
		}
		return o2.getAncho() - o1.getAncho();
	}

}
