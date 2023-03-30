package example.springboot2.api;

import example.springboot2.model.Person;
import example.springboot2.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api/person")
@RequiredArgsConstructor
public class PersonApi {
    private final PersonService service;

    @GetMapping
    public List<Person>getAllPeople(){
        return service.getAll();
    }
}
