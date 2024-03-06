package com.nidaonder.VetManagementSystem.business.abstracts;

import com.nidaonder.VetManagementSystem.dto.request.AnimalRequest;
import com.nidaonder.VetManagementSystem.dto.response.AnimalResponse;

import java.util.List;

public interface IAnimalService {
    List<AnimalResponse> findAll();
    AnimalResponse getById(Long id);
    List<AnimalResponse> getByCustomer(Long id);
    AnimalResponse create(AnimalRequest request);
    AnimalResponse update(Long id, AnimalRequest request);
    void deleteById(Long id);
    List<AnimalResponse> getByName(String name);
}
