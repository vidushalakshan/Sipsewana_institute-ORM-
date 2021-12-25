package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RegisterStudentFormController {

    public JFXTextField txtRegisterName;
    public JFXTextField txtStudentName;
    public JFXTextField txtStudentNumber;
    public JFXTextField txtEmail;
    public JFXTextField txtMobileNumber;
    public JFXDatePicker txtBirthDate;
    public JFXComboBox cmbGender;
    public JFXTextField txtNic;
    public JFXComboBox cmbProgram;
    public JFXTextField txtDuration;
    public JFXTextField txtFee;
    public JFXTextField txtPay;
    public TableView tblStudentsRegister;
    public TableColumn colRegisterName;
    public TableColumn colStudentName;
    public TableColumn colStudentNumber;
    public TableColumn colEmail;
    public TableColumn colMobileNumber;
    public TableColumn colBirthDay;
    public TableColumn colGender;
    public TableColumn colNic;

    public void btnRegister(ActionEvent actionEvent) {
    }

    public void btnDelete(ActionEvent actionEvent) {
    }

    public void btnUpdate(ActionEvent actionEvent) {
    }
}
