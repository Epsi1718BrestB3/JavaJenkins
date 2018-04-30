package fr.epsi.jenkins.b3.test;

public interface IClasseBOCTest {

	/**
	 * Verifie que la classe donnée contient un maximum
	 * de 15 étudiants
	 */
	public void testClasseMoinsDe15Etudiants();
	
	/**
	 * Vérifie que le nombre de cours est exactement
	 * de 12 pour une classe donnée
	 */
	public void testExactement12Cours();
	
	/**
	 * Vérifie que le niveau de chaque cours correspond
	 * bien à celui de la classe.
	 */
	public void testCoursCoherents();
	
}
