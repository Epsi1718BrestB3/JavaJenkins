package fr.epsi.jenkins.b3.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import fr.epsi.jenkins.b3.ClasseBOC;
import fr.epsi.jenkins.b3.Etudiant;
import fr.epsi.jenkins.b3.NiveauEnum;
import junit.framework.TestCase;

class EtudiantTest extends TestCase {

	@Test
	void testAValiderBac2() {
		ClasseBOC classeBOC = new ClasseBOC();
		Etudiant etudiant = new Etudiant();
		classeBOC.setNiveau(NiveauEnum.B3);
		etudiant.setClasseBOC(classeBOC);
		
		List<Etudiant> etudiants = new ArrayList<>();
		etudiants.add(etudiant);
		classeBOC.setEtudiants(etudiants);

		assertEquals(true, etudiant.aValideBacPlus2());
	}

}
