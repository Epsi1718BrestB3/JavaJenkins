package fr.epsi.jenkins.b3;

/**
 * @author user
 *
 */
public class Etudiant extends Personne{
	
	private int numeroEtudiant;
	private ClasseBOC classeBOC;
	
	public Etudiant() {
	}
	
	public Etudiant(String nom, String prenom, String dateNaissance, int numeroEtudiant,ClasseBOC classeBOC) {
		super();
		setNom(nom);
		setPrenom(prenom);
		setDateNaissance(dateNaissance);
		numeroEtudiant = this.numeroEtudiant;
		classeBOC = this.classeBOC;
	}

	public int getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public void setNumeroEtudiant(int numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	public ClasseBOC getClasseBOC() {
		return classeBOC;
	}

	public void setClasseBOC(ClasseBOC classeBOC) {
		this.classeBOC = classeBOC;
	}

	@Override
	public String toString() {
		return "Etudiant [numeroEtudiant=" + numeroEtudiant + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getAge()=" + getAge() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	public boolean aValideBacPlus2(){
		NiveauEnum niveauEnum = classeBOC.getNiveau();
		return niveauEnum == NiveauEnum.B3 || niveauEnum == NiveauEnum.I4 || niveauEnum == NiveauEnum.I5;  
	}
	
}
