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
	
	
	public Contact() {
		
	}
	
	protected Contact(String prenom, String nom, String mail, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.mail = mail;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Contact[id=%d, prenom='%s', nom='%s', mail='%s', age=%i", id, prenom, nom, mail, age);
	}

}
