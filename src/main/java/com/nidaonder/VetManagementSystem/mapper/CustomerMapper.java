package com.nidaonder.VetManagementSystem.mapper;

import com.nidaonder.VetManagementSystem.dto.request.CustomerRequest;
import com.nidaonder.VetManagementSystem.dto.response.CustomerResponse;
import com.nidaonder.VetManagementSystem.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface CustomerMapper {
    Customer asEntity(CustomerRequest customerRequest);
    CustomerResponse asOutput(Customer customer);
    List<CustomerResponse> asOutput(List<Customer> customer);
    void update(@MappingTarget Customer entity, CustomerRequest request);
}
