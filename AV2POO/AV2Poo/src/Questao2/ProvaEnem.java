package Questao2;

public class ProvaEnem {
	
	private int idProva;
	private String titulo;
	private int nota;
	
	public ProvaEnem(int idProva, String titulo, int nota) {
		super();
		this.idProva = idProva;
		this.titulo = titulo;
		this.nota = nota;
	}

	public int getIdProva() {
		return idProva;
	}

	public void setIdProva(int idProva) {
		this.idProva = idProva;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	}



