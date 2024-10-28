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
        Question q2 = new Question(2,"What is ur Fav Character");
        Question q3 = new Question(3,"What is ur Number? ");
//        Question q4 = new Question(4,"Huh?");
        Answer a1 = new Answer(1,"my Name is Levi");
        Answer a2 = new Answer(2,"My name is Eren");
        Answer a3 = new Answer(3,"Orewa Luffy disu");
        Answer a4 = new Answer(4,"Fuck It");
        Answer a5 = new Answer(5,"Five");
        Answer a6 = new Answer(6,"Six");

//        List<Answer> first = new ArrayList<>();
//        first.add(a1);
//        first.add(a2);
//        a1.setQuestion(q1);
//        a2.setQuestion(q1);
//        q1.setAns(first);
//        List<Answer> second = new ArrayList<>();
//        second.add(a3);
//        second.add(a4);
//        a3.setQuestion(q2);
//        a4.setQuestion(q2);
//        q2.setAns(second);
//        List<Answer> third= new ArrayList<>();
//        third.add(a5);
//        third.add(a6);
//        a5.setQuestion(q3);
//        a6.setQuestion(q3);
//        q3.setAns(third);
//
//        Answer aa = new Answer(7,"It ended");
//        Answer bb = new Answer(8,"Maybe NOt");
//        Answer cc = new Answer(9,"its fine");
//        Answer dd = new Answer(10,"Its life afterall");
//
//        Question an = new Question(4,"How is it goining? ");
//        aa.setQuestion(an);
//
//        Question abb = new Question(5,"sdfasdf");
//        dd.setQuestion(abb);
        Transaction trans = session.beginTransaction();
//        session.save(q1);
//        session.save(aa);
//        session.save(bb);
//        session.save(cc);
//        session.save(dd);
//        session.save(an);
//        session.save(abb);
        Question newQ = new Question(6,"Solo kun Sikua Kun");
        session.save(newQ);

        trans.commit();
        session.close();
        fac.close();

    }
}
