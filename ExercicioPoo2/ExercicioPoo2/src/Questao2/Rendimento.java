package Questao2;

public class Rendimento {
	
	private double investimentoInicial;
	private double taxa;
	private double meses;
	private double resultado;
	
	public Rendimento(double investimentoInicial,double taxa,double meses,double resultado) {
		super();
		this.investimentoInicial=investimentoInicial;
		this.taxa=taxa;
		this.meses=meses;
		this.resultado=resultado;
	}

	public float getInvestimentoInicial() {
		return investimentoInicial;
	}

	public void setInvestimentoInicial(double investimentoInicial) {
		this.investimentoInicial = investimentoInicial;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public float getMeses() {
		return meses;
	}

	public void setMeses(double meses) {
		this.meses = meses;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public Double rendimento(){
        for (int i=1; i<= numMeses; i++){
            resultado += resultado * (taxa/100);
        }
        return resultado;
	

}
