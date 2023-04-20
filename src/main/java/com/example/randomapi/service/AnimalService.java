package com.example.randomapi.service;

import com.example.randomapi.dto.animal.AnimalResponse;
import com.example.randomapi.repository.AnimalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<AnimalResponse> getAnimals() {
        return animalRepository.findAll().stream().map(AnimalResponse::new).toList();
    }

    public AnimalResponse getAnimalById(@PathVariable Long id) {
        return new AnimalResponse(animalRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Animal not found")));
    }


}
