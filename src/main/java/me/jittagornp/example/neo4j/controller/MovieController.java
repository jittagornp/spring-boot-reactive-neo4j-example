package me.jittagornp.example.neo4j.controller;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import me.jittagornp.example.neo4j.entity.MovieEntity;
import me.jittagornp.example.neo4j.repository.MovieRepository;
import org.neo4j.springframework.data.core.ReactiveNeo4jClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 *
 * @author jitta
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;

    private final ReactiveNeo4jClient reactiveNeo4jClient;

    @GetMapping
    public Flux<MovieEntity> findAll() {
        return movieRepository.findAll()
                .take(10);
    }

    @GetMapping("/actors")
    public Flux<Map<String, Object>> findActorsOfMovie(@RequestParam("movieTitle") final String movieTitle) {
        return reactiveNeo4jClient.query(
                "MATCH (node:Movie{ title : $title })<-[:ACTED_IN]-(actor) "
                + "RETURN actor.name AS name, actor.born AS born "
                + "ORDER BY actor.name"
        )
                .bind(movieTitle).to("title")
                .fetch()
                .all();
    }
}
