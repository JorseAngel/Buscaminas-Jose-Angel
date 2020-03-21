package modelo;

public enum Valor {
	mina(-1), sinMina(0);
	
	private int valor;

	private Valor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
