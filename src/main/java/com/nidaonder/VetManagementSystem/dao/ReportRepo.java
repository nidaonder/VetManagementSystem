package com.nidaonder.VetManagementSystem.dao;

import com.nidaonder.VetManagementSystem.entities.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepo extends JpaRepository<Report, Long> {
}
