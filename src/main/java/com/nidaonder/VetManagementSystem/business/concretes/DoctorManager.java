package com.nidaonder.VetManagementSystem.business.concretes;

import com.nidaonder.VetManagementSystem.business.abstracts.IDoctorService;
import com.nidaonder.VetManagementSystem.core.exception.DataExistsException;
import com.nidaonder.VetManagementSystem.core.exception.NotFoundException;
import com.nidaonder.VetManagementSystem.core.utilities.Msg;
import com.nidaonder.VetManagementSystem.dao.DoctorRepo;
import com.nidaonder.VetManagementSystem.dto.request.DoctorRequest;
import com.nidaonder.VetManagementSystem.dto.response.DoctorResponse;
import com.nidaonder.VetManagementSystem.entities.Doctor;
import com.nidaonder.VetManagementSystem.mapper.DoctorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor // Parametreli ya da parametresiz constructorları getirir. DI için gerekli olabilir.
public class DoctorManager implements IDoctorService {

    private final DoctorRepo doctorRepo;
    private final DoctorMapper doctorMapper;

    @Override
    public List<DoctorResponse> findAll() {
        return doctorMapper.asOutput(doctorRepo.findAll());
    }

    @Override
    public DoctorResponse getById(long id) {
        return doctorMapper.asOutput(doctorRepo.findById(id).orElseThrow(() -> new NotFoundException(Msg.NOT_FOUND)));
    }

    @Override
    public DoctorResponse create(DoctorRequest request) {
        Optional<Doctor> isDoctorExist = doctorRepo.findByMail(request.getMail());
        if (isDoctorExist.isEmpty()){
            Doctor doctorSaved = doctorRepo.save(doctorMapper.asEntity(request));
            return doctorMapper.asOutput(doctorSaved);
        }
        throw new DataExistsException(Msg.DATA_EXISTS);
    }

    @Override
    public DoctorResponse update(long id, DoctorRequest request) {
        Optional<Doctor> doctorFromDb = doctorRepo.findById(id);
        if (doctorFromDb.isEmpty()) {
            throw new NotFoundException(Msg.NOT_FOUND);
        }
        String newMail = request.getMail();
        Optional<Doctor> newDoctor = doctorRepo.findByMail(newMail);
        if (newDoctor.isPresent() && newDoctor.get().getId() != id) {
            throw new DataExistsException(Msg.DATA_EXISTS);
        }
        Doctor doctor = doctorFromDb.get();
        doctorMapper.update(doctor, request);
        return doctorMapper.asOutput(doctorRepo.save(doctor));
    }

    @Override
    public void deleteById(long id) {
        Optional<Doctor> doctorFromDb = doctorRepo.findById(id);
        if (doctorFromDb.isPresent()){
            doctorRepo.delete(doctorFromDb.get());
        } else {
            throw new NotFoundException(Msg.NOT_FOUND);
        }
    }
}
