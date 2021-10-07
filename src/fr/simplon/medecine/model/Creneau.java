package fr.simplon.medecine.model;

import java.time.LocalTime;

public class Creneau {

	private LocalTime heureDebut;
	private int duree;
	private Medecin medecin;
	
	public Creneau(LocalTime heure, int duree, Medecin medecin) {
		this.heureDebut = heure;
		this.duree = duree;
		this.medecin = medecin;
		this.medecin.ajouterCreneau(heure, duree);
	}
	
	public Creneau() {
		
	}

	public LocalTime getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(LocalTime heureDebut) {
		this.heureDebut = heureDebut;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	public void afficher() {
		System.out.println(this.getHeureDebut() + " - " + this.getHeureDebut().plusMinutes(duree) + " (" + this.getDuree() + " minutes)");
	}
	
	/**
	 * Determine si le créneau est vide ou a été initialisé
	 * @return true si le créneau a été init, false sinon
	 */
	public boolean isSet() {
		if(this.heureDebut != null && this.duree != 0) {
			return true;
		}
		return false;
	}
}
