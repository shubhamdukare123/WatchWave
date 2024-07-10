
import java.io.FileInputStream;
import java.io.InputStream;
//import DB.JDBCDemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Info  {

	// Movies move = new Movies();
    Button moveBack;
	public void goToInfo(Stage stage, String id, String name)  throws Exception{
		BorderPane root = new BorderPane();	

		// loading bg img 
        InputStream cpageInput = new FileInputStream("Images\\common page.PNG");
		Image backgroundImage = new Image(cpageInput);
		ImageView backgroundImageView = new ImageView(backgroundImage);
		backgroundImageView.setFitWidth(1920);
		backgroundImageView.setFitHeight(1080);
		root.getChildren().add(backgroundImageView);


		// loading small logo 
        InputStream logoInput = new FileInputStream("Images\\finalLogo.png");
		Image image = new Image(logoInput);
		ImageView iView = new ImageView(image);
		iView.setImage(image);
		iView.setX(30);
		iView.setY(30);
		iView.setFitWidth(450);
		iView.setPreserveRatio(true);
		root.getChildren().add(iView);

		Text mName = new Text();
		JDBCDemo obj = new JDBCDemo();
		String getMovieName = obj.getMovieName(id); 
		mName.setText(getMovieName);
		mName.setFont(Font.font("Centuary Gothic", FontWeight.EXTRA_BOLD, 55));
		mName.setFill(Color.WHITE);
		mName.setTranslateX(30);
		mName.setTranslateY(200);

		Blend blend = new Blend();
		blend.setMode(BlendMode.MULTIPLY);

		DropShadow ds = new DropShadow();
		ds.setColor(Color.rgb(254, 235, 66, 0.3));
		ds.setOffsetX(5);
		ds.setOffsetY(5);
		ds.setRadius(5);
		ds.setSpread(0.2);

		blend.setBottomInput(ds);

		DropShadow ds1 = new DropShadow();
		ds1.setColor(Color.web("#f13a00"));
		ds1.setRadius(20);
		ds1.setSpread(0.2);

		Blend blend2 = new Blend();
		blend2.setMode(BlendMode.MULTIPLY);

		InnerShadow is = new InnerShadow();
		is.setColor(Color.web("#feeb42"));
		is.setRadius(9);
		is.setChoke(0.8);
		blend2.setBottomInput(is);

		InnerShadow is1 = new InnerShadow();
		is1.setColor(Color.web("#f13a00"));
		is1.setRadius(5);
		is1.setChoke(0.4);
		blend2.setTopInput(is1);

		Blend blend1 = new Blend();
		blend1.setMode(BlendMode.MULTIPLY);
		blend1.setBottomInput(ds1);
		blend1.setTopInput(blend2);

		blend.setTopInput(blend1);

		mName.setEffect(blend);

		root.getChildren().add(mName);

        // creating Director  text 
		Text director = new Text();
		director.setText("Director : ");
		director.setFont(Font.font("Centuary Gothic", FontWeight.BOLD, 30));
		director.setX(30);
		director.setFill(Color.ORANGE);
		director.setY(280);
		root.getChildren().add(director);

		Text directorName = new Text();
		String getDirectorName = obj.getMovieDirector(id);
		directorName.setText(getDirectorName);
		directorName.setFont(Font.font("Centuary Gothic", FontWeight.NORMAL, 25));
		directorName.setX(30);
		directorName.setFill(Color.WHITESMOKE);
		directorName.setY(325);
		root.getChildren().add(directorName );

		// actor  
		Text actor = new Text();
		actor.setText("Actors Name : ");
		actor.setFont(Font.font("Centuary Gothic", FontWeight.BOLD, 30));
		actor.setX(30);
		actor.setFill(Color.ORANGE);
		actor.setY(405);
		root.getChildren().add(actor);

		// actor Name 
		Text aName = new Text();
		String getactorName = obj.getActorName(id); 
		aName.setText(getactorName);
		aName.setFont(Font.font("Centuary Gothic", FontWeight.NORMAL, 25));
		aName.setX(30);
		aName.setFill(Color.WHITESMOKE);
		aName.setY(450);
		root.getChildren().add(aName);

		// rate  
		Text imrate = new Text();
		imrate.setText("IMDB Rating : ");
		imrate.setFont(Font.font("Centuary Gothic", FontWeight.BOLD, 30));
		imrate.setX(30);
		imrate.setFill(Color.ORANGE);
		imrate.setY(530);
		root.getChildren().add(imrate);

		// rate  
		Text imnum = new Text();
		float getimdbnum= obj.getIMDB(id); 
		imnum.setText(getimdbnum + "/10" );
		imnum.setFont(Font.font("Centuary Gothic", FontWeight.NORMAL, 25));
		imnum.setX(250);
		imnum.setFill(Color.WHITESMOKE);
		imnum.setY(530);
		root.getChildren().add(imnum);

		// add movie poster 
       InputStream pInput = new FileInputStream(obj.getPoster(id));
		Image moviePoster = new Image(pInput);
		ImageView viewPoster = new ImageView(moviePoster);
		viewPoster.setX(800);
		viewPoster.setY(65);
		viewPoster.setFitWidth(400);
		viewPoster.setPreserveRatio(true);
		root.getChildren().add(viewPoster);		        

		Button moveBack = new Button("BACK");
		moveBack.setStyle(
				"-fx-min-width: 50; " +
                "-fx-min-height: 50px; " +
                "-fx-background-color: transparent; " +
                "-fx-text-fill: white; " +
                "-fx-border-width: 2px; " +
                "-fx-border-radius: 5px; " +
                "-fx-cursor: hand;" +
				"-fx-margin:25px"
        );
        moveBack.setFont(Font.font("Centenary Gothic", FontWeight.BOLD, 30));
        moveBack.setOnAction(event -> System.out.println("Button Clicked!"));
		root.setBottom(moveBack);
		Label l = new Label("button not selected"); 
  
            // action event 
            EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
                public void handle(ActionEvent e) { 
                    l.setText("   button   selected    "); 
                } 
            };
			moveBack.setOnAction(event);

			if(name == "movies") {
				moveBack.setOnAction(e -> {
					try {
						stage.close(); 
						Movies movies = new Movies();
						movies.goToMovies(new Stage());
					} catch (Exception e1) {
						e1.getMessage();
					}
				});
			}
			else {
				moveBack.setOnAction(e -> {
					try {
						stage.close();
						Series series = new Series();
						series.goToSeries(stage);
						 
					} catch (Exception e1) {
						e1.getMessage();
					}
				});
			}
		

		// creating pane 
		Scene scene = new Scene(root,1280,645);

		stage.setTitle("Theater");
        InputStream iconInput = new FileInputStream("src\\img\\c2wLogo.png");
		Image img = new Image(iconInput);
		stage.getIcons().add(img);

		stage.setScene(scene); 
		stage.show();

	}
	
}