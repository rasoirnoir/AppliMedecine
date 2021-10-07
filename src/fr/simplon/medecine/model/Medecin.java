package fr.simplon.medecine.model;

import java.time.LocalTime;

public class Medecin extends Personne {

	private Creneau[] creneaux;
	
	public Medecin(String _nom, String _prenom, String _numTel, Adresse _adresse) {
		super(_nom, _prenom, _numTel, _adresse);
		creneaux = new Creneau[15];
		for(int i = 0; i < creneaux.length ; i++) {
			creneaux[i] = new Creneau();
		}
	}
	
	public Creneau[] getCreneaux() {
		return creneaux;
	}

	public void setCreneaux(Creneau[] creneaux) {
		this.creneaux = creneaux;
	}

	public void afficher() {
		System.out.println(this.getNom() + " " + this.getPrenom());
		System.out.println("Téléphone : " + this.getNumeroDeTelephone());
		System.out.println("Adresse :");
		this.getAdresse().afficher();
		System.out.println("Créneaux :");
		for(int i = 0; i < creneaux.length; i++) {
			if(creneaux[i] != null) creneaux[i].afficher();
		}
	}
	
	
	public void ajouterCreneau(LocalTime heure, int duree) {
		int index = firstFreeIndex();
		creneaux[index].setHeureDebut(heure);
		creneaux[index].setDuree(duree);
	}

	/**
	 * renvoie l'index du premier créneau non initialisé dans le tableau de créneaux
	 * @return -1 si tous les créneaux ont deja été initialiés, l'index du premier créneau vide sinon
	 */
	private int firstFreeIndex() {
		for(int i = 0; i < creneaux.length; i++) {
			if(!creneaux[i].isSet()) return i;
		}
		return -1;
	}
	
}
