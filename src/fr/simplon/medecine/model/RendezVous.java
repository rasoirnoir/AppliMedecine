package fr.simplon.medecine.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RendezVous {

	private Creneau creneau;
	private Patient patient;
	private LocalDate date;
	
	public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
		super();
		this.creneau = creneau;
		this.patient = patient;
		this.date = date;
	}
	
	public void afficher() {
		System.out.print("Rendez-vous du " + this.date.format(DateTimeFormatter.ofPattern("dd MMMM YYYY")) + " ");
		this.creneau.afficher();
		System.out.println("Avec le Docteur " + this.creneau.getMedecin().getNom());
		System.out.print("Pour ");
		this.patient.afficher();
	}
	
}
