package Questao2;

public class ContaBancaria {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(1200.20);
		cc.sacar(300);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.depositar(500.50);
		cp.sacar(25);
		
		GeradorExtratos gerador = new GeradorExtratos();
		System.out.println("Conta corrente: ");
		gerador.geradorConta(cc);
		System.out.println("Conta poupança: ");
		gerador.geradorConta(cp);

	}

}
