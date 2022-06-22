package Questao1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		RedeSocial ler = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);
	
		String dataCriacao = JOptionPane.showInputDialog("\n Data Criacao: ");
		String nomeUsuario= JOptionPane.showInputDialog("\n Qual o nome do usuario:");
		String dataNascimento = JOptionPane.showInputDialog("\n Insira a data de nascimento:");
		String senha = JOptionPane.showInputDialog("\n Senha: ");
		
		Publicacao publicacao = new Publicacao(dataPublicacao, textoPublicacao, linkMidia, contadorPublicacao);
		ler.inserePublicacao(publicacao);
		
		String dataPublicacao= JOptionPane.showInputDialog("\n Data Publicao: ");
		String textoPublicacao = JOptionPane.showInputDialog("\n Segue o texto publicado: ");
		String linkMidia = JOptionPane.showInputDialog("\n Segue o Link da Midia: ");
		String contadorPublicacao = JOptionPane.showInputDialog("\n Contador da Publicação: ");
		
		
		Publicacao publicacaooutras = new Publicacao(dataPublicacao, textoPublicacao, linkMidia, contadorPublicacao);
		ler.inserePublicacao(publicacaooutras);
		
		ler.imprimePublicacoes();

	}

}
