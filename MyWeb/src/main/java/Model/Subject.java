package Model;

import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
@NodeEntity
public class Subject {
	String name;
    @Relationship(type="CURRICULUM", direction = Relationship.INCOMING)
    Department department;

    @Relationship(type = "TAUGHT_BY")
    Set<Teacher> teachers;

    @Relationship(type = "SUBJECT_TAUGHT", direction = "INCOMING")
    Set<Course> courses;
}
