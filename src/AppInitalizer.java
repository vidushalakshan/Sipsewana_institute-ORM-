import entity.Program;
import entity.Student;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfuguration;

import java.io.IOException;
import java.net.URL;

public class AppInitalizer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("view/TrainingProgramFormr.fxml"))));
        primaryStage.setTitle("WholeSale Management");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
