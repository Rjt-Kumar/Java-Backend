package Pagination;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;
import com.Map.*;


public class PageInation{
    public static void main(String[] args) {

        Configuration conf = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fact = conf.buildSessionFactory();
        Session session = fact.openSession();
        Transaction trans = session.beginTransaction();
//
//        trans.commit();

        String inner_join = "Select a.id from Answer a Inner Join a.question q ";
        Query q = session.createQuery(inner_join);
        q.setFirstResult(2);
        q.setMaxResults(4);
//        String hql = "from Answer where id = 1";
//        Query q = session.createQuery(hql);

        List<Object> list = q.getResultList();

        list.forEach(x -> {
            System.out.println(x);
        });
        session.close();
        fact.close();
    }
}