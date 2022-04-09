package Questao1;

import java.util.Scanner;

public class Estoque {
	//os atributos nome (string), qtdAtual (int) e qtdMinima (int) do tipo private.
	
	Scanner ler = new Scanner (System.in);
	
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public Estoque (String nome, int qtdAtual, int qtdMinima) { // um construtor é quando possui o public
	this.nome=nome;
	this.qtdAtual=qtdAtual;
	this.qtdMinima=qtdMinima;
}
	
	// Os métodos set deverão ser Private. Os métodos get deverão ser Public.

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	
	public void darBaixa(int qtde) {
		while ((qtdAtual - qtde) < 0);
		qtde=ler.nextInt();
		System.out.println("Por favor digite outro número, a quantidade do estoque não pode ficar negativa");
		System.out.println();
	}
	
	
	public String mostrarEstoque() {
		return "Produto: " + String.format("%s \n",nome) + "Quantidade minima: "+ String.format("%d \n", qtdMinima) + "Quantidade atual: " + qtdAtual;

	}
	
	public boolean precisaRepor() {
		if (qtdAtual <= qtdMinima) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
