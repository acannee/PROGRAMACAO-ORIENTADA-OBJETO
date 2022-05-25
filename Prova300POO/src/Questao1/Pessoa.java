package Questao1;

public class Pessoa {
	
	public String nome;
	protected  float altura, peso;

	public Pessoa() {
	super();
	}

	public Pessoa(String nome, float altura, float peso) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	protected void Andar() {
		System.out.println("Você é uma pessoa " + nome + " capaz de andar");
	}
	protected void Correr() {
		System.out.println("Você é uma pessoa capaz de correr");
	}
}