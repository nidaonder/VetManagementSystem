package com.nidaonder.VetManagementSystem.dto.response;

import com.nidaonder.VetManagementSystem.entities.Animal;
import com.nidaonder.VetManagementSystem.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimalResponse {
    private long id;
    private String name;
    private String species;
    private String breed;
    private Animal.Gender gender;
    private String colour;
    private LocalDate dateOfBirth;
    private Customer customer;
}
