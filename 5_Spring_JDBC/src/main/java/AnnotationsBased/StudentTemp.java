package AnnotationsBased;

import Entities.Student;

import java.util.List;

public interface StudentTemp {

    public int insert(Student student);
    public int change(Student student);
    public int delete(int id);

    public Student getStudent(int studentId);

    public List<Student> getAllStudent();


}
