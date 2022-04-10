package Carnaval;

public class IngressoNormal extends Ingresso {
	
	IngressoNormal(double valor){
		super(valor);
	}
	public void imprimeIngresso() {
	
	System.out.println("Ingresso Normal Valor:" + getValor());
	}
}
