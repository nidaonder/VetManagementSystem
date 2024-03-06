package com.nidaonder.VetManagementSystem.business.abstracts;

import com.nidaonder.VetManagementSystem.dto.request.ReportRequest;
import com.nidaonder.VetManagementSystem.dto.response.ReportResponse;

import java.util.List;

public interface IReportService {
    List<ReportResponse> findAll();
    ReportResponse getById(Long id);
    ReportResponse create(ReportRequest request);
    ReportResponse update(Long id, ReportRequest request);
    void deleteById(Long id);
}
