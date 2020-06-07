package me.jittagornp.example.neo4j.controller;

import lombok.RequiredArgsConstructor;
import me.jittagornp.example.neo4j.entity.PersonEntity;
import me.jittagornp.example.neo4j.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 *
 * @author jitta
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonRepository personRepository;

    @GetMapping
    public Flux<PersonEntity> findAll() {
        return personRepository.findAll()
                .take(10);
    }

}
