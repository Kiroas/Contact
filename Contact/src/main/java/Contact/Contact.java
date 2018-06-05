package Contact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String prenom;
	private String nom;
	private String mail;
	private int age;
	
	
	protected Contact() {
		
	}
	
	public Contact(String prenom, String nom, String mail, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.mail = mail;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Contact[id=%d, prenom='%s', nom='%s', mail='%s', age=%d", id, prenom, nom, mail, age);
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getMail() {
		return this.mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
