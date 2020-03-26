package Control;

import model.Casilla;
import model.Coordenada;
import model.Tablero;

public class _04_MarcadorController {
	Tablero tablero;

	public _04_MarcadorController(Tablero tablero) {
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
