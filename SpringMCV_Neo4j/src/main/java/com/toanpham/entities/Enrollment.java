package com.toanpham.entities;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;

import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

@RelationshipEntity(type = "ENROLLED")
public class Enrollment {
	Long id;

	@StartNode
	Student student;

	@EndNode
	Course course;

	@DateLong
	Date enrolledDate;
}
