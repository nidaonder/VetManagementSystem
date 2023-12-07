package com.nidaonder.VetManagementSystem.business.concretes;

import com.nidaonder.VetManagementSystem.business.abstracts.ICustomerService;
import com.nidaonder.VetManagementSystem.dao.CustomerRepo;
import com.nidaonder.VetManagementSystem.dto.request.CustomerRequest;
import com.nidaonder.VetManagementSystem.dto.response.CustomerResponse;
import com.nidaonder.VetManagementSystem.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerManager implements ICustomerService {

    private final CustomerRepo customerRepo;
    private final CustomerMapper customerMapper;

    @Override
    public List<CustomerResponse> findAll() {
        return customerMapper.asOutput(customerRepo.findAll());
    }

    @Override
    public CustomerResponse getById(long id) {
        return customerMapper.asOutput(customerRepo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found!")));
    }

    @Override
    public CustomerResponse create(CustomerRequest request) {
        return null;
    }

    @Override
    public CustomerResponse update(long id, CustomerRequest request) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
