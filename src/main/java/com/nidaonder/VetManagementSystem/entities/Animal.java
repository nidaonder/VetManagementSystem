package com.nidaonder.VetManagementSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "animals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id", columnDefinition = "serial")
    private long id;

    @NotBlank
    private String name;

    @NotBlank
    private String species;

    @NotBlank
    private String breed;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    public enum Gender {
        MALE,
        FEMALE
    }

    @NotBlank
    private String colour;

    @Temporal(TemporalType.DATE)
    @Past
    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "animal")
    @JsonIgnore
    private List<Vaccine> vaccine;

    @OneToMany(mappedBy = "animal")
    @JsonIgnore
    private List<Appointment> appointment;
}
