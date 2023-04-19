package com.example.randomapi.configuration;

import com.example.randomapi.entity.Education;
import com.example.randomapi.entity.Job;
import com.example.randomapi.entity.Person;
import com.example.randomapi.repository.AnimalRepository;
import com.example.randomapi.repository.EducationRepository;
import com.example.randomapi.repository.JobRepository;
import com.example.randomapi.repository.PersonRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller
public class Setup implements ApplicationRunner {

    private final JobRepository jobRepository;
    private final AnimalRepository animalRepository;
    private final PersonRepository personRepository;
    private final EducationRepository educationRepository;

    public Setup(JobRepository jobRepository, AnimalRepository animalRepository, PersonRepository personRepository, EducationRepository educationRepository) {
        this.jobRepository = jobRepository;
        this.animalRepository = animalRepository;
        this.personRepository = personRepository;
        this.educationRepository = educationRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        setupPersons();
    }

    public void setupPersons() {
        Person person1 = Person.builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .email("john.doe@example.com")
                .address("123 Main St")
                .phoneNumber("555-1234")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1993, 1, 1))
                .height(180.0)
                .build();

        Person person2 = Person.builder()
                .firstName("Jane")
                .lastName("Doe")
                .age(28)
                .email("jane.doe@example.com")
                .address("456 Oak St")
                .phoneNumber("555-5678")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1995, 5, 5))
                .height(170.0)
                .build();

        Person person3 = Person.builder()
                .firstName("Bob")
                .lastName("Smith")
                .age(40)
                .email("bob.smith@example.com")
                .address("789 Elm St")
                .phoneNumber("555-9012")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1983, 10, 10))
                .height(190.0)
                .build();

        Person person4 = Person.builder()
                .firstName("Alice")
                .lastName("Smith")
                .age(35)
                .email("alice.smith@example.com")
                .address("321 Pine St")
                .phoneNumber("555-3456")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1988, 7, 7))
                .height(160.0)
                .build();

        Person person5 = Person.builder()
                .firstName("Tom")
                .lastName("Jones")
                .age(50)
                .email("tom.jones@example.com")
                .address("654 Maple St")
                .phoneNumber("555-7890")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1973, 12, 12))
                .height(175.0)
                .build();

        Person person6 = Person.builder()
                .firstName("Amy")
                .lastName("Lee")
                .age(27)
                .email("amy.lee@example.com")
                .address("321 Oak St")
                .phoneNumber("555-4321")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1996, 3, 3))
                .height(165.0)
                .build();

        Person person7 = Person.builder()
                .firstName("Peter")
                .lastName("Wang")
                .age(45)
                .email("peter.wang@example.com")
                .address("789 Maple St")
                .phoneNumber("555-8765")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1978, 8, 8))
                .height(180.0)
                .build();

        Person person8 = Person.builder()
                .firstName("Michelle")
                .lastName("Chan")
                .age(32)
                .email("michelle.chan@example.com")
                .address("456 Elm St")
                .phoneNumber("555-0192")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1989, 9, 9))
                .height(170.0)
                .build();

        Person person9 = Person.builder().firstName("David")
                .lastName("Kim")
                .age(37)
                .email("david.kim@example.com")
                .address("123 Pine St")
                .phoneNumber("555-2345")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1986, 4, 4))
                .height(175.0)
                .build();

        Person person10 = Person.builder()
                .firstName("Emily")
                .lastName("Nguyen")
                .age(29)
                .email("emily.nguyen@example.com")
                .address("654 Oak St")
                .phoneNumber("555-6789")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1994, 2, 2))
                .height(160.0)
                .build();

// Save Persons to repository
        personRepository.saveAll(List.of(person1, person2, person3, person4, person5, person6, person7, person8, person9, person10));

// Create Jobs
        Job job1 = Job.builder()
                .title("Software Engineer")
                .person(person1)
                .build();

        Job job2 = Job.builder()
                .title("Marketing Manager")
                .person(person2)
                .build();

        Job job3 = Job.builder()
                .title("Sales Associate")
                .person(person3)
                .build();

        Job job4 = Job.builder()
                .title("Product Manager")
                .person(person4)
                .build();

        Job job5 = Job.builder()
                .title("Project Manager")
                .person(person5)
                .build();

        Job job6 = Job.builder()
                .title("Data Scientist")
                .person(person6)
                .build();

        Job job7 = Job.builder()
                .title("Operations Manager")
                .person(person7)
                .build();

        Job job8 = Job.builder()
                .title("Financial Analyst")
                .person(person8)
                .build();

        Job job9 = Job.builder()
                .title("Marketing Coordinator")
                .person(person9)
                .build();

        Job job10 = Job.builder()
                .title("Web Developer")
                .person(person10)
                .build();

// Save Jobs to repository
        jobRepository.saveAll(List.of(job1, job2, job3, job4, job5, job6, job7, job8, job9, job10));

// Create Educations
        Education edu1 = Education.builder()
                .school("Harvard University")
                .degree("Bachelor of Arts")
                .fieldOfStudy("Economics")
                .startDate(LocalDate.of(2010, 9, 1))
                .endDate(LocalDate.of(2014, 5, 1))
                .person(person1)
                .build();

        Education edu2 = Education.builder()
                .school("Stanford University")
                .degree("Master of Science")
                .fieldOfStudy("Computer Science")
                .startDate(LocalDate.of(2012, 9, 1))
                .endDate(LocalDate.of(2014, 5, 1))
                .person(person1)
                .build();

        Education edu3 = Education.builder()
                .school("Yale University")
                .degree("Master of Business Administration")
                .fieldOfStudy("Marketing")
                .startDate(LocalDate.of(2014, 9, 1))
                .endDate(LocalDate.of(2016, 5, 1))
                .person(person2)
                .build();

        Education edu4 = Education.builder()
                .school("Columbia University")
                .degree("Bachelor of Science")
                .fieldOfStudy("Physics")
                .startDate(LocalDate.of(1999, 9, 1))
                .endDate(LocalDate.of(2003, 5, 1))
                .person(person3)
                .build();

        Education edu5 = Education.builder()
                .school("Princeton University")
                .degree("Master of Public Affairs")
                .fieldOfStudy("Public Policy")
                .startDate(LocalDate.of(2008, 9, 1))
                .endDate(LocalDate.of(2010, 5, 1))
                .person(person4)
                .build();

        Education edu6 = Education.builder()
                .school("University of California, Berkeley")
                .degree("Bachelor of Arts")
                .fieldOfStudy("English")
                .startDate(LocalDate.of(1991, 9, 1))
                .endDate(LocalDate.of(1995, 5, 1))
                .person(person5)
                .build();

        Education edu7 = Education.builder()
                .school("Massachusetts Institute of Technology")
                .degree("Master of Science")
                .fieldOfStudy("Mathematics")
                .startDate(LocalDate.of(2014, 9, 1))
                .endDate(LocalDate.of(2016, 5, 1))
                .person(person6)
                .build();

        Education edu8 = Education.builder()
                .school("University of Chicago")
                .degree("Bachelor of Science")
                .fieldOfStudy("Chemistry")
                .startDate(LocalDate.of(2000, 9, 1))
                .endDate(LocalDate.of(2004, 5, 1))
                .person(person7)
                .build();

        Education edu9 = Education.builder()
                .school("Northwestern University")
                .degree("Master of Arts")
                .fieldOfStudy("Psychology")
                .startDate(LocalDate.of(2010, 9, 1))
                .endDate(LocalDate.of(2012, 5, 1))
                .person(person8)
                .build();

        Education edu10 = Education.builder()
                .school("University of Michigan")
                .degree("Bachelor of Science")
                .fieldOfStudy("Computer Engineering")
                .startDate(LocalDate.of(2010, 9, 1))
                .endDate(LocalDate.of(2014, 5, 1))
                .person(person9)
                .build();

        Education edu11 = Education.builder()
                .school("University of Texas at Austin")
                .degree("Master of Business Administration")
                .fieldOfStudy("Finance")
                .startDate(LocalDate.of(2013, 9, 1))
                .endDate(LocalDate.of(2015, 5, 1))
                .person(person10)
                .build();

// Save Educations to repository
        educationRepository.saveAll(List.of(edu1, edu2, edu3, edu4, edu5, edu6, edu7, edu8, edu9, edu10, edu11));
    }
}
