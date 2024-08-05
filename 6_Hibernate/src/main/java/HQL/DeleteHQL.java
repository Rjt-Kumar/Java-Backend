package HQL;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteHQL {
    public static void main(String[] args) {

        Configuration conf = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fact = conf.buildSessionFactory();
        Session session = fact.openSession();
        Transaction trans = session.beginTransaction();

        String hql = "Delete from Students_For_HQL where id = :id";
        Query q = session.createQuery(hql);
        q.setParameter("id",4);
        int res = q.executeUpdate();

        System.out.println(res);
        trans.commit();
        session.close();
        fact.close();
    }
}
