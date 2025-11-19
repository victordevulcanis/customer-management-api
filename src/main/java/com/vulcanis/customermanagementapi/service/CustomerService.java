package com.vulcanis.customermanagementapi.service;

import com.vulcanis.customermanagementapi.model.Customer;
import com.vulcanis.customermanagementapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    public Optional<Customer> updateCustomer(Long id, Customer customer) {
        Optional<Customer> optionalCustomer = getCustomerById(id);
        if (optionalCustomer.isPresent()) {
            Customer updatedCustomer = optionalCustomer.get();
            String updateFullName = customer.getFullName();
            LocalDate updateBirthDate = customer.getBirthDate();
            String updateEmail = customer.getEmail();
            updatedCustomer.setBirthDate(updateBirthDate);
            updatedCustomer.setFullName(updateFullName);
            updatedCustomer.setEmail(updateEmail);
            customerRepository.save(updatedCustomer);
            return Optional.of(updatedCustomer);
        }
        return Optional.empty();
    }

}
