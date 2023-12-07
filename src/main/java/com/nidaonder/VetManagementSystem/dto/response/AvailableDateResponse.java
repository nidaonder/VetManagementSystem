package com.nidaonder.VetManagementSystem.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvailableDateResponse {
    private long id;
    private LocalDate appointmentDate;
    private long doctorId;
}
