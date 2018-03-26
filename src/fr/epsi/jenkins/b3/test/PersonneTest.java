package fr.epsi.jenkins.b3.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.epsi.jenkins.b3.Personne;
import junit.framework.TestCase;

class PersonneTest extends TestCase {

	private Personne personne1;
	private Personne personne2;
	
	@BeforeEach
	protected void init() throws Exception {
		personne1 = new Personne();
		personne1.setDateNaissance("01/01/1996");
		personne2 = new Personne();
		personne2.setDateNaissance("01/11/1996");
	}
	
	@Test
	void testGetAge1() {
		int age = personne1.getAge();
		assertEquals(22, age);
	}
	
	void testGetAge2() {
		int age = personne2.getAge();
		assertEquals(21, age);
	}

}
