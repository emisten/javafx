package se.iths.karlemils.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class HelloController {
    public Button button1;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void labelClicked(MouseEvent mouseEvent) {
        if (mouseEvent.isControlDown())
            welcomeText.setBackground(Background.fill(Color.DARKRED));

    }
}