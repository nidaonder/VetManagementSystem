package com.nidaonder.VetManagementSystem.dto.request;

import com.nidaonder.VetManagementSystem.entities.Animal;
import com.nidaonder.VetManagementSystem.entities.Doctor;
import com.nidaonder.VetManagementSystem.entities.Report;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentRequest {

    @NotNull
    private LocalDateTime appointmentDate;

    @NotNull
    private Animal animal;

    @NotNull
    private Doctor doctor;
}
