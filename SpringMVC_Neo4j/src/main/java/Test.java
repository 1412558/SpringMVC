import entities.Course;
import service.StudentServiceImpl;
import entities.Student;
import java.util.Collection;
// format code for a directory: Ctrl+Alt+L.
// format code for the current file: Ctrl+Shift+Alt+L.
public class Test {
    public static void main(String[] args) {

        Course oop = new Course();
        oop.setName("Object Oriented Programming");
        oop.setCredits(2.0f);

        Course algo = new Course();
        algo.setName("Advanced Algorithm");
        algo.setCredits(3.0f);

        Course db = new Course();
        db.setName("Database Internals");
        db.setCredits(3.0f);

        Student st1 = new Student("phạm quốc toàn");
        StudentServiceImpl Studentservice = new StudentServiceImpl();

        Studentservice.createOrUpdate(st1);
        Collection<Student> listStudent = Studentservice.findAll();
        for (Student stu : listStudent) {
            Studentservice.createOrUpdate(stu);
            System.out.println(stu.getName());
        }
    }
}
