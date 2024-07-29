package com.Map.ManyMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class DriverManager {

    public static void main(String[] args) throws Exception{

        Configuration conf  = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fact = conf.buildSessionFactory();
        Session session = fact.openSession();
        Transaction trans = session.beginTransaction();

        Employe first = new Employe(1,"First");
        Employe second = new Employe(2,"Second");
        Employe third = new Employe(3,"Third");
        session.save(first);
        session.save(second);
        session.save(third);
        Project one = new Project(1,"Linux");
        Project two = new Project(2,"Windows");
        Project three = new Project(3,"Mac");
        session.save(one);
        session.save(two);
        session.save(three);


//        session.beginTransaction();

        List<Employe> a = new ArrayList<>();
        a.add(first);
        a.add(second);

        List<Employe> b = new ArrayList<>();
        b.add(second);
        b.add(third);

        List<Employe> c = new ArrayList<>();
        c.add(third);
        c.add(first);

        List<Project> aa = new ArrayList<>();
        aa.add(one);
        aa.add(two);
        List<Project> bb = new ArrayList<>();
        bb.add(two);
        bb.add(three);
        List<Project> cc = new ArrayList<>();
        cc.add(three);
        cc.add(one);

        first.setProjects(aa);
        one.setEmployes(a);

        second.setProjects(bb);
        two.setEmployes(b);

        third.setProjects(cc);
        three.setEmployes(c);

        session.getTransaction().commit();

        session.close();
        fact.close();
    }
}
