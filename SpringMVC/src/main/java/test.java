import java.util.Map;

//import io.github.cdimascio.dotenv.Dotenv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test {
    public static void main(String[] args) {
        //Logger logger = new Logger();
        System.out.println("ok");

//        Map<String, String> map = System.getenv();
//        map.entrySet().forEach(System.out::println);

        // get biến môi trường của OS
        //System.getenv("JAVA_HOME");
        System.out.println(System.getenv("Neo4j_DB_Http_Driver"));
        System.out.println(System.getenv("TMP"));


//        Dotenv dotenv = Dotenv.configure()
//                .directory("./")
////                .ignoreIfMalformed()
////                .ignoreIfMissing()
//                .load();
//
//        // get biến từ file *.env tỏng tỏng root của project
//        System.out.println(dotenv.get("DATABASE_URL"));
    }
}
