package com.nidaonder.VetManagementSystem.dto.request;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvailableDateRequest {

    @Temporal(TemporalType.DATE)
    private LocalDate appointmentDate;

    private long doctorId;
}
