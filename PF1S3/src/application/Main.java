package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;


public class Main extends Application {
	@Override
	public void start(Stage stage) {

		try {
			//ImageView background = new ImageView (new Image(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("/Imgs/wallhaven-433953_1600x900.png"))));
			ImageView imagen = new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Imgs/music_96px.png"))));
			Label label = new Label("MUSIC PLAYER", imagen);
			label.setStyle("-fx-font-size: 30px; -fx-font-weight: 900; -fx-text-fill: #ffffff;");

			Text texto = new Text("All rights reserved to the author @2022");
			texto.setFill(Color.GRAY);
			texto.setFont(new javafx.scene.text.Font("Arial", 12));

			HBox cajaLabel = new HBox();
			cajaLabel.getChildren().add(label);
			cajaLabel.setAlignment(Pos.CENTER);

			HBox cajaText = new HBox();
			cajaText.getChildren().add(texto);
			cajaText.setAlignment(Pos.BOTTOM_CENTER);
			cajaText.setPadding(new javafx.geometry.Insets(0, 0, 13, 0));

			StackPane root = new StackPane();
			root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
			root.getChildren().addAll(cajaLabel, cajaText);
			Scene scene = new Scene(root,758,480);
			stage.setTitle("Music Player - SplashScreen");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Imgs/icons8_music_16.png"))));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
