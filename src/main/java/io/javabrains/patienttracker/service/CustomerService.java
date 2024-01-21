package io.javabrains.patienttracker.service;

import io.javabrains.patienttracker.entity.Customer;

import java.util.List;

public interface CustomerService   {

    List<Customer> getAllCustomers();

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    Customer getCustomerById(Long id);

    void deleteCustomerById(Long id);
}
