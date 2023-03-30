package example.springboot2.service;

import example.springboot2.model.Person;
import example.springboot2.repository.PersonRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepo service;

    public List<Person>getAll(){
        return service.findAll();
    }
}
