package modelo;

public class Tablero {
	private Dificultad dificultad;
	private Casilla[][] casillas;
	
	public Tablero(Dificultad dificultad, Casilla[][] casillas) {
		super();
		this.dificultad = dificultad;
		this.casillas = new Casilla[dificultad.getTamano()][dificultad.getTamano()];
		this.casillas = casillas;
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}

	public Casilla[][] getCasillas() {
		return casillas;
	}

	
}
