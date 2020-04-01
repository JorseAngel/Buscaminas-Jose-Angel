package model;

import java.util.Scanner;

public class mainDC {

	public static void main(String[] args) {
		int lado = 4, numeroMinas = 2;
		int posXMarcar = 0, posYMarcar = 0, posX = 0, posY = 0;
		boolean bandera = false;
		Tablero tablero = new Tablero(lado, numeroMinas);

		mostrarTablero(lado, tablero);

		Scanner introduce = new Scanner(System.in);

		do {
			System.out.println("CASILLA A DESVELAR: ");
			System.out.println("Introduce la coordenada X: ");
			posX = introduce.nextInt();
			System.out.println("Introduce la coordenada Y: ");
			posY = introduce.nextInt();
			
			tablero.desvelarCasilla(new Coordenada(posX, posY));
			mostrarTablero(lado, tablero);
			
			System.out.println();
			
			System.out.println("CASILLA A MARCAR: ");
			System.out.println("Introduce la coordenada X: ");
			posXMarcar = introduce.nextInt();
			System.out.println("Introduce la coordenada Y: ");
			posYMarcar = introduce.nextInt();
			
			tablero.marcarCasilla(new Coordenada(posXMarcar, posYMarcar));
			mostrarTablero(lado, tablero);

			for (int i = 0; i < lado; i++) {
				for (int j = 0; j < lado; j++) {
					if (tablero.getCasilla(new Coordenada(i, j)).isVelada()
							&& !tablero.getCasilla(new Coordenada(i, j)).isMina()) {
						bandera = true;
					}
				}
			}
		} while (bandera);

	}

	private static void mostrarTablero(int lado, Tablero tablero) {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				
				if (tablero.getCasilla(new Coordenada(i, j)).isMina()) {
					System.out.print("X ");
				}
				
				if (!tablero.getCasilla(new Coordenada(i, j)).isMina()) {
					if (tablero.getCasilla(new Coordenada(i, j)).isVelada()) {
						System.out.print("$ ");
					} else {
						System.out.print(tablero.getCasilla(new Coordenada(i, j)).getMinasAlrededor() + " ");
					}
				}
			}
			System.out.println();
		}
	}

}