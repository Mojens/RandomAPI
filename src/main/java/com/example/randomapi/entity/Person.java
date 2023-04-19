package com.example.randomapi.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private Integer age;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private String phoneNumber;

    @Column
    private String gender;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private Double height;

    @ToString.Exclude
    @OneToMany(mappedBy = "person")
    private List<Job> jobs;

    @ToString.Exclude
    @OneToMany(mappedBy = "person")
    private List<Education> educations;

}
