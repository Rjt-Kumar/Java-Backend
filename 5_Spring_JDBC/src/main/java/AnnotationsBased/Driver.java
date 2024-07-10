package AnnotationsBased;

import Entities.Student;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] arr){
        try{
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            StudentImp obj = context.getBean("getStudentImp",StudentImp.class);

            showTable(obj);
            System.out.println("This is the table Before Any Operation");
//           Insert Operation
//            Student insert = new Student(5,"Aliaa","Heaven");
//            obj.insert(insert);
//            showTable(obj);

            //Delete Operation
            obj.delete(13);

            // Update Operation
            obj.change(new Student(2,"Mikasa","Paradis Island"));

            System.out.println("After performing operation ");
            showTable(obj);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void showTable(StudentImp obj){
        List<Student> list =  obj.getAllStudent();

        for(int i = 0; i < list.size();i++){
            int id = list.get(i).getId();
            String name = list.get(i).getName();
            String cit = list.get(i).getCity();

            System.out.println("ID : " + id + " | Name : " + name + " | City : " + cit);
        }
     }
}
