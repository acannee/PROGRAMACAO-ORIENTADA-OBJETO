package Questao34;


public class ValoresDosAtributos {


	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[10];

		Pessoa p1 = new Pessoa("Anne", 1.64f, 66.2f);
		Pessoa p2= new Pessoa("Josephino", 1.70f, 72.6f);
		Pessoa p3= new Pessoa("Pandora", 1.55f, 50.7f);
		Pessoa p4= new Pessoa("Frajola", 1.80f, 85.7f);
		Pessoa p5= new Pessoa("Cleuza", 1.75f, 90.1f);
		Pessoa p6= new Pessoa("Marcelo", 1.60f, 56.2f);
		Pessoa p7= new Pessoa("Thai", 1.62f, 71.5f);
		Pessoa p8= new Pessoa("Luiza", 1.50f, 57.8f);
		Pessoa p9= new Pessoa("Demetria", 1.79f, 84.0f);
		Pessoa p10= new Pessoa("Jerfesson", 1.85f, 95.1f);
		
		for(int i=0; i<10; i++) {
			System.out.println(pessoas[i].mostrarInformacao());
		}

	}
}
