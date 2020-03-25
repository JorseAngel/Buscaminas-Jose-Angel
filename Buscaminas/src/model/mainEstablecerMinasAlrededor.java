package model;

public class mainEstablecerMinasAlrededor {
	public static void main(String[] args) {
		
		int lado = 3, numeroMinas = 1;
		
		Tablero tablero = new Tablero(lado, numeroMinas);
		
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if (!tablero.getCasilla(new Coordenada(i, j)).isMina()) {
					System.out.println("[" + i + "," + j + "] No soy mina y tengo "
							+ tablero.getCasilla(new Coordenada(i, j)).getMinasAlrededor() + " minas alrededor");
				} else {
					System.out.println("[" + i + "," + j + "] Soy mina");
				}
			}
		}
	}
}
