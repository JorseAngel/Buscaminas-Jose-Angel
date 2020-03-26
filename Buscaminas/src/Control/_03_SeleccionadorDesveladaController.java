package Control;

import model.Coordenada;
import model.Tablero;

public class _03_SeleccionadorDesveladaController {
	Tablero tablero;

	public _03_SeleccionadorDesveladaController(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	public Tablero getTablero() {
		return tablero;
	}
	
	public boolean seleccionarDesveladaController(int posX, int posY) {
		return tablero.seleccionarCasillaDesvelada(new Coordenada(posX, posY));
	}
}
