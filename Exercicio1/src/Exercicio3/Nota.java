package Exercicio3;

import java.util.Scanner;


public class Nota {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Digite sua matricula: ");
		int matricula = sc.nextInt();
		System.out.println("Digite seu curso: ");
		String curso = sc.next();
		System.out.println("Digite seu periodo: ");
		int periodo = sc.nextInt();
		
		Aluno aluno = new Aluno(nome,matricula,curso,periodo);
		
		System.out.println("Digite a nota da AV1: ");
		aluno.setNotaAV1(sc.nextDouble());
		System.out.println("Digite a nota da AV2: ");
		aluno.setNotaAV2(sc.nextDouble());
		
		String resultado = aluno.avaliarAluno(aluno.getNotaAV1(),aluno.getNotaAV2());
		System.out.println("Você foi "+resultado);
		
		if (resultado.equals("Recuperacao")) {
			System.out.println("Digite a nota da AE: ");
			aluno.setNotaAE(sc.nextDouble());
			resultado = aluno.avaliarRecuperacao(aluno.getNotaAV1(), aluno.getNotaAV2(), aluno.getNotaAE());
			System.out.println("Você foi "+resultado);
		}
		
		sc.close();
	}

}