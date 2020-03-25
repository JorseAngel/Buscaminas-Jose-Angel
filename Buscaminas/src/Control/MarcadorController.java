package Control;

import model.Casilla;
import model.Coordenada;
import model.Tablero;

public class MarcadorController {
	Tablero tablero;

	public MarcadorController(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	public Tablero getTablero() {
		return tablero;
	}
	
	public boolean marcarController(int posX, int posY) {
		return tablero.marcarCasilla(new Coordenada(posX, posY));
	}

}
