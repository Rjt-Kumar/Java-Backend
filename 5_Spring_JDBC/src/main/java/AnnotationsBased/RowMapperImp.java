package AnnotationsBased;

import Entities.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImp implements RowMapper {

    public RowMapperImp() {
        super();
    }

    @Override
    public Object mapRow(ResultSet set, int i) throws SQLException {
        Student stu = new Student(set.getInt(1),set.getString(2),set.getString(3));
        return stu;
    }
}
