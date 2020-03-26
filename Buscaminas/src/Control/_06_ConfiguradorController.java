package Control;

import model.Densidad;
import model.Dificultad;
import model.Tablero;
import utiles.Utiles;

public class _06_ConfiguradorController {
	public Tablero configurarCondiciones(Densidad densidad, Dificultad dificultad) {
		return new Tablero(dificultad.getLado(), Utiles.calculaMinas(dificultad.getLado(), densidad.getPorcentaje()));
	}
}
