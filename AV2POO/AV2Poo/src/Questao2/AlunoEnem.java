package Questao2;

public class AlunoEnem {
	
	private int idAluno;
	private String nome;
	private int ano;
	
	public AlunoEnem(int idAluno, String nome, int ano) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.ano = ano;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
