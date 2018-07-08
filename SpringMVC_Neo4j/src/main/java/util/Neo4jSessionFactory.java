package util;


//import org.neo4j.ogm.config.ClasspathConfigurationSource;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;


public class Neo4jSessionFactory {
//    private final ClasspathConfigurationSource props = new ClasspathConfigurationSource("config.properties");
//    private final static Configuration configuration = new Configuration.Builder(props).build();

    private final static String URI="bolt://localhost:7687";
    private final static String Username = "neo4j";
    private final static String Password = "kuga1996";

    private final static Configuration configuration = new Configuration.Builder().uri(URI).credentials(Username, Password).build();
    private  final static SessionFactory sessionFactory = new SessionFactory(configuration, "entities");
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
