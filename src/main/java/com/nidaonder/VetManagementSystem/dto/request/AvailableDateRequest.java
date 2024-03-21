package com.nidaonder.VetManagementSystem.dto.request;

import com.nidaonder.VetManagementSystem.entities.Doctor;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvailableDateRequest {

    @Temporal(TemporalType.DATE)
    @NotNull
    private LocalDate availableDate;

    @NotNull
    private Doctor doctor;
}