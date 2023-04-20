package com.example.randomapi.api;

import com.example.randomapi.dto.animal.AnimalResponse;
import com.example.randomapi.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/animals")
@CrossOrigin
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }


    @GetMapping
    public List<AnimalResponse> getAnimals() {
        return animalService.getAnimals();
    }

    @GetMapping("/{id}")
    public AnimalResponse getAnimalById(@PathVariable Long id) {
        return animalService.getAnimalById(id);
    }
}