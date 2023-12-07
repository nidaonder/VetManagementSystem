package com.nidaonder.VetManagementSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "available_date")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvailableDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "available_date_id", columnDefinition = "serial")
    private long id;

    @Temporal(TemporalType.DATE)
    private LocalDate appointmentDate;

    @ManyToOne
    @JoinColumn(name = "doctor_id", referencedColumnName = "doctor_id")
    private Doctor doctor;
}
