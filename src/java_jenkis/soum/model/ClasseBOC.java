package java_jenkis.soum.model;

import java.awt.List;

public class ClasseBOC {
	private NiveauEnum niveau;
	private EcoleEnum ecole;
	private java.util.List<Etudiant> etudiants;
	
	public ClasseBOC(NiveauEnum niveau,EcoleEnum ecole){
		niveau = this.niveau;
		ecole = this.ecole;
	}

	public java.util.List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(java.util.List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public NiveauEnum getNiveau() {
		return niveau;
	}

	public void setNiveau(NiveauEnum niveau) {
		this.niveau = niveau;
	}

	public EcoleEnum getEcole() {
		return ecole;
	}

	public void setEcole(EcoleEnum ecole) {
		this.ecole = ecole;
	}
	
	
}
