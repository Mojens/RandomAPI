package com.example.randomapi.dto.person;

import com.example.randomapi.dto.education.EducationResponse;
import com.example.randomapi.dto.job.JobResponse;
import com.example.randomapi.entity.Education;
import com.example.randomapi.entity.Job;
import com.example.randomapi.entity.Person;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonResponse {

    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String email;

    private String address;

    private String phoneNumber;

    private String gender;

    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private LocalDate dateOfBirth;

    private Double height;

    private List<JobResponse> jobs;

    private List<EducationResponse> educations;

    public PersonResponse(Person p) {
        this.id = p.getId();
        this.firstName = p.getFirstName();
        this.lastName = p.getLastName();
        this.age = p.getAge();
        this.email = p.getEmail();
        this.address = p.getAddress();
        this.phoneNumber = p.getPhoneNumber();
        this.gender = p.getGender();
        this.dateOfBirth = p.getDateOfBirth();
        this.height = p.getHeight();
        if (p.getJobs() != null) {
            this.jobs = p.getJobs().stream().map(JobResponse::new).collect(Collectors.toList());
        }
        if (p.getEducations() != null) {
            this.educations = p.getEducations().stream().map(EducationResponse::new).collect(Collectors.toList());

        }
    }


}
