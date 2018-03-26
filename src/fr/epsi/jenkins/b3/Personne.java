package fr.epsi.jenkins.b3;

public class Personne {
	
	private String nom;
	private String prenom;
	private String dateNaissance;

	public Personne() {
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
	
	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getAge() {
		return 0;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + 
				", prenom=" + prenom + 
				", dateNaissance=" + dateNaissance + "]";
	}
	
	
}
