package com.nidaonder.VetManagementSystem.api;

import com.nidaonder.VetManagementSystem.business.abstracts.IAnimalService;
import com.nidaonder.VetManagementSystem.dto.request.AnimalRequest;
import com.nidaonder.VetManagementSystem.dto.response.AnimalResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/animals")
public class AnimalController {

    private final IAnimalService animalService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AnimalResponse> findAll(){
        return animalService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AnimalResponse getById(@PathVariable("id") long id){
        return animalService.getById(id);
    }

    @GetMapping("/customer/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<AnimalResponse> getByCustomer(@PathVariable("id") long id){
        return animalService.getByCustomer(id);
    }

    @GetMapping("/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<AnimalResponse> getByName(@PathVariable("name") String name){
        return animalService.getByName(name);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AnimalResponse save(@RequestBody AnimalRequest request){
        return animalService.create(request);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AnimalResponse update(@PathVariable("id") long id, @RequestBody AnimalRequest request){
        return animalService.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") long id){
        animalService.deleteById(id);
    }
}
