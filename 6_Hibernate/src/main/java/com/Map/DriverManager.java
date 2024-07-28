package com.Map;

//import jdk.internal.net.http.frame.WindowUpdateFrame;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

import javax.security.auth.login.AppConfigurationEntry;

public class DriverManager {

    public static void main(String[] args) throws Exception{

        Configuration conf = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fac = conf.buildSessionFactory();
        Session session = fac.openSession();
        Question q1 = new Question(1,"What is ur Name? ");
        Answer a1 = new Answer(1,"my Name is Levi");
        Answer a2 = new Answer(2,"My name is Eren");
        Answer a3 = new Answer(3,"Orewa Luffy disu");
        a1.setQuestion(q1);
        a2.setQuestion(q1);
        a3.setQuestion(q1);

        List<Answer> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        q1.setAns(list);


        Transaction trans = session.beginTransaction();
//
        session.save(q1);
//        session.save(a3);
//        session.save(a1);
//        session.save(a2);
//
        trans.commit();
        session.close();
        fac.close();

    }
}
