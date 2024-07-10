package AnnotationsBased;

import Demo.StudentTemp;
import Entities.Student;
import com.mysql.cj.result.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentImp implements StudentTemp {

    @Autowired
    private JdbcTemplate temp;
    public StudentImp() {
        super();
    }

    @Override
    public int insert(Student student) {
        String in = "insert into student(id,name,city) values(?,?,?)";

        int res = temp.update(in,student.getId(),student.getName(),student.getCity());
        return res;
    }

    @Override
    public int change(Student student) {
        String upate = "update student set name=? , city=? where id=?";
        int res = temp.update(upate,student.getName(),student.getCity(),student.getId());
        return res;
    }

    @Override
    public int delete(int id) {
       String del = "Delete from student where id=?";
       int res = temp.update(del,id);
       return res;
    }

    @Override
    public Student getStudent(int studentId) {
       String select = "Select * from student where id = ? ";

       Student stu = (Student)temp.queryForObject(select,new RowMapperImp(),studentId);

       return stu;
    }

    @Override
    public List<Student> getAllStudent() {
        String sql = "Select * from student";
        List<Student> list = temp.query(sql,new RowMapperImp());

        return list;
    }

//    @Override
//    public String toString(){
//        System.out.println("This is the Object of ")  + this.st;
//    }
}
