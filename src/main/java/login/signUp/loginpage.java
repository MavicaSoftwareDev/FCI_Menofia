package login.signUp;

import com.example.FCI_Menofia.CustomFunctions;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class loginpage {


    @FXML
    private Button loginbutton;

    @FXML
    private TextField passworfdtextfield;

    @FXML
    private Button signupbuuton;

    @FXML
    private TextField usernametextfield;

    @FXML
    void signinbuttonfunction(ActionEvent event) {

    }

    @FXML
    void signupbuutonfunction(ActionEvent event) {
new CustomFunctions().gotToScene(signupbuuton,"signUpPage.fxml");
    }

}

