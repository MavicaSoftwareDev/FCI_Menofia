package com.example.FCI_Menofia;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainPage {
    @FXML
    private Button deleteButton;

    @FXML
    private Button displayButton;

    @FXML
    private Button insertButton;

    @FXML
    private Button updateButton;

        @FXML
        void goToDeleteScreen(ActionEvent event) {
//new CustomFunctions().gotToScene(deleteButton,);
        }

        @FXML
        void goToDisplayScreen(ActionEvent event) {
//new CustomFunctions().gotToScene(displayButton,"");
        }

        @FXML
        void goToInsertScreen(ActionEvent event) {
new CustomFunctions().gotToScene(insertButton,"insertPage.fxml");
        }

        @FXML
        void goToUpdateScreen(ActionEvent event) {

        }

    }