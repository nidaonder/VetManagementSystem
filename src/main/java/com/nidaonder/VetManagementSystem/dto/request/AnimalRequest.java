package com.nidaonder.VetManagementSystem.dto.request;

import com.nidaonder.VetManagementSystem.entities.Animal;
import com.nidaonder.VetManagementSystem.entities.Customer;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String species;

    @NotBlank
    private String  breed;

    @Enumerated(EnumType.STRING)
    private Animal.Gender gender;
    public enum Gender {
        MALE,
        FEMALE
    }

    @NotBlank
    private String colour;

    @Temporal(TemporalType.DATE)
    @Past
    private LocalDate dateOfBirth;

    @NotNull
    private Customer customer;
}
