package HQL;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;
import com.Map.*;

public class JOINsHQL{
    public static void main(String[] args) {

        Configuration conf = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fact = conf.buildSessionFactory();
        Session session = fact.openSession();

        // INNER JOIN
//        String inner_Join = "Select q from Answer a Left Join a.question q";
//        Query q = session.createQuery(inner_Join);
////        List<Object[]> list = q.getResultList();
////        System.out.println(list.size());
//
////        for(Object[] obj : list){
////            System.out.println(obj[0].getClass());
////            System.out.println(obj[1].getClass());
////        }
//
//        List<Object> list = q.getResultList();
//        System.out.println(list.size());
//        System.out.println(list);
////        for(Object obj : list){
//            System.out.println(obj.getClass());
//        }
//        System.out.println(list.size());
//        String leftJoin = "SELECT a, q FROM Answer a Right JOIN a.question q";
//        Query query = session.createQuery(leftJoin);
//        List<Object[]> list = query.getResultList();
//        System.out.println(list.size());
//        for (Object[] row : list) {
//            Answer answer = (Answer) row[0];
//            Question question = (Question) row[1];
//
//            System.out.print("Answer: " + answer.getId()+ " ");
//            if (question != null) {
//                System.out.print("Question: " + question.getId());
//            } else {
//                System.out.print("Question: NULL");
//            }
//            System.out.println();
//        }

        String leftJoin = "SELECT q FROM Answer a INNER JOIN a.question q";
        Query q = session.createQuery(leftJoin);
        List<Object> list = q.getResultList();

        for(Object obj : list){
            if( obj == null ){
                System.out.printf("NULL");
            }else System.out.print(obj + " ");
            System.out.println("");
        }
        session.close();
        fact.close();
    }
}