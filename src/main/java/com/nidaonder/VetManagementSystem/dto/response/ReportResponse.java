package com.nidaonder.VetManagementSystem.dto.response;

import com.nidaonder.VetManagementSystem.entities.Appointment;
import com.nidaonder.VetManagementSystem.entities.Vaccine;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReportResponse {
    private Long id;
    private String title;
    private String diagnosis;
    private Double price;
    private Appointment appointment;
    private List<Vaccine> vaccine;
}
