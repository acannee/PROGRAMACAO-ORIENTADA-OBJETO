package Questao3;

public class Administrativos extends Funcionarios {
	
	private float salarioFixo;
	private float horaExtra;
	
	public Administrativos(String nome, String rG, float salarioFixo, float horaExtra) {
		super(nome, rG);
		this.salarioFixo = salarioFixo;
		this.horaExtra = horaExtra;
	}

	public float getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(float salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public float getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(float horaExtra) {
		this.horaExtra = horaExtra;
	}
	
	private double salariocomHE() {
		return (this.getSalarioFixo()/100)+this.getHoraExtra();
	}
}