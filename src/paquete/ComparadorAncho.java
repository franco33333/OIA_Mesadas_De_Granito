package paquete;

import java.util.Comparator;

public class ComparadorAncho implements Comparator<Granito>{

	@Override
	public int compare(Granito o1, Granito o2) {
		return o1.getAncho() - o2.getAncho();
	}
}
