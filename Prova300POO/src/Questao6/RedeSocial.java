	package Questao6;

public class RedeSocial {
	
	public String nome, email, telefone, instagram ;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	
	public RedeSocial(String nome,String email, String telefone,String instagram) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.instagram = instagram;
	}
	public void mostraDados() {
		System.out.println(" Nome:" + nome + "\n E-mail:" + email + "\n Telefone:" + telefone + "\n Instagram:" + instagram);
	}
	
}
	