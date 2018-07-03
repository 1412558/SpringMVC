package Model;

import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
@NodeEntity
public class Department extends Entity{
	String name;
	
	@Relationship(type = "CURRICULUM")
    Set<Subject> subjects;
	
	 Department() {

	 }
}
