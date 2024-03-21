package com.nidaonder.VetManagementSystem.dto.response;

import com.nidaonder.VetManagementSystem.entities.Animal;
import com.nidaonder.VetManagementSystem.entities.Doctor;
import com.nidaonder.VetManagementSystem.entities.Report;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentResponse {
    private long id;
    private LocalDateTime appointmentDate;
    private Animal animal;
    private Doctor doctor;
}