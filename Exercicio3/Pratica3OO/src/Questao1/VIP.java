package Questao1;

public class VIP extends Ingresso {

	private float adicionalVIP;
	
	public VIP(double valor, double adicionalVIP) {
		super(valor);
		this.adicionalVIP = adicionalVIP;
	}
	
	
	public double getAdicionalVIP() {
		return adicionalVIP;
	}


	public void setAdicionalVIP(double adicionalVIP) {
		this.adicionalVIP = adicionalVIP;
	}


	public void valordoIngresso() {
		System.out.println("O valor do Ingresso VIP é: "+(this.getValor()+this.getAdicionalVIP()));
	}
	
}