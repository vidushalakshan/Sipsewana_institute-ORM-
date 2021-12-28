package dao.custom.impl;

import dao.custom.StudentDao;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfuguration;

import java.util.List;

public class StudentDaoImpl implements StudentDao {


    @Override
    public boolean add(Student entity) throws Exception {
        Session session = FactoryConfuguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Student entity) throws Exception {
        Session session = FactoryConfuguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(String s) throws Exception {
        Session session = FactoryConfuguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, s);
        session.delete(student);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Student find() throws Exception {
        return null;

    }

    @Override
    public List<Student> findAll() throws Exception {
        /*Session session = FactoryConfuguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Student");
        List<Student> list = query.list();

        transaction.commit();
        session.close();
        return list;*/
        return null;
    }
}
