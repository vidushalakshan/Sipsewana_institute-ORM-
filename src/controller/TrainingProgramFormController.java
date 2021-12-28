package controller;

import business.BoFactory;
import business.BoType;
import business.custom.impl.ProgramBoImpl;
import com.jfoenix.controls.JFXTextField;
import dao.DaoFactory;
import dao.DaoType;
import dto.ProgramDto;
import entity.Program;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import view.tm.ProgramTm;

import java.sql.SQLException;
import java.util.ArrayList;

public class TrainingProgramFormController {
    public JFXTextField txtProgramID;
    public JFXTextField txtProgram;
    public JFXTextField txtDuration;
    public JFXTextField txtFee;
    public TableView tblTrainingProgram;
    public TableColumn colProgramID;
    public TableColumn colProgram;
    public TableColumn colDuration;
    public TableColumn colFee;

    ProgramBoImpl programBo = BoFactory.getInstance().getBO(BoType.PROGRAM);

    public void initialize(){

        setTable();

    }

    private void setTable() {
        try {

            colProgramID.setCellValueFactory(new PropertyValueFactory<>("pid"));
            colProgram.setCellValueFactory(new PropertyValueFactory<>("program"));
            colDuration.setCellValueFactory(new PropertyValueFactory<>("duration"));
            colFee.setCellValueFactory(new PropertyValueFactory<>("fee"));


            setToTable(programBo.find());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setToTable (ArrayList<ProgramDto> programs){

        ObservableList<ProgramTm> oblist= FXCollections.observableArrayList();
        programs.forEach(e->{  oblist.add(new ProgramTm(
                e.getPid(),e.getProgram(),e.getDuration(),e.getFee()));


        });
        tblTrainingProgram.setItems(oblist);

    }



    public void btnAddTraining(ActionEvent actionEvent) throws Exception {
        Program i1=new Program(
               txtProgramID.getText(),txtProgram.getText(),txtDuration.getText(),Double.parseDouble(txtFee.getText())
        );

        if(programBo.add(i1))
            new Alert(Alert.AlertType.CONFIRMATION,"Save........").show();
        else
            new Alert(Alert.AlertType.WARNING,"Try again...");

    }

    public void btnDelete(ActionEvent actionEvent) {

    }

    public void btnUpdate(ActionEvent actionEvent) {
    }
}
