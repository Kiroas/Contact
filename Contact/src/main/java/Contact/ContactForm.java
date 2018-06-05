package Contact;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ContactForm {
	
	@NotNull
    @Size(min=2, max=30)
    private String prenom;
	
	@NotNull
    @Size(min=2, max=50)
    private String nom;
	
	@NotNull
    @Size(min=2, max=100)
    private String mail;

    @NotNull
    @Min(18)
    private Integer age;

    public String getPrenom() {
        return this.prenom;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Prenom: " + this.prenom + ", Nom : "+ this.nom +", Mail"+ this.mail +", Age: " + this.age + ")";
    }

}
