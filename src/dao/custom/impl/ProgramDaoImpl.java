package dao.custom.impl;

import dao.custom.ProgramDao;
import entity.Program;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfuguration;

import java.util.List;

public class ProgramDaoImpl implements ProgramDao {
    @Override
    public boolean add(Program entity) throws Exception {
        Session session = FactoryConfuguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(entity);

        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Program entity) throws Exception {
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
    public Program find(String s) throws Exception {
        return null;
    }

    @Override
    public List<Program> findAll() throws Exception {
        return null;
    }
}
