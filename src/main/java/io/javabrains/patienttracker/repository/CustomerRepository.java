package io.javabrains.patienttracker.repository;

import io.javabrains.patienttracker.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {




}
