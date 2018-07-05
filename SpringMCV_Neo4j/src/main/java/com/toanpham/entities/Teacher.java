package com.toanpham.entities;

import java.util.Set;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Teacher {
	String name;
	@Relationship(type = "TEACHES_CLASS")
	Set<Course> courses;

	@Relationship(type = "TAUGHT_BY", direction = Relationship.INCOMING)
	Set<Subject> subjects;
}
