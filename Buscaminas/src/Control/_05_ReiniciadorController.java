package Control;

import model.Casilla;
import model.Densidad;
import model.Dificultad;
import model.Tablero;
import utiles.Utiles;

public class _05_ReiniciadorController {
	
	private Tablero tablero;
	
	public _05_ReiniciadorController(Tablero tablero) {
		this.tablero = reiniciarJuego(tablero);
	}
	
	public Tablero reiniciarJuego(Tablero tablero) {
		return new Tablero(getCasillas().length, tablero.getNumeroMinas());
	}

	public Casilla[][] getCasillas() {
		return tablero.getCasillas();
	}
	
	
}
