package com.Annotations;

import jakarta.persistence.Transient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
//import sun.security.krb5.Config;

public class Driver {

    public static void main(String[] args) throws Exception{

//        Configuration conf = new Configuration();
//        conf.configure("com.Annotations/hibernate.cnf.xml");
//
//        SessionFactory fact = conf.buildSessionFactory();
//
//        Address adress = new Address();
//        adress.setCity("Roorkee");
//        adress.setOpen(true);
//        adress.setX(234.22);
//        adress.setStreet("Uttrakhad");
//        FileInputStream file = new FileInputStream("6_Hibernate/src/main/resources/Images/img_1.png");
//        byte[] image = new byte[file.available()];
//        adress.setImage(image);
//        Session session = fact.openSession();
//
//        Transaction trans = session.beginTransaction();
//
//         session.save(adress);
//
//        trans.commit();
//        session.close();
//        fact.close();
    }
}
