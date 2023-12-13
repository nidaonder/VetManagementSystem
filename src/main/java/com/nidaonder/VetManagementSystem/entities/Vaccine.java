package com.nidaonder.VetManagementSystem.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
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

    @Pattern(regexp = "[A-Z]{3}-\\d{2}")
    @NotNull
    private String code;

    @Temporal(TemporalType.DATE)
    @PastOrPresent
    @NotNull
    private LocalDate protectionStartDate;

    @Temporal(TemporalType.DATE)
    @NotNull
    private LocalDate protectionFinishDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "animal_id", referencedColumnName = "animal_id")
    private Animal animal;
}
