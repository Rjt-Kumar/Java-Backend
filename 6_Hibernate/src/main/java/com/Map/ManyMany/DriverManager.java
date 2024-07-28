package com.Map.ManyMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DriverManager {

    public static void main(String[] args) throws Exception{

        Configuration conf  = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fact = conf.buildSessionFactory();
        Session session = fact.openSession();

        Employe first = new Employe(1,"First");
        Employe second = new Employe(2,"Second");
        Employe third = new Employe(3,"Third");

        Project one = new Project(1,"Linux");
        Project two = new Project(2,"Windows");
        Project three = new Project(3,"Mac");

        Transaction trans = session.beginTransaction();


        
        trans.commit();
        session.close();
        fact.close();
    }
}
