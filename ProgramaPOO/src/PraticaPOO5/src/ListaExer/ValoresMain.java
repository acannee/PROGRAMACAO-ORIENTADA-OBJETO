package ListaExer;

import java.util.Scanner;

public class ValoresMain {

	  public static void main(String[] args) {
		  
		  Pessoa p1= new Pessoa("Pandora", 1.55f, 53.2f, 18);
			Pessoa p2= new Pessoa("Josephino", 1.78f, 85.6f, 24);
			Pessoa p3= new Pessoa("Anne", 1.64f, 66.5f, 21);
			
			Pessoa[] pessoas = new Pessoa[10];
			for(int i=0; i<10; i++) {
			pessoas[i]=new Pessoa("Frajola", 1.70f, 69.5f, 27);
			}
			Funcionario[] funcionarios = new Funcionario[100];
			
			Funcionario f1 = new Funcionario("Jonas", "suporte", 2000, "07/12/2020", "273932", true);
			Funcionario f2 = new Funcionario("Belle","suporte", 2000, "18/08/2020", "273932", true);
			if(f1==f2) {
				System.out.println("Iguais");
			}
			else
				System.out.println("Diferentes");
		
			p1.aniversario();
			p1.aniversario();
			p1.aniversario();
			p1.Imprimir();
		
		}
		

	}