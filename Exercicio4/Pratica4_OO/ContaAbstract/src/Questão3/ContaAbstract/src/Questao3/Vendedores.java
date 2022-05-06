package Questao3;

public class Vendedores extends Funcionarios {

	private float salarioBase;
	private float comissao;
	private int numVendas;
	
	public Vendedores(String nome, String rG, float salarioBase, float comissao, int numVendas) {
		super(nome, rG);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.numVendas = numVendas;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	public int getNumVendas() {
		return numVendas;
	}

	public void setNumVendas(int numVendas) {
		this.numVendas = numVendas;
	}
	
	public double salariocomComissao() {
		return this.getSalarioBase()+(this.numVendas*0.05);
	}

}