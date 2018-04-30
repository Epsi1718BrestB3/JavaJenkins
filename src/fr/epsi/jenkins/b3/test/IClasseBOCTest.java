package fr.epsi.jenkins.b3.test;

public interface IClasseBOCTest {

	/**
	 * Verifie que la classe donn�e contient un maximum
	 * de 15 �tudiants
	 */
	public void testClasseMoinsDe15Etudiants();
	
	/**
	 * V�rifie que le nombre de cours est exactement
	 * de 12 pour une classe donn�e
	 */
	public void testExactement12Cours();
	
	/**
	 * V�rifie que le niveau de chaque cours correspond
	 * bien � celui de la classe.
	 */
	public void testCoursCoherents();
	
}
