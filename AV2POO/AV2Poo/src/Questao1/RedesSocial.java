package Questao1;

import java.util.ArrayList;

public class RedesSocial {
	
	private String dataCriacao;
	private String nomeUsuario;
	private String dataNascimento;
	private String senha;
	
	public RedesSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento; 
		this.senha = senha;
	}
	

	
	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	ArrayList<Publicacao> publicacoes = new ArrayList<> (); 
	
	public void inserePublicacao(Publicacao publi) {
		
	}
	
	public void imprimePublicacoes() {
		
		System.out.println("Contador "+ Publicacao.getContadorPublicacao());
		for(int i = 0;i<5;i++){  
		System.out.println("texto: "+publicacoes.get(i).getTextoPublicacao() +"   "+ "Data: "+ publicacoes.get(i).getDataPublicacao() +"   "+ "Link: "+publicacoes.get(i).getLinkMidia());  
	}
	

}
}


	

