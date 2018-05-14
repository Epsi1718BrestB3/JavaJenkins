package fr.epsi.jenkins.b3.util;

import java.util.List;

import fr.epsi.jenkins.b3.Cours;
import fr.epsi.jenkins.b3.Etudiant;

public interface IClasseBOCFactory {
	
	public Etudiant creerUnEtudiant();
	
	public List<Etudiant> creerListeEtudiant(int nombreEtudiants);
	
	public Cours[] creerTableauCours(int nombreCours);
	
}
