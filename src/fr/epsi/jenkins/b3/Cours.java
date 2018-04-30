package fr.epsi.jenkins.b3;

public class Cours {

	private SemestreEnum semestre;
	private Personne professeur;
	private NiveauEnum niveau;
	private int volumeHoraire;
	
	public SemestreEnum getSemestre() {
		return semestre;
	}
	public void setSemestre(SemestreEnum semestre) {
		this.semestre = semestre;
	}
	public Personne getProfesseur() {
		return professeur;
	}
	public void setProfesseur(Personne professeur) {
		this.professeur = professeur;
	}
	public NiveauEnum getNiveau() {
		return niveau;
	}
	public void setNiveau(NiveauEnum niveau) {
		this.niveau = niveau;
	}
	public int getVolumeHoraire() {
		return volumeHoraire;
	}
	public void setVolumeHoraire(int volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}
}
