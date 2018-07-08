package com.SpringMVC.util;


//import org.neo4j.ogm.config.ClasspathConfigurationSource;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;


public class Neo4jSessionFactory {
//    private final static ClasspathConfigurationSource props = new ClasspathConfigurationSource("./config.properties");
//    private final static Configuration configuration = new Configuration.Builder(props).build();


    private final static String URI = "";
    private final static String Username = "";
    private final static String Password = "";


    private final static Configuration configuration = new Configuration.Builder().uri(System.getenv("DataBase_Neo4j_Http_Driver")).build();
    //private final static Configuration configuration = new Configuration.Builder().uri(URI).credentials(Username, Password).build();
    private final static SessionFactory sessionFactory = new SessionFactory(configuration, "com.SpringMVC.entities");
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
