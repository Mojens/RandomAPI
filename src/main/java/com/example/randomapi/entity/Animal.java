package com.example.randomapi.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String species;

    @Column
    private int age;

    @Column
    private boolean isDomesticated;

    @Column
    private String gender;

    @Column
    private String breed;

}
