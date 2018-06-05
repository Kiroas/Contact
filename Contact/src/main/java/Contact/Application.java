package Contact;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public CommandLineRunner demo(ContactRepository repository) {
		return (args) -> {
			
			//Création de quelques contacts
			repository.save(new Contact("John","Doe","John.Doe@gmail.com",25));
			repository.save(new Contact("Dylan","Rose Dite Rosette","Dylan.Rosediterosette@gmail.com",22));
			repository.save(new Contact("Jean","Nemarre","Jean.Nemarre@gmail.com",60));
			repository.save(new Contact("Gilles","Dela Tourrete","Gilles.AH@gmail.com",30));
			repository.save(new Contact("Paul","Marcq","PaulMarcq.unbut@gmail.com",25));
			repository.save(new Contact("Hal","Zheimer","Jenesaisplus@gmail.com",95));
			repository.save(new Contact("Sarah","Croche","Sarah.Pelle@gmail.com",45));
			
			log.info("Tous les contacts :");
			log.info("-------------------------------");
			for(Contact c : repository.findAll()) {
				log.info(c.toString());
			}
			
			log.info("");
			
			log.info("John Doe :");
			log.info("-------------------------------");
			log.info(repository.findByNom("Doe").toString());
			log.info("-------------------------------");
			log.info(repository.findOne((long) 1).toString());
			
			
			
		};
	}
	
}
