package entities;

import org.neo4j.ogm.annotation.GraphId;

public class Entity {
    @GraphId
    private Long idGraph;

    public Long getIdGraph() {
        return idGraph;
    }

    void setIdGraph(Long id) {
        this.idGraph = id;
    }
}
