package fr.epsi.jenkins.b3.util;

import java.util.List;

import fr.epsi.jenkins.b3.Etudiant;

public interface IEtudiantFactory {
	
	public Etudiant creerUnEtudiant();
	
	public List<Etudiant> creerListEtudiant(int nombreEtudiants);
	
}
