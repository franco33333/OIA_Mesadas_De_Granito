package paquete;

import java.util.ArrayList;
import java.util.List;

public class PilaGranito {
	private List<Granito> granitos;
	
	public PilaGranito(Granito granito) {
		granitos = new ArrayList<Granito>();
		granitos.add(granito);
	}
	
	public boolean agregar(Granito granito) {
		ComparadorAncho comparadorAncho = new ComparadorAncho();
		ComparadorLargo comparadorLargo = new ComparadorLargo();

		if(granitos.isEmpty()) {
			granitos.add(granito);
			return true;
		}
		int i=granitos.size()-1;
		while(i>=0) {
			if(comparadorAncho.compare( granitos.get(i), granito) > 0) {
				if(comparadorLargo.compare(granitos.get(i), granito) > 0) {
					if(i<granitos.size()-1) {
						if(comparadorAncho.compare( granitos.get(i+1), granito) < 0) {
							if(comparadorLargo.compare(granitos.get(i+1), granito) < 0) {
								granitos.add(i, granito);
								return true;
							}
						}
					}
					granitos.add(i, granito);
					return true;
				}else {
					if(granitos.get(i).compareAnchoLargoTo(granito) > 0) {
						if(granitos.get(i).compareLargoAnchoTo(granito) > 0) {
							if(i<granitos.size()-1) {
								if(granitos.get(i+1).compareAnchoLargoTo(granito) > 0) {
									if(granitos.get(i+1).compareLargoAnchoTo(granito) > 0) {
										granitos.add(i, granito);
										return true;
									}
								}
							}
							granitos.add(i, granito);
							return true;
						}
					}
				}
			}else {
				if(granitos.get(i).compareAnchoLargoTo(granito) > 0) {
					if(granitos.get(i).compareLargoAnchoTo(granito) > 0) {
						if(i<granitos.size()-1) {
							if(granitos.get(i+1).compareAnchoLargoTo(granito) > 0) {
								if(granitos.get(i+1).compareLargoAnchoTo(granito) > 0) {
									granitos.add(i, granito);
									return true;
								}
							}
						}
						granitos.add(i, granito);
						return true;
					}
				}
			}
			i--;
		}
		return false;
	}
}
