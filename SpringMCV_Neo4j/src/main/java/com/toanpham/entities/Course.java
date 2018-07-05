package com.toanpham.entities;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Course {
	String name;
	@Relationship(type = "SUBJECT_TAUGHT")
	Subject subject;

	@Relationship(type = "TEACHES_CLASS", direction = Relationship.INCOMING)
	Teacher teacher;

	@Relationship(type = "ENROLLED", direction = Relationship.INCOMING)
	Set<Enrollment> enrollments = new HashSet<Enrollment>();
}
