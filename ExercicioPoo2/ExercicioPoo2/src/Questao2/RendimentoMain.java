package Questao2;

import java.util.Scanner;

public class RendimentoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	Scanner ler=new Scanner(System.in);
	
	double porcentRendimento = 0.0;
    double investimento = 0.0;
    int qtdMes = 0;
	
	System.out.println("Informe o investimento inicial: ");
	double investInicial=ler.nextDouble();
	
	System.out.println("Qual a taxa do investimento: ");
	double taxa=ler.nextDouble();
	
	System.out.println("São quantos meses do investimento: ");
	double meses=ler.nextDouble();
}

	Rendimento investimentoInicial = new Rendimento (porcentRendimento, investimento, qtdMes);


}
