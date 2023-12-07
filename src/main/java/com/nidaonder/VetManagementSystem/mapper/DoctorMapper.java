package com.nidaonder.VetManagementSystem.mapper;

import com.nidaonder.VetManagementSystem.dto.request.DoctorRequest;
import com.nidaonder.VetManagementSystem.dto.response.DoctorResponse;
import com.nidaonder.VetManagementSystem.entities.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface DoctorMapper {
    Doctor asEntity(DoctorRequest doctorRequest);
    DoctorResponse asOutput(Doctor doctor);
    List<DoctorResponse> asOutput(List<Doctor> doctor);
    void update (@MappingTarget Doctor entity, DoctorRequest request);
}
