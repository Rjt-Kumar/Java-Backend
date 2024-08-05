package HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.spi.TreatedNavigablePath;

public class DBManager {

    public static void main(String[] args) {

        Configuration conf = new Configuration();
        conf.configure("com.Annotations/hibernate.cnf.xml");

        SessionFactory fact = conf.buildSessionFactory();
        Session session = fact.openSession();

        Student first =new Student(1,"First","One");
        Student second =new Student(2,"Skyy","Mumbai");
        Student third =new Student(4,"Levi","Roorkee");
        Student fourth =new Student(3,"DvSati","Melb");

        Transaction trans = session.beginTransaction();
        session.save(first);
        session.save(second);
        session.save(third);
        session.save(fourth);
        trans.commit();


        session.close();

    }
}
