package fr.epsi.jenkins.b3.util;

import java.util.ArrayList;
import java.util.List;

import fr.epsi.jenkins.b3.Cours;
import fr.epsi.jenkins.b3.Etudiant;

public class ClasseBOCFactory implements IClasseBOCFactory {

	@Override
	public Etudiant creerUnEtudiant() {
		Etudiant etudiant = creerEtudiant(0, "Nom", "prenom", "01/01/2000");
		return etudiant;
	}

	@Override
	public List<Etudiant> creerListeEtudiant(int nombreEtudiants) {
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		for (int i = 0; i < nombreEtudiants; i++) {
			etudiants.add(creerEtudiant(i, "nom", "prenom", "01/01/2000"));
		}
		return etudiants;
	}

	@Override
	public Cours[] creerTableauCours(int nombreCours) {
		Cours[] cours = new Cours[nombreCours];
		for (int i = 0; i < nombreCours; i++) {
			cours[i] = new Cours();
		}
		return cours;
	}
	
	private Etudiant creerEtudiant(
			int numero, String nom, String prenom, String dateNaissance) {
		Etudiant etudiant = new Etudiant();
		etudiant.setNom(nom + numero);
		etudiant.setPrenom(prenom + numero);
		etudiant.setDateNaissance(dateNaissance);
		etudiant.setNumeroEtudiant(numero);
		return etudiant;
	}
}
