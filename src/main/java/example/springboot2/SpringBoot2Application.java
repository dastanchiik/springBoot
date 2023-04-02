package example.springboot2;

import example.springboot2.model.Person;
import example.springboot2.repository.PersonRepo;
//import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
@RestController
@RequiredArgsConstructor
public class SpringBoot2Application {
    private final PersonRepo repo;
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2Application.class, args);
    }

    @PostConstruct
    public void init (){
        repo.saveAll(List.of(
           new Person("Dastan"),
           new Person("Baiel"),
           new Person("Atahan"),
           new Person("Chyngyz")
        ));
    }
}
