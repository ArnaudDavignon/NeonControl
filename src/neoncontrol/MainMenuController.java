/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neoncontrol;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jakot
 */
public class MainMenuController implements Initializable {
    
    private Stage stage;
    @FXML
    private ImageView playBT;
    @FXML
    private ImageView settingsBT;
    @FXML
    private ImageView exitBT;
    @FXML
    private AnchorPane AnchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void setOnPlayClicked(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Level.fxml"));
        Scene newScene = AnchorPane.getScene();
        newScene.getWindow().setHeight(720);
        newScene.getWindow().setWidth(1280);
        newScene.getWindow().setX(150);
        newScene.getWindow().setY(50);
        newScene.setRoot(root); 
    }
    
    private void setStage(Stage stage){
        this.stage = stage;
    }

    @FXML
    private void setOnSettingsClicked(MouseEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("SettingsMenu.fxml"));
        Scene newScene = AnchorPane.getScene();
        newScene.setRoot(root);
    }

    @FXML
    private void setOnExitClicked(MouseEvent event) {
        System.exit(0);
    }
    
}
