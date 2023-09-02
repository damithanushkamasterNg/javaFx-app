package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainFormController {
    @FXML
    private TextField txtMsg;
    @FXML
    void btnClickOnAction(ActionEvent event) {
        String text = txtMsg.getText();
        System.out.println(text);
    }

}
