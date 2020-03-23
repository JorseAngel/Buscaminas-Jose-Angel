package Control;

import model.Coordenada;
import model.Tablero;

public class DesmarcadorController {
	Tablero tablero;

	public DesmarcadorController(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	public Tablero getTablero() {
		return tablero;
	}

	public boolean desmarcarController(Coordenada coordenada) {
		return tablero.desmarcarCasilla(coordenada);
	}

	
}
