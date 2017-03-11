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
    @SuppressWarnings("static-access")
    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("Sea Battle");
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

            Scene scene = new Scene(group, 300, 275);
            primaryStage.setScene(scene);
            primaryStage.show();

            btn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent e) {
                    group.getChildren().clear();
                    System.out.println("Done");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
