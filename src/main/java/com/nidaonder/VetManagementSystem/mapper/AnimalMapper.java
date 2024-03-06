package com.nidaonder.VetManagementSystem.mapper;

import com.nidaonder.VetManagementSystem.dto.request.AnimalRequest;
import com.nidaonder.VetManagementSystem.dto.response.AnimalResponse;
import com.nidaonder.VetManagementSystem.entities.Animal;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface AnimalMapper {
    Animal asEntity(AnimalRequest animalRequest);
    AnimalResponse asOutput(Animal animal);
    List<AnimalResponse> asOutput(List<Animal> animal);
    void update(@MappingTarget Animal entity, AnimalRequest request);
}