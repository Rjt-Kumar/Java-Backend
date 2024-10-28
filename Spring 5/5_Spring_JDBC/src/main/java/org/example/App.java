package org.example;

import Demo.ImpeStudent;
import Demo.StudentTemp;
import Entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;

public class App {
    public static void main(String[] args) {
        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("org.Example/Config.xml");
            StudentTemp temp = context.getBean("impStudent",ImpeStudent.class);

            // INSERT OPERATION
//            Student third = new Student(3,"Sky","Bangalore");
//            studentTemp.insert(third);


            // UPDATE OPERATION
//            Student up = new Student(3,"skyy","home");
//            int res = temp.change(up);
//            System.out.println(res);


            // DELETE OPERATION
//            int res = temp.delete(11);
//            System.out.println(res);

            // SELECT OPERATION

//            // For single row
//            Student stu = temp.getStudent(3);
//            System.out.println(stu);

              // Multiple Rows
            List<Student> list = temp.getAllStudent();

            System.out.println(list);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
