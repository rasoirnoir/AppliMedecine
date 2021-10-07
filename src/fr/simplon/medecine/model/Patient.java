package fr.simplon.medecine.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient extends Personne {

	public static enum Sexe {
		F, M
	}
	private Sexe sexe;
	private long numSecu;
	private LocalDate dateNaissance;
	private String commentaires;
	
	public Patient(String _nom, String _prenom, String _numTel, Sexe _sexe, long _numSecu, LocalDate _dateNaissance, String _commentaires, Adresse adresse) {
		super(_nom, _prenom, _numTel, adresse);
		this.sexe = _sexe;
		this.numSecu = _numSecu;
		this.dateNaissance = _dateNaissance;
		this.commentaires = _commentaires;
	}
	
	
	public String getCommentaires() {
		return this.commentaires;
	}
	
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	
	
	public Sexe getSexe() {
		return sexe;
	}



	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}



	public long getNumSecu() {
		return numSecu;
	}



	public void setNumSecu(long numSecu) {
		this.numSecu = numSecu;
	}



	public LocalDate getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public void afficher() {
		System.out.println(this.getNom() + " " + this.getPrenom());
		System.out.println("Téléphone : " + this.getNumeroDeTelephone());
		System.out.println("Sexe : " + (this.getSexe() == Sexe.F ? "Féminin" : "Masculin"));
		System.out.println("Numéro de sécurité sociale : " + this.getNumSecu());
		System.out.println("Date de naissance : " + this.getDateNaissance().format(DateTimeFormatter.ofPattern("dd MMMM YYYY")));
		System.out.println("Commentaires : " + (this.getCommentaires() == null ? "[aucun commentaire]" : this.getCommentaires()));
		System.out.println("Adresse :");
		this.getAdresse().afficher();
	}
	
	
}
