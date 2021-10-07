package fr.simplon.medecine.model;

public class Adresse {

	private String mentionsComplementaires;
	private int numero;
	private String complementNumero;
	private String voie;
	private int codePostal;
	private String ville;
	
	public Adresse(String mentionsComplementaires, int numero, String complementNumero, String voie, int codePostal, String ville) {
		super();
		this.mentionsComplementaires = mentionsComplementaires;
		this.numero = numero;
		this.complementNumero = complementNumero;
		this.voie = voie;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public Adresse(int numero, String complementNumero, String voie, int codePostal, String ville) {
		super();
		this.mentionsComplementaires = null;
		this.numero = numero;
		this.complementNumero = complementNumero;
		this.voie = voie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String getMentionsComplementaires() {
		return mentionsComplementaires;
	}

	public void setMentionsComplementaires(String mentionsComplementaires) {
		this.mentionsComplementaires = mentionsComplementaires;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplementNumero() {
		return complementNumero;
	}

	public void setComplementNumero(String complementNumero) {
		this.complementNumero = complementNumero;
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	public String getVille() {
		return this.ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public void afficher() {
		if(this.getMentionsComplementaires() != null) {
			System.out.println(this.getMentionsComplementaires());
		}
		System.out.println(this.getNumero() + (this.getComplementNumero() == null ? "" : this.getComplementNumero()) + " " + this.getVoie() );
		System.out.println(this.getCodePostal() + " " + this.getVille().toUpperCase());
	}
	
	
	
}
