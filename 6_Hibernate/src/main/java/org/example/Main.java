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
            conf.configure("org.Example/hibernate.cnf.xml");
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
            Address addrs = new Address("Mumbai","British");
            Student first = new Student(1,"SKyy");

            Address ad = new Address("London","UK");
            Student second = new Student(2,"Bich");
            second.setAddress(ad);
            first.setAddress(addrs);

            Session session = factory.openSession();

            session.beginTransaction();

            session.save(first);
            session.save(second);
            session.getTransaction().commit();

            session.close() ;
            factory.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


}