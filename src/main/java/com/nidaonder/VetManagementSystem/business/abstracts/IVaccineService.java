package com.nidaonder.VetManagementSystem.business.abstracts;

import com.nidaonder.VetManagementSystem.dto.request.VaccineRequest;
import com.nidaonder.VetManagementSystem.dto.response.VaccineResponse;

import java.time.LocalDate;
import java.util.List;

public interface IVaccineService {
    public List<VaccineResponse> findAll();
    public VaccineResponse getById(long id);
    public List<VaccineResponse> getByAnimal(long id);
    public List<VaccineResponse> getVaccinesInDateRange(LocalDate startDate, LocalDate endDate);
    public VaccineResponse create(VaccineRequest request);
    public VaccineResponse update(long id, VaccineRequest request);
    public void deleteById(long id);
}
