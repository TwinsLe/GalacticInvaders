import java.util.*;
import java.io.*;
import java.awt.*;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyCode;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class GalacticInvaders extends Application {

    private double level; //Will set how fast the enemies move
    private Pane root = new Pane();
    private Player player = new Player(0, 0, 50, 50);

    public GalacticInvaders(){
        level = 1;
    }

    public GalacticInvaders(double lvl){
        level = Math.abs(lvl);
    }

    public double getLevel() { return level; }

    public void setLevel(double level) {
        this.level = level;
    }

    private Parent createContent(){
        root.setPrefSize(1200, 800);

        return root;
    }

    public void start(Stage stage) throws Exception{
        Scene scene = new Scene(createContent());
        scene.setOnKeyPressed(e -> {
            if(e.getCode().equals(KeyCode.A) || e.getCode().equals(KeyCode.LEFT)){
                player.moveLeft();
            }
            if(e.getCode().equals(KeyCode.D) || e.getCode().equals(KeyCode.RIGHT)){
                player.moveRight();
            }
            if(e.getCode().equals(KeyCode.SPACE)){
                player.Fire();
            }
        });
        player.setX(root.getPrefWidth()/2);
        player.setY(root.getPrefHeight()/8);
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);

    }
}
