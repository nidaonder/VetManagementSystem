package com.nidaonder.VetManagementSystem.dto.request;

import com.nidaonder.VetManagementSystem.entities.Appointment;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReportRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String diagnosis;

    @NotNull
    private Double price;

    @NotNull
    private Appointment appointment;
}
