package Questao36;

public class Funcionario {
	
	public String nome;
	public String departamento;
	public double salario;
	public String dataDeEntrada1;
	public String RG;
	public boolean situacaoFuncionario;
	
	public Funcionario(String nome, String departamento, double salario, String dataDeEntrada, 
			String rG, boolean situacaoFuncionario, String dataDeEntrada1) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataDeEntrada1 = dataDeEntrada1;
		RG = rG;
		this.situacaoFuncionario = situacaoFuncionario;

}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataDeEntrada1() {
		return dataDeEntrada1;
	}
	public void setDataDeEntrada1(String dataDeEntrada1) {
		this.dataDeEntrada1 = dataDeEntrada1;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		this.RG = rG;
	}
	public boolean isSituacaoFuncionario() {
		return situacaoFuncionario;
	}

	public void setSituacaoFuncionario(boolean situacaoFuncionario) {
		this.situacaoFuncionario = situacaoFuncionario;
	}
	
}