package Questao2;

public class Caminhao  extends VeiculoDePasseio{
	private int capacidadeCarga;
	private int numEixo;
	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public int getNumEixo() {
		return numEixo;
	}
	public void setNumEixo(int numEixo) {
		this.numEixo = numEixo;
	}
	
	public Caminhao(int capacidadeCarga, int numEixo) {
		super();
		this.capacidadeCarga = capacidadeCarga;
		this.numEixo = numEixo;
	}

}
