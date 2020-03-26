package Control;

import model.Coordenada;
import model.Tablero;

public class _07_DesmarcadorController {
	Tablero tablero;

	public _07_DesmarcadorController(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public boolean desmarcarController(int posX, int posY) {
		return tablero.desmarcarCasilla(new Coordenada(posX, posY));
	}

	
}
