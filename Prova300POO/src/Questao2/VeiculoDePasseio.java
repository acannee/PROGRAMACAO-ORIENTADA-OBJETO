package Questao2;

public class VeiculoDePasseio {
	
	private String placa; 
	private String cor;
	private String modelo;
	private String fabricante;
	private String anoDeFabricacao;
	private String valorDaDiaria;
	private String numDePortas;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getAnoDeFabricacao() {
		return anoDeFabricacao;
	}
	public void setAnoDeFabricacao(String anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	public String getValorDaDiaria() {
		return valorDaDiaria;
	}
	public void setValorDaDiaria(String valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}
	public String getNumDePortas() {
		return numDePortas;
	}
	public void setNumDePortas(String numDePortas) {
		this.numDePortas = numDePortas;
	}
	public VeiculoDePasseio() {
		super();
		this.placa = placa; 
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.anoDeFabricacao = anoDeFabricacao;
		this.valorDaDiaria = valorDaDiaria;
		this.numDePortas = numDePortas;
	}
			
	public void mostrarDados() {
	System.out.println(" Placa: " + placa + "\n cor: " + cor + "\n modelo" + modelo + "\n ano de fabricação" + anoDeFabricacao);
}
}
