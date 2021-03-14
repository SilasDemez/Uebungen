package fallmerayer.patterns.mvc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    private Model model = new Model();
    @FXML private TextField textField1;
    @FXML private TextField textField2;

    public void cToFButtonClicked(ActionEvent evt){
        Button clickedButton = (Button) evt.getTarget();
        textField2.setText(String.valueOf(model.celsToFahr(Double.parseDouble(textField1.getText()))));
    }

    public void fToCButtonClicked(ActionEvent evt){
        Button clickedButton = (Button) evt.getTarget();
        textField2.setText(String.valueOf(model.fahrToCels(Double.parseDouble(textField1.getText()))));
    }
}
