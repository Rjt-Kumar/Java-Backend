package Demo;

import Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ImpeStudent implements StudentTemp{
    @Autowired
    private JdbcTemplate temp;
    @Override
    public int insert(Student student) {
        String sql = "insert into student(id,name,city) values(?,?,?)";
        int r = temp.update(sql,student.getId(),student.getName(),student.getCity());
        return r;
    }
    @Override
    public int change(Student student){
        String upate = "update student set name=? , city=? where id=?";
        int r = temp.update(upate,student.getName(),student.getCity(),student.getId());
        return 0;
    }

    @Override
    public int delete(int id){
        String del = "Delete from Student where id = ? ";
        int res = temp.update(del,id);

        return res;
    }

    @Override
    public Student getStudent(int studentId) {
       String sel = " Select * from student where id = ? ";
      return  this.temp.queryForObject(sel,new RowMapperImp(),studentId);
    }

    @Override
    public List<Student> getAllStudent(){
        String sel = "Select * from Student";
        List<Student> list = temp.query(sel,new RowMapperImp());

        return list;
    }

}

