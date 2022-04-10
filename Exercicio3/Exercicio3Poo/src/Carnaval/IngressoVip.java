package Carnaval;

public class IngressoVip extends Ingresso {
	 
	public IngressoVip(double valor) {
		super(valor);
	}
	IngressoVIP(double valor, double valorAdicional){
	private double valorAdicional;
		this.valorAdicional=valorAdicional;
	}
	public void imprimeIngresso() {
		System.out.println("Ingresso VIP: " + getValor()+getValorAdicional());
	}
}
