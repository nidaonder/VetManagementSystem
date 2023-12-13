package com.nidaonder.VetManagementSystem.business.abstracts;

import com.nidaonder.VetManagementSystem.dto.request.AvailableDateRequest;
import com.nidaonder.VetManagementSystem.dto.response.AvailableDateResponse;

import java.time.LocalDate;
import java.util.List;

public interface IAvailableDateService {
    public List<AvailableDateResponse> findAll();
    public AvailableDateResponse getById(long id);
    public AvailableDateResponse create(AvailableDateRequest request);
    public AvailableDateResponse update(long id, AvailableDateRequest request);
    public void deleteById(long id);
    boolean existByDoctorIdAndAvailableDate(long doctorId, LocalDate availableDate);
    public List<AvailableDateResponse> getDoctorAvailableDateInRange(long doctorId, LocalDate startDate, LocalDate endDate);
}
