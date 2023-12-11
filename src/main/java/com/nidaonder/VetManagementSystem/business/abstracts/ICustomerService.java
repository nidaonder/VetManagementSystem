package com.nidaonder.VetManagementSystem.business.abstracts;

import com.nidaonder.VetManagementSystem.dto.request.CustomerRequest;
import com.nidaonder.VetManagementSystem.dto.response.CustomerResponse;

import java.util.List;

public interface ICustomerService {
    public List<CustomerResponse> findAll();
    public CustomerResponse getById(long id);
    public List<CustomerResponse> getByName(String name);
    public CustomerResponse create(CustomerRequest request);
    public CustomerResponse update(long id, CustomerRequest request);
    public void deleteById(long id);

}
