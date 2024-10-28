package Demo;

import Entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;

public interface StudentTemp {

    public int insert(Student student);
    public int change(Student student);
    public int delete(int id);

    public Student getStudent(int studentId);

    public List<Student> getAllStudent();


}
