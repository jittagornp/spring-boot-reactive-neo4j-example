package me.jittagornp.example.neo4j.repository;

import me.jittagornp.example.neo4j.entity.PersonEntity;
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository;

/**
 *
 * @author jitta
 */
public interface PersonRepository extends ReactiveNeo4jRepository<PersonEntity, String> {

}
