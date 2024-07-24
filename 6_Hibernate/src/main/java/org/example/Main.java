package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) throws Exception{

        try {
            System.out.println("Hello world!");
//            Configuration conf = new Configuration();
            Configuration conf = new Configuration();
            conf.configure("hibernate.cnf.xml");
            SessionFactory factory = conf.buildSessionFactory();

//
//            Session sess = factory.openSession();
//
//            sess.beginTransaction();
//            Student first = getStud(1,"Rajat","Roorkee");
//
//            sess.save(first);
//            sess.getTransaction().commit();
//
//
//            sess.close();

            Session session = factory.openSession();
            Student second = getStud(2,"Chamaran","Behna");
            session.beginTransaction();

            session.save(second);
            session.getTransaction().commit();

            session.close() ;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Student getStud(int id,String name,String ciyt){
        return new Student(id,name,ciyt);
    }
}