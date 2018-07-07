package entities;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Course extends Entity{
//	String name;
//	@Relationship(type = "SUBJECT_TAUGHT")
//	Subject subject;
//
//	@Relationship(type = "TEACHES_CLASS", direction = Relationship.INCOMING)
//	Teacher teacher;
//
//	@Relationship(type = "ENROLLED", direction = Relationship.INCOMING)
//	Set<Enrollment> enrollments = new HashSet<Enrollment>();

    private String name;

    private float credits;

    public Long getId() {
        return this.getIdGraph();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCredits() {
        return credits;
    }

    public void setCredits(float credits) {
        this.credits = credits;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
