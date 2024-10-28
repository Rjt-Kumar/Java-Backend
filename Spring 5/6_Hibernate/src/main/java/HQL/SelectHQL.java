package HQL;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectHQL {

    public static void main(String[] args) {

        Configuration conf = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fact = conf.buildSessionFactory();
        Session session = fact.openSession();


//        String hql = "From Students_For_HQL";
//        Query q = session.createQuery(hql);
//
//        List<Student> list = q.getResultList();
//        System.out.println("Complete fine");
//        for(Student std : list ){
//            System.out.println(std);
//        }

          String hql = "from Students_For_HQL as s where s.id = :id and s.name = :name";
          Query q = session.createQuery(hql);
          q.setParameter("id",2);
          q.setParameter("name","skyy");

        System.out.println(q.getSingleResult());
        session.close();
        fact.close();
    }
}
