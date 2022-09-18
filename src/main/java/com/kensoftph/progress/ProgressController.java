package com.kensoftph.progress;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class ProgressController {

    @FXML
    private Label labelProgress;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private ProgressIndicator progressIndicator;

    @FXML
    void makeProgress(ActionEvent event) {
        progress(progressIndicator);
        progress(progressBar);
    }

    private void progress(ProgressIndicator p){
        double value = p.getProgress();
        if(value < 0){
            value = 0.1;
        }else{
            value = value + 0.1;
            if(value >= 1.0){
                value = 1.0;
            }
        }
        p.setProgress(value);
        labelProgress.setText("Progress: " + Integer.toString((int) Math.round(value * 100))+ "%");
    }

}
