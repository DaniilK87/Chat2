package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FirstScene {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authorizationChat;

    @FXML
    private Button registrationChat;

    @FXML
    private TextField passwordChat;

    @FXML
    private TextField loginChat;

    @FXML
    void initialize() {
        authorizationChat.setOnAction(event -> {
            System.out.println(222);
        });
    }
}
