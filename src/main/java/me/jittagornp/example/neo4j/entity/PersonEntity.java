package me.jittagornp.example.neo4j.entity;

import lombok.Data;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

/**
 *
 * @author jitta
 */
@Data
@Node("Person")
public class PersonEntity {

    @Id
    private final String name;

    private final Integer born;

}
