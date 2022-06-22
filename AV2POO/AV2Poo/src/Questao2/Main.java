package Questao2;

import javax.swing.JOptionPane;

import java.util.ArrayList;


public class Main {

public static void main(String[] args) {
		
		
		int idAluno = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Id do aluno: "));
		String nome = JOptionPane.showInputDialog("Nome aluno: ");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
		
		AlunoEnem AlunoEnem = new AlunoEnem(idAluno, nome, ano);
		
	
		ArrayList<ProvaEnem>provas = new ArrayList<> ();
		
		double total=0;
		for(int i=0; i<=5; i++) {
			int idProva = Integer.parseInt(JOptionPane.showInputDialog("O Id da Prova: "));
			String titulo = JOptionPane.showInputDialog("Entre com o titulo: ");
			int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
			
			ProvaEnem prova = new ProvaEnem (idProva, titulo, nota);
			provas.add(prova);
			total += prova.getNota();
		}
		
	
		JOptionPane.showMessageDialog(null, " O total de nota é: "+ total);
		
		
	}
}
