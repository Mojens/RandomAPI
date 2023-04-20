package com.example.randomapi.configuration;

import com.example.randomapi.entity.Animal;
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
import java.util.*;

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
        animalSetup();
    }

    public void setupPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(Person.builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .email("john.doe@example.com")
                .address("123 Main St")
                .phoneNumber("555-1234")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1993, 1, 1))
                .height(180.0)
                .build());

        persons.add(Person.builder()
                .firstName("Jane")
                .lastName("Doe")
                .age(28)
                .email("jane.doe@example.com")
                .address("456 Oak St")
                .phoneNumber("555-5678")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1995, 5, 20))
                .height(165.0)
                .build());

        persons.add(Person.builder()
                .firstName("Michael")
                .lastName("Jordan")
                .age(58)
                .email("michael.jordan@example.com")
                .address("23 Jumpman St")
                .phoneNumber("555-1010")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1963, 2, 17))
                .height(198.0)
                .build());

        persons.add(Person.builder()
                .firstName("LeBron")
                .lastName("James")
                .age(36)
                .email("lebron.james@example.com")
                .address("23 Lakers Blvd")
                .phoneNumber("555-2020")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1985, 12, 30))
                .height(203.0)
                .build());

        persons.add(Person.builder()
                .firstName("Serena")
                .lastName("Williams")
                .age(39)
                .email("serena.williams@example.com")
                .address("1 Grand Slam Dr")
                .phoneNumber("555-3030")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1982, 9, 26))
                .height(175.0)
                .build());

        persons.add(Person.builder()
                .firstName("Naomi")
                .lastName("Osaka")
                .age(23)
                .email("naomi.osaka@example.com")
                .address("2 Grand Slam Dr")
                .phoneNumber("555-4040")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1997, 10, 16))
                .height(180.0)
                .build());

        persons.add(Person.builder()
                .firstName("Elon")
                .lastName("Musk")
                .age(50)
                .email("elon.musk@example.com")
                .address("1 Tesla St")
                .phoneNumber("555-5050")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1971, 6, 28))
                .height(188.0)
                .build());

        persons.add(Person.builder()
                .firstName("Mark")
                .lastName("Zuckerberg")
                .age(37)
                .email("mark.zuckerberg@example.com")
                .address("1 Hacker Way")
                .phoneNumber("555-6060")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1984, 5, 14))
                .height(170.0)
                .build());

        persons.add(Person.builder()
                .firstName("Jeff")
                .lastName("Bezos")
                .age(57)
                .email("jeff.bezos@example.com")
                .address("1 Amazon Way")
                .phoneNumber("555-7070")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1964, 1, 12))
                .height(175.0)
                .build());

        persons.add(Person.builder()
                .firstName("Bill")
                .lastName("Gates")
                .age(65)
                .email("bill.gates@example.com")
                .address("1 Microsoft Way")
                .phoneNumber("555-8080")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1955, 10, 28))
                .height(170.0)
                .build());

        persons.add(Person.builder()
                .firstName("Melinda")
                .lastName("Gates")
                .age(56)
                .email("melinda.gates@example.com")
                .address("1 Microsoft Way")
                .phoneNumber("555-9090")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1964, 8, 15))
                .height(170.0)
                .build());

        persons.add(Person.builder()
                .firstName("Elaine")
                .lastName("Chao")
                .age(68)
                .email("elaine.chao@example.com")
                .address("1200 New Jersey Ave SE")
                .phoneNumber("555-1011")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1953, 3, 26))
                .height(160.0)
                .build());

        persons.add(Person.builder()
                .firstName("Joe")
                .lastName("Biden")
                .age(78)
                .email("joe.biden@example.com")
                .address("1600 Pennsylvania Ave NW")
                .phoneNumber("555-1212")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1942, 11, 20))
                .height(183.0)
                .build());

        persons.add(Person.builder()
                .firstName("Kamala")
                .lastName("Harris")
                .age(56)
                .email("kamala.harris@example.com")
                .address("1600 Pennsylvania Ave NW")
                .phoneNumber("555-1313")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1964, 10, 20))
                .height(157.0)
                .build());

        persons.add(Person.builder()
                .firstName("Donald")
                .lastName("Trump")
                .age(75)
                .email("donald.trump@example.com")
                .address("1600 Pennsylvania Ave NW")
                .phoneNumber("555-1414")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1946, 6, 14))
                .height(188.0)
                .build());

        persons.add(Person.builder()
                .firstName("Barack")
                .lastName("Obama")
                .age(59)
                .email("barack.obama@example.com")
                .address("1600 Pennsylvania Ave NW")
                .phoneNumber("555-1515")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1961, 8, 4))
                .height(185.0)
                .build());

        persons.add(Person.builder()
                .firstName("Michelle")
                .lastName("Obama")
                .age(57)
                .email("michelle.obama@example.com")
                .address("1600 Pennsylvania Ave")
                .phoneNumber("335-12322")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1964, 1, 12))
                .height(175.0)
                .build());


        persons.add(Person.builder()
                .firstName("Angela")
                .lastName("Merkel")
                .age(66)
                .email("angela.merkel@example.com")
                .address("1 Willy-Brandt-Straße")
                .phoneNumber("555-1616")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1954, 7, 17))
                .height(167.0)
                .build());

        persons.add(Person.builder()
                .firstName("Vladimir")
                .lastName("Putin")
                .age(68)
                .email("vladimir.putin@example.com")
                .address("23 Ilyinka St")
                .phoneNumber("555-1717")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1952, 10, 7))
                .height(170.0)
                .build());

        persons.add(Person.builder()
                .firstName("Xi")
                .lastName("Jinping")
                .age(68)
                .email("xi.jinping@example.com")
                .address("9 Fuyou St")
                .phoneNumber("555-1818")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1953, 6, 15))
                .height(170.0)
                .build());

        persons.add(Person.builder()
                .firstName("Emmanuel")
                .lastName("Macron")
                .age(43)
                .email("emmanuel.macron@example.com")
                .address("55 Rue du Faubourg Saint-Honoré")
                .phoneNumber("555-1919")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1977, 12, 21))
                .height(173.0)
                .build());

        persons.add(Person.builder()
                .firstName("Angus")
                .lastName("Young")
                .age(66)
                .email("angus.young@example.com")
                .address("1977 Rock St")
                .phoneNumber("555-2021")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1955, 3, 31))
                .height(160.0)
                .build());

        persons.add(Person.builder()
                .firstName("Ozzy")
                .lastName("Osbourne")
                .age(72)
                .email("ozzy.osbourne@example.com")
                .address("666 Bat St")
                .phoneNumber("555-2121")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1948, 12, 3))
                .height(175.0)
                .build());

        persons.add(Person.builder()
                .firstName("Madonna")
                .lastName("Ciccone")
                .age(63)
                .email("madonna.ciccone@example.com")
                .address("777 Material Girl Ave")
                .phoneNumber("555-2222")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1958, 8, 16))
                .height(164.0)
                .build());
        persons.add(Person.builder()
                .firstName("Karim")
                .lastName("Benzema")
                .age(33)
                .email("karim.benzema@example.com")
                .address("10 Bernabeu Blvd")
                .phoneNumber("555-3333")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1987, 12, 19))
                .height(185.0)
                .build());

        persons.add(Person.builder()
                .firstName("Gareth")
                .lastName("Bale")
                .age(32)
                .email("gareth.bale@example.com")
                .address("11 Bernabeu Blvd")
                .phoneNumber("555-4444")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1989, 7, 16))
                .height(185.0)
                .build());

        persons.add(Person.builder()
                .firstName("Luka")
                .lastName("Modric")
                .age(35)
                .email("luka.modric@example.com")
                .address("12 Bernabeu Blvd")
                .phoneNumber("555-5555")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1985, 9, 9))
                .height(172.0)
                .build());

        persons.add(Person.builder()
                .firstName("Toni")
                .lastName("Kroos")
                .age(31)
                .email("toni.kroos@example.com")
                .address("13 Bernabeu Blvd")
                .phoneNumber("555-6666")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1990, 1, 4))
                .height(182.0)
                .build());

        persons.add(Person.builder()
                .firstName("Sergio")
                .lastName("Ramos")
                .age(35)
                .email("sergio.ramos@example.com")
                .address("14 Bernabeu Blvd")
                .phoneNumber("555-7777")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1986, 3, 30))
                .height(184.0)
                .build());

        persons.add(Person.builder()
                .firstName("Eden")
                .lastName("Hazard")
                .age(30)
                .email("eden.hazard@example.com")
                .address("15 Bernabeu Blvd")
                .phoneNumber("555-8888")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1991, 1, 7))
                .height(175.0)
                .build());
        persons.add(Person.builder()
                .firstName("Michael")
                .lastName("Scott")
                .age(47)
                .email("michael.scott@example.com")
                .address("1725 Slough Avenue")
                .phoneNumber("555-1111")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1976, 3, 15))
                .height(183.0)
                .build());

        persons.add(Person.builder()
                .firstName("Dwight")
                .lastName("Schrute")
                .age(40)
                .email("dwight.schrute@example.com")
                .address("1725 Slough Avenue")
                .phoneNumber("555-2222")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1981, 1, 20))
                .height(180.0)
                .build());

        persons.add(Person.builder()
                .firstName("Jim")
                .lastName("Halpert")
                .age(38)
                .email("jim.halpert@example.com")
                .address("1725 Slough Avenue")
                .phoneNumber("555-3333")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1983, 10, 1))
                .height(185.0)
                .build());

        persons.add(Person.builder()
                .firstName("Pam")
                .lastName("Beesly")
                .age(34)
                .email("pam.beesly@example.com")
                .address("1725 Slough Avenue")
                .phoneNumber("555-4444")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1987, 3, 25))
                .height(165.0)
                .build());

        persons.add(Person.builder()
                .firstName("Andy")
                .lastName("Bernard")
                .age(38)
                .email("andy.bernard@example.com")
                .address("1725 Slough Avenue")
                .phoneNumber("555-5555")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1983, 7, 22))
                .height(182.0)
                .build());

        persons.add(Person.builder()
                .firstName("Angela")
                .lastName("Martin")
                .age(43)
                .email("angela.martin@example.com")
                .address("1725 Slough Avenue")
                .phoneNumber("555-6666")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1978, 6, 25))
                .height(160.0)
                .build());

        persons.add(Person.builder()
                .firstName("Homer")
                .lastName("Simpson")
                .age(42)
                .email("homer.simpson@example.com")
                .address("742 Evergreen Terrace")
                .phoneNumber("555-1111")
                .gender("Male")
                .dateOfBirth(LocalDate.of(1981, 5, 12))
                .height(180.0)
                .build());

        persons.add(Person.builder()
                .firstName("Marge")
                .lastName("Simpson")
                .age(41)
                .email("marge.simpson@example.com")
                .address("742 Evergreen Terrace")
                .phoneNumber("555-2222")
                .gender("Female")
                .dateOfBirth(LocalDate.of(1982, 7, 28))
                .height(170.0)
                .build());

        persons.add(Person.builder()
                .firstName("Bart")
                .lastName("Simpson")
                .age(10)
                .email("bart.simpson@example.com")
                .address("742 Evergreen Terrace")
                .phoneNumber("555-3333")
                .gender("Male")
                .dateOfBirth(LocalDate.of(2013, 2, 23))
                .height(145.0)
                .build());

        persons.add(Person.builder()
                .firstName("Lisa")
                .lastName("Simpson")
                .age(8)
                .email("lisa.simpson@example.com")
                .address("742 Evergreen Terrace")
                .phoneNumber("555-4444")
                .gender("Female")
                .dateOfBirth(LocalDate.of(2015, 9, 9))
                .height(135.0)
                .build());


        personRepository.saveAll(persons);

        String[] jobTitles = {
                "Software Engineer",
                "Sales Manager",
                "Accountant",
                "Marketing Specialist",
                "Project Manager",
                "Data Analyst",
                "Customer Service Representative",
                "Financial Analyst",
                "Human Resources Manager",
                "Operations Manager",
                "Graphic Designer",
                "Web Developer",
                "Social Media Manager",
                "Product Manager",
                "Business Development Manager",
                "IT Manager",
                "Quality Assurance Analyst",
                "UX Designer",
                "Technical Writer",
                "Network Administrator",
                "Database Administrator",
                "Public Relations Specialist",
                "Content Marketing Manager",
                "Customer Success Manager",
                "Web Designer",
                "SEO Specialist",
                "Business Analyst",
                "Chief Financial Officer",
                "Chief Operating Officer",
                "Chief Executive Officer",
                "Marketing Director",
                "Sales Director",
                "Customer Support Manager",
                "HR Generalist",
                "HR Coordinator",
                "HR Specialist",
                "Recruiter",
                "Corporate Trainer",
                "Front-End Developer",
                "Back-End Developer",
                "Full-Stack Developer",
                "Game Developer",
                "Mobile Developer",
                "Software Tester",
                "Software Architect",
                "Systems Administrator",
                "Network Engineer",
                "Data Scientist",
                "Database Developer",
                "Database Analyst",
                "UX Researcher",
                "UX Writer",
                "UI Designer",
                "UI Developer",
                "Technical Support Specialist",
                "Technical Account Manager",
                "Technical Project Manager",
                "IT Support Specialist",
                "DevOps Engineer"
        };
        List<Job> jobs = new ArrayList<>();
        Random random = new Random();
        Collections.shuffle(Arrays.asList(persons));
        Collections.shuffle(Arrays.asList(jobTitles));

        for (Person person : persons) {
            for (int i = 0; i < 6; i++) {
                String randomTitle = jobTitles[random.nextInt(jobTitles.length)];
                LocalDate randomStartDate = LocalDate.now().minusMonths(random.nextInt(60)).minusDays(random.nextInt(30));
                LocalDate randomEndDate = randomStartDate.plusMonths(random.nextInt(60)).plusDays(random.nextInt(30));
                Job job = Job.builder()
                        .title(randomTitle)
                        .startDate(randomStartDate)
                        .endDate(randomEndDate)
                        .person(person)
                        .build();
                jobs.add(job);
            }
        }

        jobRepository.saveAll(jobs);
        List<Education> educations = new ArrayList<>();

        String[] schools = {
                "Harvard University",
                "Stanford University",
                "Massachusetts Institute of Technology",
                "California Institute of Technology",
                "University of Chicago",
                "Princeton University",
                "Yale University",
                "Columbia University",
                "Duke University",
                "University of Pennsylvania",
                "Johns Hopkins University",
                "Cornell University",
                "Northwestern University",
                "Brown University",
                "University of Notre Dame",
                "Georgetown University",
                "University of California-Berkeley",
                "University of Michigan-Ann Arbor",
                "University of Virginia",
                "University of North Carolina-Chapel Hill",
                "University of Southern California",
                "University of California-Los Angeles",
                "New York University",
                "Emory University",
                "University of Wisconsin-Madison",
                "Vanderbilt University",
                "Washington University in St. Louis",
                "University of California-San Diego",
                "University of California-Santa Barbara",
                "University of California-Irvine"
        };

        String[] degrees = {
                "Bachelor of Arts",
                "Bachelor of Science",
                "Master of Arts",
                "Master of Science",
                "Doctor of Philosophy",
                "Juris Doctor",
                "Doctor of Medicine",
                "Master of Business Administration"
        };

        String[] fieldsOfStudy = {
                "Economics",
                "Computer Science",
                "Mechanical Engineering",
                "Electrical Engineering",
                "Civil Engineering",
                "Chemical Engineering",
                "Physics",
                "Mathematics",
                "Biology",
                "Chemistry",
                "Psychology",
                "Sociology",
                "Political Science",
                "English",
                "History"
        };

        Collections.shuffle(Arrays.asList(persons));
        Collections.shuffle(Arrays.asList(schools));
        Collections.shuffle(Arrays.asList(degrees));
        Collections.shuffle(Arrays.asList(fieldsOfStudy));

        for (Person person : persons) {
            for (int i = 0; i < 2; i++) {
                String randomSchool = schools[random.nextInt(schools.length)];
                String randomDegree = degrees[random.nextInt(degrees.length)];
                String randomFieldOfStudy = fieldsOfStudy[random.nextInt(fieldsOfStudy.length)];
                LocalDate randomStartDate = LocalDate.now().minusYears(random.nextInt(10)).minusMonths(random.nextInt(12)).minusDays(random.nextInt(30));
                LocalDate randomEndDate = randomStartDate.plusYears(random.nextInt(6)).plusMonths(random.nextInt(12)).plusDays(random.nextInt(30));
                Education education = Education.builder()
                        .school(randomSchool)
                        .degree(randomDegree)
                        .fieldOfStudy(randomFieldOfStudy)
                        .startDate(randomStartDate)
                        .endDate(randomEndDate)
                        .person(person)
                        .build();
                educations.add(education);
            }
        }

        educationRepository.saveAll(educations);
    }

    public void animalSetup() {
        List<Animal> animals = new ArrayList<>();
        animals.add(Animal.builder()
                .name("Buddy")
                .species("Dog")
                .age(4)
                .isDomesticated(true)
                .gender("Male")
                .breed("Poodle")
                .build());

        animals.add(Animal.builder()
                .name("Lucy")
                .species("Cat")
                .age(2)
                .isDomesticated(true)
                .gender("Female")
                .breed("Persian")
                .build());

        animals.add(Animal.builder()
                .name("Rocky")
                .species("Horse")
                .age(5)
                .isDomesticated(false)
                .gender("Male")
                .breed("Quarter Horse")
                .build());

        animals.add(Animal.builder()
                .name("Fluffy")
                .species("Rabbit")
                .age(3)
                .isDomesticated(true)
                .gender("Female")
                .breed("Angora")
                .build());

        animals.add(Animal.builder()
                .name("Max")
                .species("Dog")
                .age(2)
                .isDomesticated(true)
                .gender("Male")
                .breed("Labrador Retriever")
                .build());

        animals.add(Animal.builder()
                .name("Lola")
                .species("Parrot")
                .age(1)
                .isDomesticated(true)
                .gender("Female")
                .breed("African Grey")
                .build());

        animals.add(Animal.builder()
                .name("Duke")
                .species("Pig")
                .age(3)
                .isDomesticated(false)
                .gender("Male")
                .breed("Hampshire")
                .build());

        animals.add(Animal.builder()
                .name("Chloe")
                .species("Dog")
                .age(4)
                .isDomesticated(true)
                .gender("Female")
                .breed("British Bulldog")
                .build());

        animals.add(Animal.builder()
                .name("Charlie")
                .species("Snake")
                .age(1)
                .isDomesticated(false)
                .gender("Male")
                .breed("Ball Python")
                .build());

        animals.add(Animal.builder()
                .name("Milo")
                .species("Cat")
                .age(2)
                .isDomesticated(true)
                .gender("Male")
                .breed("Maine Coon")
                .build());

        animals.add(Animal.builder()
                .name("Sadie")
                .species("Hedgehog")
                .age(6)
                .isDomesticated(true)
                .gender("Female")
                .breed("African Pygmy")
                .build());

        animals.add(Animal.builder()
                .name("Smokey")
                .species("Cat")
                .age(4)
                .isDomesticated(true)
                .gender("Male")
                .breed("Scottish Fold")
                .build());

        animals.add(Animal.builder()
                .name("Cooper")
                .species("Dog")
                .age(2)
                .isDomesticated(true)
                .gender("Male")
                .breed("Boxer")
                .build());
        animals.add(Animal.builder()
                .name("Oliver")
                .species("Ferret")
                .age(3)
                .isDomesticated(true)
                .gender("Male")
                .breed("Albino")
                .build());
        animals.add(Animal.builder()
                .name("Harley")
                .species("Horse")
                .age(5)
                .isDomesticated(false)
                .gender("Male")
                .breed("Arabian")
                .build());

        animals.add(Animal.builder()
                .name("Luna")
                .species("Dog")
                .age(2)
                .isDomesticated(true)
                .gender("Female")
                .breed("German Shepherd")
                .build());

        animals.add(Animal.builder()
                .name("Jackson")
                .species("Lizard")
                .age(4)
                .isDomesticated(false)
                .gender("Male")
                .breed("Bearded Dragon")
                .build());

        animals.add(Animal.builder()
                .name("Mia")
                .species("Raccoon")
                .age(1)
                .isDomesticated(false)
                .gender("Female")
                .breed("Common")
                .build());

        animals.add(Animal.builder()
                .name("Bailey")
                .species("Dog")
                .age(3)
                .isDomesticated(true)
                .gender("Female")
                .breed("Golden Retriever")
                .build());

        animals.add(Animal.builder()
                .name("Simba")
                .species("Lion")
                .age(2)
                .isDomesticated(false)
                .gender("Male")
                .breed("African")
                .build());

        animals.add(Animal.builder()
                .name("Rosie")
                .species("Sheep")
                .age(4)
                .isDomesticated(true)
                .gender("Female")
                .breed("Merino")
                .build());

        animals.add(Animal.builder()
                .name("Mittens")
                .species("Hamster")
                .age(4)
                .isDomesticated(true)
                .gender("Female")
                .breed("Syrian")
                .build());

        animals.add(Animal.builder()
                .name("Teddy")
                .species("Dog")
                .age(2)
                .isDomesticated(true)
                .gender("Male")
                .breed("Pomeranian")
                .build());

        animals.add(Animal.builder()
                .name("Nala")
                .species("Tiger")
                .age(3)
                .isDomesticated(false)
                .gender("Female")
                .breed("Bengal")
                .build());

        animals.add(Animal.builder()
                .name("Zeus")
                .species("Bear")
                .age(4)
                .isDomesticated(false)
                .gender("Male")
                .breed("Grizzly")
                .build());

        animals.add(Animal.builder()
                .name("Loki")
                .species("Fox")
                .age(2)
                .isDomesticated(false)
                .gender("Male")
                .breed("Red")
                .build());

        animals.add(Animal.builder()
                .name("Sophie")
                .species("Dog")
                .age(3)
                .isDomesticated(true)
                .gender("Female")
                .breed("Poodle")
                .build());

        animals.add(Animal.builder()
                .name("Misty")
                .species("Rabbit")
                .age(1)
                .isDomesticated(true)
                .gender("Female")
                .breed("Dwarf Hotot")
                .build());

        animals.add(Animal.builder()
                .name("Hank")
                .species("Hippopotamus")
                .age(2)
                .isDomesticated(false)
                .gender("Male")
                .breed("Pygmy")
                .build());

        animals.add(Animal.builder()
                .name("Cleo")
                .species("Cat")
                .age(2)
                .isDomesticated(true)
                .gender("Female")
                .breed("Siamese")
                .build());

        animals.add(Animal.builder()
                .name("Riley")
                .species("Dolphin")
                .age(4)
                .isDomesticated(false)
                .gender("Female")
                .breed("Bottlenose")
                .build());

        animals.add(Animal.builder()
                .name("Midnight")
                .species("Bat")
                .age(3)
                .isDomesticated(false)
                .gender("Male")
                .breed("Vampire")
                .build());

        animals.add(Animal.builder()
                .name("Toby")
                .species("Dog")
                .age(2)
                .isDomesticated(true)
                .gender("Male")
                .breed("Corgi")
                .build());

        animals.add(Animal.builder()
                .name("Snowball")
                .species("Rabbit")
                .age(1)
                .isDomesticated(true)
                .gender("Male")
                .breed("Flemish Giant")
                .build());

        animals.add(Animal.builder()
                .name("Sadie")
                .species("Penguin")
                .age(5)
                .isDomesticated(false)
                .gender("Female")
                .breed("Emperor")
                .build());

        animals.add(Animal.builder()
                .name("Oreo")
                .species("Guinea Pig")
                .age(2)
                .isDomesticated(true)
                .gender("Male")
                .breed("Abyssinian")
                .build());

        animals.add(Animal.builder()
                .name("Sammy")
                .species("Fish")
                .age(3)
                .isDomesticated(true)
                .gender("Male")
                .breed("Goldfish")
                .build());

        animals.add(Animal.builder()
                .name("Mittens")
                .species("Panda")
                .age(1)
                .isDomesticated(false)
                .gender("Female")
                .breed("Giant")
                .build());
        animalRepository.saveAll(animals);
    }
}
