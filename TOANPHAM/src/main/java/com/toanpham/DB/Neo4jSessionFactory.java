package com.toanpham.DB;

import org.neo4j.ogm.config.ClasspathConfigurationSource;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

public class Neo4jSessionFactory {
	private final String URL="bolt://localhost:7687";
	private final String Username = "neo4j";
	private final String Password = "kuga1996";
	private static Neo4jSessionFactory factory = new Neo4jSessionFactory();
	//private final static ConfigurationSource props = new ClasspathConfigurationSource("my.properties");
	//private final static Configuration configuration;


	private final Configuration configuration = new org.neo4j.ogm.config.Configuration("ogm.properties");
	private final SessionFactory sessionFactory = new SessionFactory(configuration, "ss");
	 public static Neo4jSessionFactory getInstance() {
	        return factory;
	    }


	// prevent external instantiation
	private Neo4jSessionFactory() {
		//driver = GraphDatabase.driver( URL, AuthTokens.basic( Username, Password ) );
		//sessionFactory = new SessionFactory(configuration, "com.mycompany.app.domainclasses");
	}

	public Session getNeo4jSession() {
		return sessionFactory.openSession();
	}
	
}
