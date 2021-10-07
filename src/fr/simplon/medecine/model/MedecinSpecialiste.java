package fr.simplon.medecine.model;

public class MedecinSpecialiste extends Medecin {

	public int tarif;
	public String specialite;
	
	public MedecinSpecialiste(String _nom, String _prenom, String _numTel, Adresse _adresse) {
		super(_nom, _prenom, _numTel, _adresse);
	}

	
	public MedecinSpecialiste(String _nom, String _prenom, String _numTel, Adresse _adresse, String specialite, int tarif) {
		super(_nom, _prenom, _numTel, _adresse);
		this.tarif = tarif;
		this.specialite = specialite;
	}


	public int getTarif() {
		return tarif;
	}


	public void setTarif(int tarif) {
		this.tarif = tarif;
	}


	public String getSpecialite() {
		return specialite;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	@Override
	public void afficher() {
		System.out.println(this.getNom() + " " + this.getPrenom());
		System.out.println("Téléphone : " + this.getNumeroDeTelephone());
		System.out.println("Spécialité : " + this.getSpecialite());
		System.out.println("Tarif : " + this.tarif + "€");
		System.out.println("Adresse :");
		this.getAdresse().afficher();
		System.out.println("Créneaux :");
		for(int i = 0; i < super.getCreneaux().length; i++) {
			if(super.getCreneaux()[i].isSet())
				if(super.getCreneaux()[i] != null) super.getCreneaux()[i].afficher();
		}
	}
	
}
