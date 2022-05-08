package paquete;

public class Granito{
	private int largo;
	private int ancho;
	
	public Granito(int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public int getLargo() {
		return largo;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public int compareAnchoLargoTo(Granito granito) {
		return ancho - granito.getLargo();
	}
	
	public int compareLargoAnchoTo(Granito granito) {
		return largo - granito.getAncho();
	}
}
