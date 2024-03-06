package com.nidaonder.VetManagementSystem.mapper;

import com.nidaonder.VetManagementSystem.dto.request.ReportRequest;
import com.nidaonder.VetManagementSystem.dto.response.ReportResponse;
import com.nidaonder.VetManagementSystem.entities.Report;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface ReportMapper {
    Report asEntity(ReportRequest request);
    ReportResponse asOutput(Report report);
    List<ReportResponse> asOutput(List<Report> reports);
    void update(@MappingTarget Report entity, ReportRequest request);
}