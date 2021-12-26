import entity.Program;
import entity.Student;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfuguration;

public class AppInitalizer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Student student = new Student();
        student.setRegnum("20");
        student.setEmail("vidushalakshan");
        student.setGender("male");
        student.setMobilenum(145125);

        Program program = new Program();
        program.setPid("p001");
        program.setProgram("Software");
        program.setDuration("1year");
        program.setFee(20000);
        Session session = FactoryConfuguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        /*session.save(student);*/
        session.save(program);

        transaction.commit();
        session.close();
    }
}
