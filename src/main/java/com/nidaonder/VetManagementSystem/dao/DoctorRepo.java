package com.nidaonder.VetManagementSystem.dao;

import com.nidaonder.VetManagementSystem.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long> {
    Optional<Doctor> findByMail(String mail);
}
