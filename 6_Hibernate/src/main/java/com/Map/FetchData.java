package com.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

    public static void main(String[] args) {


        Configuration conf = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fac = conf.buildSessionFactory();
        Session session = fac.openSession();

        Question q1 = session.get(Question.class,1);
//        System.out.println(q1.getQuestion() + ":" + q1.getAns().getAns());
        session.close();
        fac.close();


    }
}
