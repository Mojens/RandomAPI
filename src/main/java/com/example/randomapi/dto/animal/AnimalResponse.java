package com.example.randomapi.dto.animal;

import com.example.randomapi.entity.Animal;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimalResponse {


    private Long id;

    private String name;

    private String species;

    private int age;

    private boolean isDomesticated;

    private String gender;

    private String breed;

    public AnimalResponse (Animal a){
        this.id = a.getId();
        this.name = a.getName();
        this.species = a.getSpecies();
        this.age = a.getAge();
        this.isDomesticated = a.isDomesticated();
        this.gender = a.getGender();
        this.breed = a.getBreed();
    }


}
