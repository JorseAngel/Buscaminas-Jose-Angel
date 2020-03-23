package model;

import utiles.Utiles;

public class Tablero {

	private Casilla[][] casillas;

	public Tablero(int lado, int numeroBombas) {
		super();
		crearTablero(lado);
		colocarMinas(lado, numeroBombas);
		establecerMinasAlrededor();
	}

	private void establecerMinasAlrededor() {
		// TODO

	}

	private void colocarMinas(int lado, int numeroBombas) {
		int tamano = 2;
		int posicionesAleatorias[][] = new int[numeroBombas][tamano];
		rellenarPosicionesAleatorias(lado, posicionesAleatorias);

		for (int i = 0; i < posicionesAleatorias.length; i++) {
			for (int j = 0; j < posicionesAleatorias[i].length - 1; j++) {
				Coordenada miCoordenada = new Coordenada(posicionesAleatorias[i][j], posicionesAleatorias[i][j + 1]);

				if (getCasilla(miCoordenada).isMina()) {
					do {
						otraPosicionAleatoria(lado, posicionesAleatorias, i);
						miCoordenada = new Coordenada(posicionesAleatorias[i][j], posicionesAleatorias[i][j + 1]);
					} while (getCasilla(miCoordenada).isMina());
				}
				getCasilla(miCoordenada).setMina(true);
			}
		}

	}

	private void otraPosicionAleatoria(int lado, int[][] posicionesAleatorias, int posicion) {
		int longitud = 2;
		for (int i = 0; i < longitud; i++) {
			posicionesAleatorias[posicion][i] = Utiles.dameNumero(lado);
		}
	}

	private void rellenarPosicionesAleatorias(int lado, int[][] posicionesAleatorias) {
		int aletorio = 0;

		for (int i = 0; i < posicionesAleatorias.length; i++) {
			for (int j = 0; j < posicionesAleatorias[i].length; j++) {
				posicionesAleatorias[i][j] = Utiles.dameNumero(lado);
			}
		}
	}

	private void crearTablero(int lado) {
		this.casillas = new Casilla[lado][lado];

		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas.length; j++) {
				this.casillas[i][j] = new Casilla();
			}
		}
	}

	public Casilla[][] getCasillas() {
		return casillas;
	}

	// TODO antes era private
	public Casilla getCasilla(Coordenada posicion) {
		return casillas[posicion.getPosX()][posicion.getPosY()];
	}

	private void setMina(Coordenada posicion, boolean bandera) {
		getCasilla(posicion).setMina(bandera);
	}

	private boolean isMina(Coordenada posicion) {
		return getCasilla(posicion).isMina();
	}

}
