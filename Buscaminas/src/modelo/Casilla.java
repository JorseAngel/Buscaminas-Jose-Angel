package modelo;

public class Casilla {
	private Coordenada coordenada;
	private boolean velada;
	private boolean marcada;
	private Valor valor;
	
	public Casilla(boolean velada, Valor valor) {
		super();
		this.velada = velada;
		this.valor = valor;
	}
	
	public Coordenada getCoordenada() {
		return this.coordenada;
	}

	public int getPuntoX() {
		return this.coordenada.getPuntoX();
	}

	public int getPuntoY() {
		return this.coordenada.getPuntoY();
	}

	public boolean isVelada() {
		return this.velada;
	}

	public void setVelada(boolean velada) {
		this.velada = velada;
	}
	
	public boolean isMarcada() {
		return marcada;
	}

	public void setMarcada(boolean marcada) {
		this.marcada = marcada;
	}

	public int getValor() {
		return this.valor.getValor();
	}

	public void setValor(int valor) {
		this.valor.setValor(valor);
	}
	
}
