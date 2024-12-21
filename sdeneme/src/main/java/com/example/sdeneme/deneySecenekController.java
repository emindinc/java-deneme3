package com.example.sdeneme;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class deneySecenekController {

    @FXML
    private Button bilesikOlusturmDeneyi;

    @FXML
    private Button bisiBulunurDeneyi;

    @FXML
    private Button kendinYapDeneyi;

    @FXML
    private Button pHOlcmeDeneyi;

    @FXML
    private Button deneydenGeri;



    @FXML
    void geriDon(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("anaekran.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) deneydenGeri.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Ana Sayfa");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
