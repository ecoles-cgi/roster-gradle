package org.cloudfoundry;

import org.cloudfoundry.model.Person;
import org.cloudfoundry.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class SampleData implements CommandLineRunner {

	@Autowired
	private PersonRepository repository;
	
	@Override
	public void run(String... strings) throws Exception {
		repository.save(new Person("Eddie", "Coles", "frodo@example.com", "123456789", "2cdeed02-8bc0-4a0a-a3ac-3aae164813a3")); 
	}
	
}
