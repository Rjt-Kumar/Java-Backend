package Caching;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FirstLevel {

      public static void main(String[] args) throws Exception  {

            Configuration conf = new Configuration();
            conf.configure("com.Annotations/hibernate.cnf.xml");

            SessionFactory fact = conf.buildSessionFactory();
            Session session = fact.openSession();

//            Student stu = session.getStudent.class;
      }

}
