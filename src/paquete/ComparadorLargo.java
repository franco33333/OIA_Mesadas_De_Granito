package paquete;

import java.util.Comparator;

public class ComparadorLargo implements Comparator<Granito>{

	@Override
	public int compare(Granito o1, Granito o2) {
		return o1.getLargo()-o2.getLargo();
	}

}
