package com.toanpham.entities;

import org.neo4j.ogm.annotation.GraphId;

@SuppressWarnings("deprecation")
public abstract class Entity {
//	@Id
//	@GeneratedValue
	@GraphId
	private Long idGraph;

	public Long getIdGraph() {
		return idGraph;
	}

	void setIdGraph(Long id) {
		this.idGraph = id;
	}
}
