package Questao2;

public class Van extends VeiculoDePasseio {
	private int numDePassageiros;
	private int numDeEixos;
	public int getNumDePassageiros() {
		return numDePassageiros;
	}
	public void setNumDePassageiros(int numDePassageiros) {
		this.numDePassageiros = numDePassageiros;
	}
	public int getNumDeEixos() {
		return numDeEixos;
	}
	public void setNumDeEixos(int numDeEixos) {
		this.numDeEixos = numDeEixos;
	}
	
	Public Van(int numDePassageiros, int numDeEixos) {
		super();
		this.numDePassageiros=numDePassageiros;
		this.numDeEixos=numDeEixos;
	}
}
