package io.javabrains.patienttracker;

import io.javabrains.patienttracker.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerTrackerApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(CustomerTrackerApplication.class, args);
	}
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {
//		Customer customer1 = new Customer("ALexis",
//				"Tanaka", "alexisfanaka@gmail.com",
//				"the Wi-Fi is not working");
//		customerRepository.save(customer1);
//
//		Customer customer2 = new Customer("Brian",
//				"Anders","briananders@gmail.com",
//				"I want my Wi-Fi reinstalled");
//		customerRepository.save(customer2);
//
//		Customer customer3 = new Customer("Diana",
//				"Rayven","dianarayvan@gmail.com",
//				"my Wi-Fi is really slow today");
//		customerRepository.save(customer3);

	}
}
