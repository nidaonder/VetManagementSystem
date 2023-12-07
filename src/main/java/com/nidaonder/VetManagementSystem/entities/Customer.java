package com.nidaonder.VetManagementSystem.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", columnDefinition = "serial")
    private long id;

    @NotBlank
    private String name;

    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}", message = "Invalid phone number format. Please use XXX-XXX-XXXX format.")
    private String phone;

    @Email
    private String mail;

    private String address;

    private String city;
}
