package fr.epsi.jenkins.b3.test;

import java.util.List;

import org.junit.Test;

import fr.epsi.jenkins.b3.ClasseBOC;
import fr.epsi.jenkins.b3.Cours;
import fr.epsi.jenkins.b3.EcoleEnum;
import fr.epsi.jenkins.b3.Etudiant;
import fr.epsi.jenkins.b3.NiveauEnum;
import fr.epsi.jenkins.b3.util.ClasseBOCFactory;
import junit.framework.TestCase;

public class ClasseBOCTest extends TestCase implements IClasseBOCTest {

	private ClasseBOC classeBOC;
	
	
	public ClasseBOCTest() {
		
		final ClasseBOCFactory factory = new ClasseBOCFactory();
		final List<Etudiant> etudiants = factory.creerListeEtudiant(15);
		final Cours[] cours = factory.creerTableauCours(12);
		
		classeBOC = new ClasseBOC();
		classeBOC.setNiveau(NiveauEnum.B3);
		classeBOC.setEcole(EcoleEnum.EPSI);
		classeBOC.setEtudiants(etudiants);
		classeBOC.setCours(cours);

	}
	
	@Test
	@Override
	public void testClasseMoinsDe15Etudiants() {
		assertTrue(classeBOC.getEtudiants().size() <= 15);
	}

	@Test
	@Override
	public void testExactement12Cours() {
		assertTrue(classeBOC.getCours().length == 12);
	}

	@Test
	@Override
	public void testCoursCoherents() {
		// TODO Auto-generated method stub

	}

}
