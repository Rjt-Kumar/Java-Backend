package org.example;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) throws Exception{

        try {
            System.out.println("Hello world!");
            Configuration conf = new Configuration();
            conf.configure("hibernate.cnf.xml");
            SessionFactory factory = conf.buildSessionFactory();
            System.out.println(factory);
//            System.out.println(factory.isClosed());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}