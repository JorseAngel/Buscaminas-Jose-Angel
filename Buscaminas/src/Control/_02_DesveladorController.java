package Control;

import model.Coordenada;
import model.Tablero;

public class _02_DesveladorController {
	Tablero tablero;

	public _02_DesveladorController(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	public Tablero getTablero() {
		return tablero;
	}
	
	public boolean desvelarController(int posX, int posY) {
		return tablero.desvelarCasilla(new Coordenada(posX, posY));
	}
}
