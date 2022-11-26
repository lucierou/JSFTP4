package entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "User")
public class User {
	private String nom;
	private String age;
	private String sexe;
	private String poids;
	private String taille;
	private String imc;
	private Integer conseil;

	public User() {
	}
	
	public User(String nom, String age, String sexe, String poids, String taille) {
		super();
		this.nom = nom;
		this.age = age;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getPoids() {
		return poids;
	}

	public void setPoids(String poids) {
		this.poids = poids;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}
	

	public String getImc() {
		return imc;
	}

	public void setImc(String imc) {
		this.imc = imc;
	}
	
	public Integer getConseil() {
		return conseil;
	}

	public void setConseil(Integer conseil) {
		this.conseil = conseil;
	}

	@Override
	public String toString() {
		return "User [nom=" + nom + ", age=" + age + ", sexe=" + sexe + ", poids=" + poids + ", taille=" + taille + "]";
	}
	
	public void calculerIMC() {
		double x = Double.parseDouble(poids);
		double y = Double.parseDouble(taille)/100;
		double d = x/(y*y);

		String imc =  Double.toString(d);
		this.setImc(imc);
		
		if (d > 25)
			this.conseil = 1;
		else if (d < 18.5)
			this.conseil = 1;
		else
			this.conseil = 0;
	}
	
	
	
}
