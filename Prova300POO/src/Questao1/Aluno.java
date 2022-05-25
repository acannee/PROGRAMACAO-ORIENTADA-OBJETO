package Questao1;

public class Aluno extends Pessoa {

	protected int matricula;

	public Aluno(int matricula, String nome, float altura, float peso) {
		super(nome, altura, peso);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}