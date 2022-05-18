package Questao37;

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
	public boolean SituacaoFuncionario() {
		return situacaoFuncionario;
	}

	public void setSituacaoFuncionario(boolean situacaoFuncionario) {
		this.situacaoFuncionario = situacaoFuncionario;
	}
	//M�todo  �bonificar�,  que  aumenta  o  sal�rio  do  funcion�rio  de  acordo  com  o 
	//par�metro passado como argumento. 
	public void bonificar(double bonificar) {
		salario+=bonificar;
	}
	//M�todo  �demitir�,  que  n�o  recebe  par�metro  algum,  apenas  modifica  o  valor 
	//booleano indicando que o funcion�rio n�o trabalha mais na empresa. 
	public void demitir() {
		situacaoFuncionario=false;
	}
	//M�todo  �mostrarDados�,  que  simplesmente  imprime  todos  os  atributos  de  um funcion�rio. 
	public String mostrarDados() {
		return ("Nome: "+nome+"\nRG: "+RG+"\nDepartamento: "+departamento+"\nData de entrada: "
	+ dataDeEntrada1 +"\nSal�rio: "+ salario +"\nAtualmente na empresa? "+ situacaoFuncionario);
	}
	
}