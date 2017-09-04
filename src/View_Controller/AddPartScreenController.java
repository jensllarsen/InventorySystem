package View_Controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class AddPartScreenController {

    @FXML
    private RadioButton partOutsourcedRadio;

    @FXML
    private ToggleGroup inOutGroup;

    @FXML
    private RadioButton partInhouseRadio;

    @FXML
    private Label addModifyPartLabel;

    @FXML
    private TextField partIDTextField;

    @FXML
    private TextField partNameTextField;

    @FXML
    private TextField partInvTextField;

    @FXML
    private TextField partPriceTextField;

    @FXML
    private TextField partMaxTextField;

    @FXML
    private TextField partMachineTextField;

    @FXML
    private TextField partMinTextField;

    @FXML
    private Button partSaveButton;

    @FXML
    private Button partCancelButton;
    
    @FXML
    private Label addPartMachLabel;

    @FXML
    void partCancelButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) partCancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void partInhouseRadioClick(ActionEvent event) {
        addPartMachLabel.setText("Machine ID");
    }

    @FXML
    void partOutsourcedRadioClick(ActionEvent event) {
        addPartMachLabel.setText("Company");
    }

    @FXML
    void partSaveButtonClick(ActionEvent event) {

    }

    public void initialize() {

    }
}
