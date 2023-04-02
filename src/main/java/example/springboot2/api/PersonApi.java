package example.springboot2.api;

import example.springboot2.dto.request.PersonRequest;
import example.springboot2.model.Person;
import example.springboot2.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
@RequiredArgsConstructor
public class PersonApi {
    private final PersonService service;

    @GetMapping 
    public List<Person>getAllPeople(){
        return service.getAll();
    }

    @PostMapping("/save")
    public String save(@RequestBody PersonRequest personRequest) {
        service.register(personRequest);
        return "saved ✅";
    }
    @GetMapping("/getBy/{id}")
    public Person getPersonById(@PathVariable Long id){
        return service.getById(id);
    }
}
