package com.nidaonder.VetManagementSystem.business.abstracts;

import com.nidaonder.VetManagementSystem.dto.request.AnimalRequest;
import com.nidaonder.VetManagementSystem.dto.response.AnimalResponse;

import java.util.List;

public interface IAnimalService {
    public List<AnimalResponse> findAll();
    public AnimalResponse getById(long id);
    public List<AnimalResponse> getByCustomer(long id);
    public AnimalResponse create(AnimalRequest request);
    public AnimalResponse update(long id, AnimalRequest request);
    public void deleteById(long id);
}
