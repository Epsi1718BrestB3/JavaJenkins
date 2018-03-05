package java_jenkis.soum.model;

public class Personne {
	private String nom,prenom;
	private int age;
	
	public Personne(String nom,String prenom,int age){
		nom = this.nom;
		prenom = this.prenom;
		age = this.age;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
