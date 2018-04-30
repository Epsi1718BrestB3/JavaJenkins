package fr.epsi.jenkins.b3.test;

public interface ICoursTest {

	/**
	 * Test si le cours est un cours du premier
	 * semestre
	 */
	public void testCoursSemestre1();
	
	/**
	 * Test si le cours a un volume horaire multiple de 10
	 */
	public void testVolumeHoraireMultiple10();
	
	
}
