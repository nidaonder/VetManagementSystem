package com.nidaonder.VetManagementSystem.mapper;

import com.nidaonder.VetManagementSystem.dto.request.AvailableDateRequest;
import com.nidaonder.VetManagementSystem.dto.response.AvailableDateResponse;
import com.nidaonder.VetManagementSystem.entities.AvailableDate;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface AvailableDateMapper {
    AvailableDate asEntity(AvailableDateRequest availableDateRequest);
    AvailableDateResponse asOutput(AvailableDate availableDate);
    List<AvailableDateResponse> asOutput(List<AvailableDate> availableDate);
    void update(@MappingTarget AvailableDate entity, AvailableDateRequest request);
}
