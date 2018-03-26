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
		if (formatDateValide(dateNaissance)) 
			this.dateNaissance = dateNaissance;
	}

	/**
	 * Renvoie l'age de la personne calculé à partir de
	 * sa dateNaissance au format ("dd/MM/YYYY")
	 * @return
	 */
	public int getAge() {
		//TODO
		return 0;
	}

	/**
	 * Renvoie true si le format de dateNaissance correspond bien
	 * à "dd/MM/YYYY"
	 * et false sinon
	 * @param dateNaissance
	 * @return
	 */
	private boolean formatDateValide(String dateNaissance) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + 
				", prenom=" + prenom + 
				", dateNaissance=" + dateNaissance + "]";
	}
	
	
}
