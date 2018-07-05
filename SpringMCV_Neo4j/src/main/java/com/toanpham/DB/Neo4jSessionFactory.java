package com.toanpham.DB;

import org.neo4j.ogm.config.ClasspathConfigurationSource;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

public class Neo4jSessionFactory {
	private final ClasspathConfigurationSource props = new ClasspathConfigurationSource(
			"com/toanpham/DB/ogm.properties");
	private final Configuration configuration = new Configuration.Builder(props)
			.build();

	private final SessionFactory sessionFactory = new SessionFactory(
			configuration, "com.toanpham.entities");
	private static Neo4jSessionFactory factory = new Neo4jSessionFactory();

	public static Neo4jSessionFactory getInstance() {
		return factory;
	}

	private Neo4jSessionFactory() {

	}

	public Session getNeo4jSession() {
		return sessionFactory.openSession();
	}

}
