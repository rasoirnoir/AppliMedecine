package fr.simplon.medecine.model;

public abstract class Personne {

	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private Adresse adresse;
	
	public Personne(String _nom, String _prenom, String _numTel, Adresse _adresse) {
		this.nom = _nom;
		this.prenom = _prenom;
		this.numeroDeTelephone = _numTel;
		this.adresse = _adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}
	
	public Adresse getAdresse() {
		return this.adresse;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", numeroDeTelephone=" + numeroDeTelephone + "]";
	}
	
	
}
