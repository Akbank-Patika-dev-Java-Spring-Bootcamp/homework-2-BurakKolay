package com.burakkolay.akbankhw2.dao;

import com.burakkolay.akbankhw2.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findCustomerByUsername(String username);
}
