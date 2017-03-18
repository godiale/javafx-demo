package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    Scene sceneName, sceneMove;

    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("Sea Battle");
            createSceneName(primaryStage);
            createSceneMove(primaryStage);
            primaryStage.setScene(sceneName);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("static-access")
    private void createSceneName(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome to Sea Battle");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label playerName = new Label("User Name:");
        grid.add(playerName, 0, 1);

        TextField playerTextField = new TextField();
        grid.add(playerTextField, 1, 1);

        Button btn = new Button("Next");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 0, 6);
        grid.setColumnSpan(actiontarget, 2);
        grid.setHalignment(actiontarget, HPos.RIGHT);
        actiontarget.setId("actiontarget");

        Group group = new Group();
        group.getChildren().addAll(grid);

        sceneName = new Scene(group, 300, 275);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                System.out.println("My name is " + playerTextField.getText());
                primaryStage.setScene(sceneMove);
            }
        });
    }

    private void createSceneMove(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("BUBU");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Group group = new Group();
        group.getChildren().addAll(grid);

        sceneMove = new Scene(group, 300, 275);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
