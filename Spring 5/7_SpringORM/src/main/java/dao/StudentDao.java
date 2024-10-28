package dao;

import entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

public class StudentDao {

//    @Autowired
    private HibernateTemplate hibernateTemplate;

    public StudentDao(){
        super();
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public StudentDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(Student student){
        Integer i = (Integer)hibernateTemplate.save(student);
        return i;
    }

    @Transactional
    public Student read(int id){
        return (Student)(hibernateTemplate.get(Student.class,id));
    }

    @Transactional
    public void update(Student student){
        hibernateTemplate.update(student);
    }

}
