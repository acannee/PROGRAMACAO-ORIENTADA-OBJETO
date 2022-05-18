package ListaExer;

public class ValoresMain {

	  public static void main(String[] args) {
	        String nome;
	        float altura, peso;
	        Pessoa[] pessoas = new Pessoa[2];
	        Scanner ler = new Scanner(System.in);
	        for (int i = 0; i<pessoas.length;i++){
	            System.out.println("Escreva o nome: ");
	            nome = ler.next();
	            System.out.println("Escreva a altura: ");
	            altura = ler.nextFloat();
	            System.out.println("Escreva o peso: ");
	            peso = ler.nextFloat();
	            pessoas[i]= new Pessoa(nome,altura,peso);
	        }
	        for (int i = 0; i<pessoas.length;i++) System.out.println(pessoas[i].imprimir());
	    }
	}
