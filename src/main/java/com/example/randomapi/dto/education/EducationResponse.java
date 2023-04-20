package com.example.randomapi.dto.education;

import com.example.randomapi.entity.Education;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EducationResponse {

    private String school;

    private String degree;

    private String fieldOfStudy;

    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private LocalDate startDate;

    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private LocalDate endDate;

    public EducationResponse(Education e){
        this.school = e.getSchool();
        this.degree = e.getDegree();
        this.fieldOfStudy = e.getFieldOfStudy();
        this.startDate = e.getStartDate();
        this.endDate = e.getEndDate();
    }


}
