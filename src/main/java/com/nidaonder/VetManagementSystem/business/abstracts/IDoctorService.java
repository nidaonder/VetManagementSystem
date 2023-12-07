package com.nidaonder.VetManagementSystem.business.abstracts;

import com.nidaonder.VetManagementSystem.dto.request.DoctorRequest;
import com.nidaonder.VetManagementSystem.dto.response.DoctorResponse;

import java.util.List;

public interface IDoctorService {
    public List<DoctorResponse> findAll();
    public DoctorResponse getById(long id);
    public DoctorResponse create(DoctorRequest request);
    public DoctorResponse update(long id, DoctorRequest request);
    public void deleteById(long id);
}
