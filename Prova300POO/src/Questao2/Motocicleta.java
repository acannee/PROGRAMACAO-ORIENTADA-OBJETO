package Questao2;

public class Motocicleta extends VeiculoDePasseio{
	private int potencia;
	private String tipo;
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Motocicleta() {
		super();
	this.potencia = potencia;
	this.tipo = tipo;
	}
}
