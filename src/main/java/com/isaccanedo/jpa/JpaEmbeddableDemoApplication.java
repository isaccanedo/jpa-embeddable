package com.isaccanedo.jpa;

import com.isaccanedo.jpa.model.Address;
import com.isaccanedo.jpa.model.Name;
import com.isaccanedo.jpa.model.User;
import com.isaccanedo.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaEmbeddableDemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaEmbeddableDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAllInBatch();

		Name name = new Name("Rajeev", "Kumar", "Singh");
		Address address = new Address("747", "Golf View Road", "Bangalore", "Karnataka", "India", "560008");
		User user = new User(name, "rajeev@callicoder.com", address);

		userRepository.save(user);
	}
}
