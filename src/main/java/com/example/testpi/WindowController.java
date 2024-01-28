package com.example.testpi;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class WindowController implements Initializable  {

    public void handleOnClick(Event mouseEvent) {
        if (mouseEvent.getSource() == playerBtn) {
            loadStages("Player.fxml");}
            else
                if(mouseEvent.getSource() == clubStatsBtn) {
                loadStages("Stats.fxml"); }
      else
          if(mouseEvent.getSource() == titlesBtn) {
            loadStages("Titles.fxml"); }
            else if (mouseEvent.getSource()==stadiumBtn){
                loadStages("Stadium.fxml");


        }}


    @FXML Button playerBtn ;
    @FXML Button clubStatsBtn ;
    @FXML Button titlesBtn ;
    @FXML Button stadiumBtn ;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
    private void loadStages(String fxml) {
        Parent root ;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxml)));

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
