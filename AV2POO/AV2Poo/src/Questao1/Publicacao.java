package Questao1;

public class Publicacao {
	
	private String dataPublicacao;
	private String textoPublicacao;
	private String linkMidia;
	private double contadorPublicacao;
	
	public Publicacao(String dataPublicacao, String textoPublicacao,String linkMidia, double contadorPublicacao) {
		super();
		this.dataPublicacao = dataPublicacao;
		this.textoPublicacao = textoPublicacao;
		this.linkMidia = linkMidia;
		contadorPublicacao++;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public String getTextoPublicacao() {
		return textoPublicacao;
	}

	public void setTextoPublicacao(String textoPublicacao) {
		this.textoPublicacao = textoPublicacao;
	}

	public String getLinkMidia() {
		return linkMidia;
	}

	public void setLinkMidia(String linkMidia) {
		this.linkMidia = linkMidia;
	}

	public double getContadorPublicacao() {
		return contadorPublicacao;
	}
	
	public static double contadorPublicacao () {
		return contadorPublicacao++;
		
	}

}

	