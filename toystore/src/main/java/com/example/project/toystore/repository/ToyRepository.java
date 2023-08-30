package com.example.project.toystore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.toystore.model.Toy;
@Repository
public interface ToyRepository extends JpaRepository<Toy,Integer>{

}
