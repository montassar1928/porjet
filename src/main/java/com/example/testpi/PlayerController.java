package com.example.testpi;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PlayerController implements Initializable {
    @FXML
    private TableView<Player> tableView;
    @FXML
    private TableColumn<Player, String> playerNameCol;
    @FXML
    private TableColumn<Player, String> playerClubCol;
    @FXML
    private TableColumn<Player, String> playerPositionCol;
    @FXML
    private TableColumn<Player, String> playerNumberCol;
    @FXML
    private TableColumn<Player, String> playerDominantFootCol;
    @FXML
    private TableColumn<Player, String> playerAgeCol;
    @FXML
    private TableColumn<Player, String> playerRating;
    @FXML
    private TextField addPlayerName ;
    @FXML private TextField addPlayerPosition;
    @FXML private TextField addPlayerClub ;
    @FXML private TextField AddPlayerRating ;
    @FXML private TextField addPlayerNumber ;
    @FXML  private TextField addPlayerDominantFoot ;
    @FXML  private TextField addPlayerAge ;
    @FXML  private Button addPlayer ;
    private ObservableList<Player> people = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playerNameCol.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        playerClubCol.setCellValueFactory(new PropertyValueFactory<>("playerClub"));
        playerPositionCol.setCellValueFactory(new PropertyValueFactory<>("playerPosition"));
        playerNumberCol.setCellValueFactory(new PropertyValueFactory<>("playerNumber"));
        playerDominantFootCol.setCellValueFactory(new PropertyValueFactory<>("playerDominantFoot"));
        playerAgeCol.setCellValueFactory(new PropertyValueFactory<>("playerAge"));
        playerRating.setCellValueFactory(new PropertyValueFactory<>("playerRating"));


        people.add(new Player("Robert Lewa", "St", "25", "Fc Bayern", "9", "31", "right"));
        people.add(new Player("Pizzaro", "St", "25", "Fc Bayern", "9", "31", "right"));

        tableView.setItems(people);
    }
    public void handleButtonAddPlayer(){
        people.add(new Player(addPlayerName.getText()
        ,addPlayerPosition.getText(),addPlayerAge.getText(),addPlayerClub.getText(),addPlayerNumber.getText()
        ,AddPlayerRating.getText(),addPlayerDominantFoot.getText())) ;
    addPlayerName.clear() ;
    addPlayerPosition.clear() ;
    addPlayerAge.clear();
    addPlayerClub.clear();
    addPlayerNumber.clear();
    AddPlayerRating.clear();
    addPlayerDominantFoot.clear();


    }

}
