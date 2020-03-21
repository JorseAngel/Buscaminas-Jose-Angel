package modelo;

public class Coordenada {
	private Punto puntoX, puntoY;

	public Coordenada(Punto puntoX, Punto puntoY) {
		super();
		this.puntoX = puntoX;
		this.puntoY = puntoY;
	}

	public int getPuntoX() {
		return puntoX.getPunto();
	}
	
	public int getPuntoY() {
		return puntoY.getPunto();
	}

}
