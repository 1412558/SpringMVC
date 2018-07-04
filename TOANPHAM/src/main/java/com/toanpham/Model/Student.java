package com.toanpham.Model;

import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Student {
	String name;
	@Relationship(type = "ENROLLED")
	Set<Enrollment> enrollments;

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

	// @Relationship(type = "BUDDY", direction = Relationship.INCOMING)
	// Set<StudyBuddy> studyBuddies;

}
