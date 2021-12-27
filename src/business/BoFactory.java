package business;

import business.custom.impl.ProgramBoImpl;
import business.custom.impl.StudentBoImpl;
import dao.DaoFactory;
import dao.DaoType;
import dao.SuperDao;
import dao.custom.impl.ProgramDaoImpl;
import dao.custom.impl.StudentDaoImpl;

public class BoFactory {
   /* private static BoFactory boFactory;

    private BoFactory() {
    }

    public static BoFactory getBOFactory() {
        if (boFactory == null) {
            boFactory = new BoFactory();
        }
        return boFactory;
    }

    public SuperBo getBO(BoTypes types) {
        switch (types) {
            case STUDENT:
                return new StudentBoImpl();
            case PROGRAM:
                return new ProgramBoImpl();

            default:
                return null;
        }
    }

    public enum BoTypes {
        STUDENT, PROGRAM
    }*/

    private static BoFactory boFactory;

    private BoFactory() {}

    public static BoFactory getInstance(){
        return (null == boFactory) ? boFactory = new BoFactory() : boFactory;
    }

    public <T extends SuperBo> T getBO(BoType boType){
        switch (boType){
            case STUDENT:
                return (T) new StudentBoImpl();
            case PROGRAM:
                return (T) new ProgramBoImpl();
            default:
                return null;
        }
    }
}
