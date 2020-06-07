package me.jittagornp.example.neo4j.entity;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;
import org.neo4j.springframework.data.core.schema.Property;
import org.neo4j.springframework.data.core.schema.Relationship;
import static org.neo4j.springframework.data.core.schema.Relationship.Direction.INCOMING;

/**
 *
 * @author jitta
 */
@Data
@Node("Movie")
public class MovieEntity {

    @Id
    private String title;

    @Property("tagline")
    private final String description;

    @Relationship(type = "ACTED_IN", direction = INCOMING)
    private Set<PersonEntity> actors;

    @Relationship(type = "DIRECTED", direction = INCOMING)
    private Set<PersonEntity> directors;

    public Set<PersonEntity> getActors() {
        if (actors == null) {
            actors = new HashSet<>();
        }
        return actors;
    }

    public Set<PersonEntity> getDirectors() {
        if (directors == null) {
            directors = new HashSet<>();
        }
        return directors;
    }
}
