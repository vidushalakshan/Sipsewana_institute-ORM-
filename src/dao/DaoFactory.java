package dao;

import dao.custom.impl.ProgramDaoImpl;
import dao.custom.impl.StudentDaoImpl;

public class DaoFactory {
    /*private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getDAOFactory() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    //factory method
    public SuperDao getDAO(DAOTypes types) {
        switch (types) {
            case STUDENT:
                return new StudentDaoImpl();
            case PROGRAM:
                return new ProgramDaoImpl();
            default:
                return null;
        }
    }

    public enum DAOTypes {
        STUDENT, PROGRAM
    }*/

    private static DaoFactory daoFactory;

    private DaoFactory() {}

    public static DaoFactory getInstance(){
        return (null == daoFactory) ? daoFactory = new DaoFactory() : daoFactory;
    }

    public <T extends SuperDao>T getDAO(DaoType daoType){
        switch (daoType){
            case STUDENT:
                return (T) new StudentDaoImpl();
            case PROGRAM:
                return (T) new ProgramDaoImpl();

            default:
                return null;
        }
    }
}
