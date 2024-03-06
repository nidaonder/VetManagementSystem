package com.nidaonder.VetManagementSystem.api;

import com.nidaonder.VetManagementSystem.business.abstracts.IReportService;
import com.nidaonder.VetManagementSystem.dto.request.ReportRequest;
import com.nidaonder.VetManagementSystem.dto.response.ReportResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reports")
public class ReportController {

    private final IReportService reportService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ReportResponse> findAll(){
        return reportService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ReportResponse getById(@PathVariable Long id) {
        return reportService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ReportResponse save(@RequestBody ReportRequest request) {
        return reportService.create(request);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ReportResponse update(@PathVariable Long id, @RequestBody ReportRequest request) {
        return reportService.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        reportService.deleteById(id);
    }
}