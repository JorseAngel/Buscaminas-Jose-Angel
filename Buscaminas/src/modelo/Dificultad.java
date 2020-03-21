package modelo;

public class Dificultad {
	private int tamano;
	private int numeroMinas;
	
	public Dificultad(int tamano, int numeroMinas) {
		super();
		this.tamano = tamano;
		this.numeroMinas = numeroMinas;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public int getNumeroMinas() {
		return numeroMinas;
	}

	public void setNumeroMinas(int numeroMinas) {
		this.numeroMinas = numeroMinas;
	}

}
