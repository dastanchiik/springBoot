package example.springboot2.service;

import example.springboot2.dto.request.PersonRequest;
import example.springboot2.model.Person;
import example.springboot2.repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepo service;

    public List<Person>getAll(){
        return service.findAll();
    }

    public void register(PersonRequest personRequest) {
        Person person = new Person();
        person.setName(personRequest.getName());
        service.save(person);
    }
    public Person getById(Long id){
        Optional<Person> person = Optional.ofNullable(service.findById(id).orElseThrow(() ->
                new RuntimeException("wrong id")));
        Person p = new Person();
        p.setId(person.get().getId());
        p.setName(person.get().getName());
        return p;
    }
}
