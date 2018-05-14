package fr.epsi.jenkins.b3.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import fr.epsi.jenkins.b3.ClasseBOC;
import fr.epsi.jenkins.b3.EcoleEnum;
import fr.epsi.jenkins.b3.Etudiant;
import fr.epsi.jenkins.b3.NiveauEnum;
import fr.epsi.jenkins.b3.util.EtudiantFactory;
import junit.framework.TestCase;

public class ClasseBOCTest extends TestCase implements IClasseBOCTest {

	private ClasseBOC classeBOC;
	
	@BeforeEach
	public void initialisation() {
		
		final EtudiantFactory factory = new EtudiantFactory();
		final List<Etudiant> etudiants = factory.creerListEtudiant(17);
		
		classeBOC = new ClasseBOC();
		classeBOC.setNiveau(NiveauEnum.B3);
		classeBOC.setEcole(EcoleEnum.EPSI);
		classeBOC.setEtudiants(etudiants);

	}
	
	@Test
	@Override
	public void testClasseMoinsDe15Etudiants() {
		// TODO Auto-generated method stub

	}

	@Test
	@Override
	public void testExactement12Cours() {
		// TODO Auto-generated method stub

	}

	@Test
	@Override
	public void testCoursCoherents() {
		// TODO Auto-generated method stub

	}

}
