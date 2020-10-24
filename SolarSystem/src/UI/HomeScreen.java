package UI;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import javafx.animation.*;
import javafx.application.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.animation.PathTransition;
public class HomeScreen extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		//Neptune's Path
		Circle neptunePath = new Circle();
		neptunePath.setRadius(325);
		neptunePath.setStroke(Color.BLUE);
		//Neptune
		Circle neptune = new Circle();
		neptune.setRadius(16);
		neptune.setFill(Color.INDIGO);
		//Uranus's Path
		Circle uranusPath = new Circle();
		uranusPath.setRadius(300);
		uranusPath.setStroke(Color.AQUA);
		//Uranus
		Circle uranus = new Circle();
		uranus.setRadius(16);
		uranus.setFill(Color.AQUAMARINE);
		//Saturn's Path
		Circle saturnPath = new Circle();
		saturnPath.setRadius(250);
		saturnPath.setStroke(Color.PURPLE);
		//Saturn
		Circle saturn = new Circle();
		saturn.setRadius(20);
		saturn.setFill(Color.ORANGERED);
		//Jupiter's Path
		Button playButton = new Button();
		playButton.setPrefSize(100,50);
		Button pauseButton = new Button();
		pauseButton.setPrefSize(100, 50);
		pauseButton.setStyle("-fx-background-color:Green");
		pauseButton.setStyle("-fx-padding:5px");
		Label label = new Label();
		ArrayList<String> arrayList = new ArrayList<String>();
		try {
			 FileInputStream stream = new FileInputStream("SpaceFacts.txt");
			 BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			 String line;
			 while((line = reader.readLine()) != null) {
				 arrayList.add(line);
			 }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Random random = new Random();
		int next = random.nextInt(arrayList.size()-1);
		String planetInfo = "Did You Know?" + "\n" + arrayList.get(next).toString();
		label.setText(planetInfo);
		label.setFont(Font.font("Arial",18));
		label.setTextFill(Color.ORANGE);
		playButton.setText("Play");
		pauseButton.setText("Pause");
		VBox sidePanel = new VBox();
		sidePanel.getChildren().addAll(label,playButton,pauseButton);
		sidePanel.setSpacing(15);
		label.setAlignment(Pos.TOP_CENTER);
		playButton.setAlignment(Pos.CENTER);
		pauseButton.setAlignment(Pos.CENTER);
		Circle jupiterPath = new Circle();
		jupiterPath.setRadius(195);
		jupiterPath.setStroke(Color.RED);
		//Jupiter
		Circle jupiter = new Circle();
		jupiter.setRadius(24);
		jupiter.setFill(Color.CORNSILK);
		//Mars' Path
		
		Circle marsPath = new Circle();
		marsPath.setRadius(140);
		marsPath.setStroke(Color.RED);
		//Mars
		Circle mars = new Circle();
		mars.setRadius(7);
		mars.setFill(Color.FIREBRICK);
		
		Circle earthPath = new Circle();
		earthPath.setRadius(100);
		earthPath.setStroke(Color.GREEN);
		//Earth
		Circle earth = new Circle();
		earth.setRadius(11);
		earth.setFill(Color.AQUA);
		
		//Venus
		Circle venus = new Circle();
		venus.setRadius(9);
		venus.setFill(Color.BEIGE);
		venus.setStroke(Color.ORANGE);
		//VenusPath
		Circle venusPath = new Circle();
		venusPath.setRadius(65);
		venusPath.setStroke(Color.ORANGE);
		
		//Mercury's Path
		Circle mercuryPath = new Circle();
		mercuryPath.setRadius(45);
		mercuryPath.setStroke(Color.WHITE);
		//Mercury
		Circle mercury = new Circle();
		mercury.setRadius(5);
		mercury.setFill(Color.DARKGRAY);
		//Sun
		Circle circle = new Circle();
		circle.setRadius(35);
		circle.setFill(Color.YELLOW);
		circle.setStroke(Color.BLUE);
	
		StackPane pane = new StackPane();
		pane.setStyle("-fx-background-color:Black");
		pane.getChildren().add(neptunePath);
		pane.getChildren().add(neptune);
		pane.getChildren().add(uranusPath);
		pane.getChildren().add(uranus);
		pane.getChildren().add(saturnPath);
		pane.getChildren().add(saturn);
		pane.getChildren().add(jupiterPath);
		pane.getChildren().add(jupiter);
		pane.getChildren().add(marsPath);
		pane.getChildren().add(mars);
		pane.getChildren().add(earthPath);
		pane.getChildren().add(earth);
		pane.getChildren().add(venusPath);
		pane.getChildren().add(venus);
		pane.getChildren().add(mercuryPath);
		pane.getChildren().add(mercury);
		pane.getChildren().add(circle);
		
		final PathTransition mPath = new PathTransition();
		mPath.setPath(mercuryPath);
		mPath.setNode(mercury);
		mPath.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		mPath.setCycleCount(Timeline.INDEFINITE);
		mPath.setRate(0.400);
		mPath.setAutoReverse(false);
		final PathTransition vPath = new PathTransition();
		vPath.setPath(venusPath);
		vPath.setNode(venus);
		vPath.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		vPath.setCycleCount(Timeline.INDEFINITE);
		vPath.setRate(0.114);
		vPath.setAutoReverse(false);
		final PathTransition ePath = new PathTransition();
		ePath.setPath(earthPath);
		ePath.setNode(earth);
		ePath.setCycleCount(Timeline.INDEFINITE);
		ePath.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		ePath.setRate(0.06);
		ePath.setAutoReverse(false);
		final PathTransition m_Path = new PathTransition();
		m_Path.setPath(marsPath);
		m_Path.setNode(mars);
		m_Path.setCycleCount(Timeline.INDEFINITE);
		m_Path.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		m_Path.setRate(0.04);
		m_Path.setAutoReverse(false);
		
		PathTransition jPath = new PathTransition();
		jPath.setPath(jupiterPath);
		jPath.setNode(jupiter);
		jPath.setCycleCount(Timeline.INDEFINITE);
		jPath.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		jPath.setRate(0.057);
		jPath.setAutoReverse(false);
		
		PathTransition sPath = new PathTransition();
		sPath.setPath(saturnPath);
		sPath.setNode(saturn);
		sPath.setCycleCount(Timeline.INDEFINITE);
		sPath.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		sPath.setRate(0.029);
		sPath.setAutoReverse(false);
		PathTransition uPath = new PathTransition();
		uPath.setPath(uranusPath);
		uPath.setNode(uranus);
		uPath.setCycleCount(Timeline.INDEFINITE);
		uPath.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		uPath.setRate(0.001);
		uPath.setAutoReverse(false);
		PathTransition nPath = new PathTransition();
		nPath.setPath(neptunePath);
		nPath.setNode(neptune);
		nPath.setCycleCount(Timeline.INDEFINITE);
		nPath.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		nPath.setRate(0.0003);
		nPath.setAutoReverse(false);
		mPath.play();
		vPath.play();
		ePath.play();
		m_Path.play();
		jPath.play();
		sPath.play();
		uPath.play();
		nPath.play();
		
		pauseButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//mPath.setPath(mercuryPath);
				mPath.pause();
				//vPath.setPath(venusPath);
				vPath.pause();
				//ePath.setPath(earthPath);
				ePath.pause();
				//m_Path.setPath(mercuryPath);
				m_Path.pause();
				//jPath.setPath(jupiterPath);
				jPath.pause();
				sPath.pause();
				uPath.pause();
				nPath.pause();
			}
			
		});
		playButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//mPath.setPath(mercuryPath);
				mPath.play();;
				//vPath.setPath(venusPath);
				vPath.play();
				//ePath.setPath(earthPath);
				ePath.play();
				//m_Path.setPath(mercuryPath);
				m_Path.play();
				//jPath.setPath(jupiterPath);
				jPath.play();
				sPath.play();
				uPath.play();
				nPath.play();
			}
			
		});
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		sidePanel.setStyle("-fx-background-color:Black");
		sidePanel.setAlignment(Pos.CENTER);
		borderPane.setLeft(sidePanel);
		Scene scene = new Scene(borderPane, 200, 250);
		scene.setFill(Color.BLACK);
		arg0.setScene(scene);
		arg0.setTitle("SolarSystem");
		arg0.setMaximized(true);
		arg0.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
