package Questao2;

public class VeiculoUtilitario extends VeiculoDePasseio {
	private String tipoTracao;
	private String tipo;
	private int numDePortas;
	private String listaOpcionais;
	public String getTipoTracao() {
		return tipoTracao;
	}
	public void setTipoTracao(String tipoTracao) {
		this.tipoTracao = tipoTracao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumDePortas() {
		return numDePortas;
	}
	public void setNumDePortas(int numDePortas) {
		this.numDePortas = numDePortas;
	}
	public String getListaOpcionais() {
		return listaOpcionais;
	}
	public void setListaOpcionais(String listaOpcionais) {
		this.listaOpcionais = listaOpcionais;
	}
	
	public VeiculoUtilitario(String tipoTracao, String tipo, int numDePortas, String listaOpcionais) {
		super();
		this.tipoTracao = tipoTracao;
		this.tipo = tipo;
		this.numDePortas = numDePortas;
		this.listaOpcionais = listaOpcionais;
	}
}
