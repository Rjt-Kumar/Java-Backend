package Driver;

import dao.StudentDao;
import entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception{

//        System.out.printf("First");
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentDao dao = context.getBean("studentDAO",StudentDao.class);
        Student first = new Student(1,"Dwivedi","Bhangeri");

//        dao.insert(first);
//        System.out.println(first);
        Student second = new  Student(2,"Vishal","Jalalpur");

//            System.out.println(dao.read(1));
        Student newSt = new Student(2,"Skayu","Aus");
//            dao.update(newSt);

            System.out.println(dao.read(1));
        }catch(Exception e){

            System.out.println(e.getMessage());
        }
//      System.out.println("Hey");
    }
}
