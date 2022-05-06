package Questao3;

public class Funcionarios {
		public String nome;
		private String RG;
	
	public Funcionarios(String nome, String rG) {
		super();
		this.nome = nome;
		RG = rG;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}
	
	
	

}