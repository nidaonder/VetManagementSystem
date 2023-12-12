package com.nidaonder.VetManagementSystem.mapper;

import com.nidaonder.VetManagementSystem.dto.request.VaccineRequest;
import com.nidaonder.VetManagementSystem.dto.response.VaccineResponse;
import com.nidaonder.VetManagementSystem.entities.Vaccine;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface VaccineMapper {

    Vaccine asEntity(VaccineRequest vaccineRequest);
    VaccineResponse asOutput(Vaccine vaccine);
    List<VaccineResponse> asOutput(List<Vaccine> vaccine);
    void update(@MappingTarget Vaccine entity, VaccineRequest request);

}
