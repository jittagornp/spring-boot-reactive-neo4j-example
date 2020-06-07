package me.jittagornp.example.neo4j.repository;

import me.jittagornp.example.neo4j.entity.MovieEntity;
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository;

/**
 *
 * @author jitta
 */
public interface MovieRepository extends ReactiveNeo4jRepository<MovieEntity, String> {
    
}
