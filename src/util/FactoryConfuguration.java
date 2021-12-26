package util;

import entity.Program;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FactoryConfuguration {
    private static FactoryConfuguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfuguration() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("hibernate.properties"));
        }catch (IOException e) {
            e.printStackTrace();
        }
        Configuration configuration = new Configuration().addProperties(properties)
                .addAnnotatedClass(Student.class).addAnnotatedClass(Program.class);
        sessionFactory = configuration.buildSessionFactory();
    }


    public static FactoryConfuguration getInstance(){
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfuguration() : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
