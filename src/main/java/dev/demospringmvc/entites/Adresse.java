package dev.demospringmvc.entites;

public class Adresse {
	private String rue;
	private String ville;
	
	public Adresse(String rue, String ville) {
		super();
		this.rue = rue;
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}
