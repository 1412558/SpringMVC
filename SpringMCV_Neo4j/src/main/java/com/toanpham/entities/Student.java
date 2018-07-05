package com.toanpham.entities;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Student extends Entity {
	String name;
	@Relationship(type = "ENROLLED")
	Set<Enrollment> enrollments;
	// @Relationship(type = "BUDDY", direction = Relationship.INCOMING)
	// Set<StudyBuddy> studyBuddies;

	@Relationship(type = "ENROLLED", direction = Relationship.OUTGOING)
	private Set<Course> courses = new HashSet<Course>();

	public Student() {

	}
	public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public long getId() {
		return this.getIdGraph();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + this.getId() + "]";
	}
}
