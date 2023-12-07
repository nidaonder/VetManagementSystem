package com.nidaonder.VetManagementSystem.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "vaccine")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vaccine_id", columnDefinition = "serial")
    private long id;

    @NotBlank
    private String name;

    @NotBlank
    private String code;

    @Temporal(TemporalType.DATE)
    private LocalDate protectionStartDate;

    @Temporal(TemporalType.DATE)
    private LocalDate protectionFinishDate;

    @ManyToOne
    @JoinColumn(name = "animal_id", referencedColumnName = "animal_id")
    private Animal animal;
}
