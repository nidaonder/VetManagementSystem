package com.nidaonder.VetManagementSystem.business.concretes;

import com.nidaonder.VetManagementSystem.business.abstracts.IAvailableDateService;
import com.nidaonder.VetManagementSystem.dao.AvailableDateRepo;
import com.nidaonder.VetManagementSystem.dto.request.AvailableDateRequest;
import com.nidaonder.VetManagementSystem.dto.response.AvailableDateResponse;
import com.nidaonder.VetManagementSystem.mapper.AvailableDateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvailableDateManager implements IAvailableDateService {

    private final AvailableDateRepo availableDateRepo;
    private final AvailableDateMapper availableDateMapper;


    @Override
    public List<AvailableDateResponse> findAll() {
        return null;
    }

    @Override
    public AvailableDateResponse getById(long id) {
        return null;
    }

    @Override
    public AvailableDateResponse create(AvailableDateRequest request) {
        return null;
    }

    @Override
    public AvailableDateResponse update(long id, AvailableDateRequest request) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
