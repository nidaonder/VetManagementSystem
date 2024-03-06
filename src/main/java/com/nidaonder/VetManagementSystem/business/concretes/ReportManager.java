package com.nidaonder.VetManagementSystem.business.concretes;

import com.nidaonder.VetManagementSystem.business.abstracts.IReportService;
import com.nidaonder.VetManagementSystem.core.exception.DataExistsException;
import com.nidaonder.VetManagementSystem.core.exception.NotFoundException;
import com.nidaonder.VetManagementSystem.core.utilities.Msg;
import com.nidaonder.VetManagementSystem.dao.ReportRepo;
import com.nidaonder.VetManagementSystem.dto.request.ReportRequest;
import com.nidaonder.VetManagementSystem.dto.response.ReportResponse;
import com.nidaonder.VetManagementSystem.entities.Report;
import com.nidaonder.VetManagementSystem.mapper.ReportMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReportManager implements IReportService {

    private final ReportRepo reportRepo;
    private final ReportMapper reportMapper;

    @Override
    public List<ReportResponse> findAll() {
        reportRepo.findAll();
        return reportMapper.asOutput(reportRepo.findAll());
    }

    @Override
    public ReportResponse getById(Long id) {
        return reportMapper.asOutput(reportRepo.findById(id).orElseThrow(() -> new NotFoundException(Msg.NOT_FOUND)));
    }

    @Override
    public ReportResponse create(ReportRequest request) {
        Optional<Report> isReportExist = reportRepo.findByAppointmentId(request.getAppointment().getId());
        if (isReportExist.isEmpty()){
            Report reportSaved = reportRepo.save(reportMapper.asEntity(request));
            return reportMapper.asOutput(reportSaved);
        }
        throw new DataExistsException(Msg.DATA_EXISTS);
    }

    @Override
    public ReportResponse update(Long id, ReportRequest request) {
        Optional<Report> reportFromDb = reportRepo.findById(id);
        if (reportFromDb.isEmpty()) {
            throw new NotFoundException(Msg.NOT_FOUND);
        }
        Long newAppointmentId = request.getAppointment().getId();
        Optional<Report> newReport = reportRepo.findByAppointmentId(newAppointmentId);
        if (newReport.isPresent() && newReport.get().getId() != id) {
            throw new DataExistsException(Msg.DATA_EXISTS);
        }
        Report report = reportFromDb.get();
        reportMapper.update(report, request);
        return reportMapper.asOutput(reportRepo.save(report));
    }

    @Override
    public void deleteById(Long id) {
        Optional<Report> reportFromDb = reportRepo.findById(id);
        if (reportFromDb.isPresent()) {
            reportRepo.delete(reportFromDb.get());
        } else {
            throw new NotFoundException(Msg.NOT_FOUND);
        }
    }
}
