package com.batherphilippa.artapp.controller;

import com.batherphilippa.artapp.task.ArtworksListTask;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AppController {

    @FXML
    private TextField artistTextInput;

    @FXML
    private Button searchBtn;

    @FXML
    void searchArtistsWork(ActionEvent event) {
        String requestedWord = this.artistTextInput.getText();
        this.artistTextInput.clear();
        this.artistTextInput.requestFocus();
        ArtworksListTask artworksListTask = new ArtworksListTask(requestedWord);
        new Thread(artworksListTask).start();
    }
}
