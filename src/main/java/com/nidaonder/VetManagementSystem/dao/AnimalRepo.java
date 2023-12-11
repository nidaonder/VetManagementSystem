package com.nidaonder.VetManagementSystem.dao;

import com.nidaonder.VetManagementSystem.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnimalRepo extends JpaRepository<Animal, Long> {
    Optional<Animal> findByCustomerIdAndName(long customerId, String name);
}
