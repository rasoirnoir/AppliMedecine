package fr.simplon.medecine.model;

public class MedecinGeneraliste extends Medecin {

	private static int tarif = 25;
	
	public MedecinGeneraliste(String nom, String prenom, String numTelephone, Adresse adresse) {
		super(nom, prenom, numTelephone, adresse);
	}
	
	@Override
	public void afficher() {
		System.out.println(this.getNom() + " " + this.getPrenom());
		System.out.println("Téléphone : " + this.getNumeroDeTelephone());
		System.out.println("Tarif : " + tarif + "€");
		System.out.println("Adresse :");
		this.getAdresse().afficher();
		System.out.println("Créneaux :");
		for(int i = 0; i < super.getCreneaux().length; i++) {
			if(super.getCreneaux()[i].isSet())
				if(super.getCreneaux()[i] != null) super.getCreneaux()[i].afficher();
		}
	}

	public static int getTarif() {
		return tarif;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

	
	
}
