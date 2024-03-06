package com.nidaonder.VetManagementSystem.dto.request;

import com.nidaonder.VetManagementSystem.entities.Animal;
import com.nidaonder.VetManagementSystem.entities.Report;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaccineRequest {

    @NotBlank
    private String name;

    @Pattern(regexp = "[A-Z]{3}-\\d{2}")
    @NotNull
    private String code;

    @Temporal(TemporalType.DATE)
    @NotNull
    @PastOrPresent
    private LocalDate protectionStartDate;

    @Temporal(TemporalType.DATE)
    @NotNull
    private LocalDate protectionFinishDate;

    @NotNull
    private Animal animal;

    @NotNull
    private Report report;
}
