package com.example.project.toystore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.toystore.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	
}
