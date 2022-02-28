package springprojet.springprojet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springprojet.springprojet.PersonneP;
import springprojet.springprojet.repository.PersonneRepository;
import springprojet.springprojet.repository.ReferenceRepository;

import java.util.List;

@RestController
public class OrderController {
@Autowired
    private PersonneRepository personneRepository;
@Autowired
    private ReferenceRepository referenceRepository;

    @PostMapping("/placeRef")
    public PersonneP placeRef(@RequestBody PersonneP pp){
        return personneRepository.save(pp);
    }
    @GetMapping("/findAllRef")
    public List<PersonneP> findAllRef(){
        return personneRepository.findAll();
    }

}
