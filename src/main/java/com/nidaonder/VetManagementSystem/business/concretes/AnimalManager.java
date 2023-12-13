package com.nidaonder.VetManagementSystem.business.concretes;

import com.nidaonder.VetManagementSystem.business.abstracts.IAnimalService;
import com.nidaonder.VetManagementSystem.core.exception.DataExistsException;
import com.nidaonder.VetManagementSystem.core.exception.NotFoundException;
import com.nidaonder.VetManagementSystem.core.utilities.Msg;
import com.nidaonder.VetManagementSystem.dao.AnimalRepo;
import com.nidaonder.VetManagementSystem.dto.request.AnimalRequest;
import com.nidaonder.VetManagementSystem.dto.response.AnimalResponse;
import com.nidaonder.VetManagementSystem.entities.Animal;
import com.nidaonder.VetManagementSystem.mapper.AnimalMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnimalManager implements IAnimalService {

    private final AnimalRepo animalRepo;
    private final AnimalMapper animalMapper;

    @Override
    public List<AnimalResponse> findAll() {
        return animalMapper.asOutput(animalRepo.findAll());
    }

    @Override
    public AnimalResponse getById(long id) {
        return animalMapper.asOutput(animalRepo.findById(id).orElseThrow(() -> new NotFoundException(Msg.NOT_FOUND)));
    }


    // Değerledirme 18 : Bir hayvan sahibine ait tüm hayvanlar listeleniyor.
    @Override
    public List<AnimalResponse> getByCustomer(long id) {
        if (animalRepo.findByCustomerId(id).isEmpty()){
            throw new NotFoundException(Msg.NOT_FOUND);
        }
        return animalMapper.asOutput(animalRepo.findByCustomerId(id));
    }

    // Değerlendirme 11 : Hayvan kaydediliyor.
    @Override
    public AnimalResponse create(AnimalRequest request) {
        Optional<Animal> isAnimalExist = animalRepo.findByCustomerIdAndName(request.getCustomer().getId(), request.getName());
        if (isAnimalExist.isEmpty()){
            Animal animalSaved = animalRepo.save(animalMapper.asEntity(request));
            return animalMapper.asOutput(animalSaved);
        }
        throw new DataExistsException(Msg.DATA_EXISTS);
    }

    @Override
    public AnimalResponse update(long id, AnimalRequest request) {
        Optional<Animal> animalFromDb = animalRepo.findById(id);
        if (animalFromDb.isEmpty()){
            throw new NotFoundException(Msg.NOT_FOUND);
        }
        long newCustomerId = request.getCustomer().getId();
        String newName = request.getName();
        Optional<Animal> newAnimal = animalRepo.findByCustomerIdAndName(newCustomerId, newName);
        if (newAnimal.isPresent() && newAnimal.get().getId() != id){
            throw new DataExistsException(Msg.DATA_EXISTS);
        }
        Animal animal = animalFromDb.get();
        animalMapper.update(animal, request);
        return animalMapper.asOutput(animalRepo.save(animal));
    }

    @Override
    public void deleteById(long id) {
        Optional<Animal> animalFromDb = animalRepo.findById(id);
        if (animalFromDb.isPresent()){
            animalRepo.delete(animalFromDb.get());
        } else {
            throw new NotFoundException(Msg.NOT_FOUND);
        }
    }

    // Değerledirme 16 : Hayvanlar isme göre filtrelendiriliyor.
    @Override
    public List<AnimalResponse> getByName(String name) {
        if (animalRepo.findByNameIgnoreCase(name).isEmpty()){
            throw new NotFoundException(Msg.NOT_FOUND);
        }
        return animalMapper.asOutput(animalRepo.findByNameIgnoreCase(name));
    }
}
