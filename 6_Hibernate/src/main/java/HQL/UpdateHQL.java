package HQL;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateHQL {

    public static void main(String[] args) {
        Configuration conf = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fact = conf.buildSessionFactory();
        Session session = fact.openSession();
        Transaction trans = session.beginTransaction();

        String hql = "UPDATE Students_For_HQL SET name = :name where id = :id";
        Query q = session.createQuery(hql);
        q.setParameter("id",2);
        q.setParameter("name","Ayesha");

        int res = q.executeUpdate();
        System.out.println("------");
        System.out.println(res);
        trans.commit();
        session.close();
        fact.close();
    }
}
