package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

    public static void main(String[] args) throws Exception {

        Configuration conf = new Configuration();
        conf.configure("org.Example/hibernate.cnf.xml");

        SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();

//        Student stud = new Student(5,"Skyy","Mumbai","India");

        Transaction trans = session.beginTransaction();
//        session.save(stud);
//
//        Student tu  = (Student)(session.get(Student.class,5));
//
        Student sec  =    (Student)(session.get(Student.class,8));

        Student third = (Student)(session.load(Student.class,5));
//        System.out.println(third.getCountry());
        trans.commit();

        session.close();


    }

}
