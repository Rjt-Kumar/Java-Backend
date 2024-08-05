package HQL;

import com.Map.Answer;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;


public class NativeSQL_Queries{
    public static void main(String[] args) {

        Configuration conf = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fact = conf.buildSessionFactory();
        Session session = fact.openSession();

        String sql = "Select * from Answer where id = 2";
        Query q = session.createNativeQuery(sql);

        List<Object> obj = q.getResultList();

        for (Object O : obj) {
            Answer ans = (Answer)O;
            System.out.println(((Answer) O).getId());
        }
        session.close();
        fact.close();
    }
}