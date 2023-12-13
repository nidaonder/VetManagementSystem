package com.nidaonder.VetManagementSystem.dao;

import com.nidaonder.VetManagementSystem.entities.AvailableDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AvailableDateRepo extends JpaRepository<AvailableDate, Long> {
    Optional<AvailableDate> findByDoctorIdAndAvailableDate(long doctorId, LocalDate availableDate);
    boolean existsByDoctorIdAndAvailableDate(long doctorId, LocalDate availableDate);
    List<AvailableDate> findByDoctorIdAndAvailableDateBetween(long doctorId, LocalDate startDate, LocalDate endDate);
}

