package JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.AbstractQueue;

public class Main {

    public static void main(String[] args) {

        try{
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//            Client cl = context.getBean(Client.class);

//            System.out.println(cl);
            Student st = context.getBean("getStudent",Student.class);
            System.out.println(st);
        }catch(Exception e){

            System.out.println(e.getMessage());
        }

    }
}
