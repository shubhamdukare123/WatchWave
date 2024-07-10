import java.io.FileInputStream;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SecondPage {
    Movies movies = new Movies();
    Button back1;
    Button aboutUsButton;
    AboutUs about = new AboutUs();
    Series series = new Series(); 
    Matches matches = new Matches();

    public void goToSecondPage(Stage stage) throws Exception {
        try {
            stage.setTitle("WATCH ME");

            FileInputStream input = new FileInputStream("Images\\finalLogo.png");
            Image image = new Image(input);
            ImagePattern image_pattern = new ImagePattern(image);
            Rectangle rect = new Rectangle(100, 100, 420, 120);
            rect.setArcWidth(20);
            rect.setArcHeight(20);
            rect.setFill(image_pattern);

            // ... rest of your code ...
            
            //For search bar
            TextField tf = new TextField();
            tf.setPrefColumnCount(30);
            Button btn = new Button("Search", tf);
            HBox hb = new HBox(rect,tf,btn);
            hb.setSpacing(400);
            hb.setAlignment(Pos.TOP_CENTER);
            hb.setPadding(new Insets(20, 0, 0, 0));
          
            //Rectangle 1 >>> Movies
            Rectangle rect1 = new Rectangle(150,30 , 325, 50);
            // rect1.setFill(Color.rgb(253,93,168));
            rect1.setFill(Color.rgb(255,56,152));
            // Hyperlink obj = new Hyperlink("MOVIES");

            Text text1 = new Text("MOVIES");
            text1.setFont(Font.font("Times new roman", FontWeight.BOLD, 30));
            text1.setFill(Color.WHITESMOKE);
            StackPane sp1 = new StackPane(rect1,text1);
            rect1.setArcHeight(10);
            rect1.setArcWidth(10);
            rect1.setOnMouseClicked(event -> {
                // Handle the click event here
                System.out.println("Rectangle clicked!");
                try{
                    movies.goToMovies(stage);
                }catch(Exception e) {
                    e.printStackTrace();
                }
            });
            
            //Rectangle 2 >>>Series
            Rectangle rect2 = new Rectangle(150,30, 325, 50);
            rect2.setFill(Color.rgb(255,0,0));
            Text text2 = new Text("SERIES");
            text2.setFont(Font.font("Times new roman", FontWeight.BOLD, 30));
            text2.setFill(Color.WHITESMOKE);
            StackPane sp2 = new StackPane(rect2,text2);
            rect2.setArcHeight(10);
            rect2.setArcWidth(10); 
            
            //Series page redirect
            rect2.setOnMouseClicked(event -> {
                // Handle the click event here
                System.out.println("Rectangle clicked!");
                try{
                    series.goToSeries(stage);
                }catch(Exception e) {
                    e.printStackTrace();
                }
            });
            
            //Rectangle 3 >>> Matches
            Rectangle rect3 = new Rectangle(100,100 , 325, 50);
            rect3.setFill(Color.rgb(56,172,236));
            Text text3 = new Text("MATCHES");
            text3.setFont(Font.font("Times new roman", FontWeight.BOLD, 30));
            text3.setFill(Color.WHITESMOKE);
            // Label label1 = new Label(text3);
            StackPane sp3 = new StackPane(rect3,text3);
            rect3.setArcHeight(10);
            rect3.setArcWidth(10);

            //Onclick event
            rect3.setOnMouseClicked(event -> {
                // Handle the click event here
                System.out.println("Rectangle clicked!");
                try{
                    matches.goToMatches(stage);
                }catch(Exception e) {
                    e.printStackTrace();
                }
            });
            
            
           

            HBox hb1 = new HBox(sp1,sp2,sp3);
            hb1.setSpacing(100);
            hb1.setPadding(new Insets(0,50,20,50));

            //Rectangle 4 >>> Movies image
            Rectangle rect4 = new Rectangle(150,30 , 325, 300);
            FileInputStream input1 = new FileInputStream("Images/movies block img.PNG");  
		    // create a image 
		    Image image1 = new Image(input1); 
		    // create ImagePattern 
	        ImagePattern image_pattern1 = new ImagePattern(image1); 
		    rect4.setFill(image_pattern1);
            rect4.setArcHeight(20);
            rect4.setArcWidth(20);

            
           
            //Rectangle 5 >>>Series image
            Rectangle rect5 = new Rectangle(150,30, 325, 300);
            FileInputStream input2 = new FileInputStream("Images\\series block imh.PNG");  
		    // create a image 
		    Image image2 = new Image(input2); 
		    // create ImagePattern 
	        ImagePattern image_pattern2 = new ImagePattern(image2); 
		    rect5.setFill(image_pattern2);
            rect5.setArcHeight(20);
            rect5.setArcWidth(20);
            
            //Rectangle 6 >>> Match image
            Rectangle rect6 = new Rectangle(100,100 , 325, 300);
            FileInputStream input3 = new FileInputStream("Images\\mathces block iomg.PNG");  
		    // create a image 
		    Image image3 = new Image(input3); 
		    // create ImagePattern 
	        ImagePattern image_pattern3 = new ImagePattern(image3); 
		    rect6.setFill(image_pattern3);
            rect6.setArcHeight(20);
            rect6.setArcWidth(20);
            
            HBox hb2Box = new HBox(rect4,rect5,rect6);
            hb2Box.setSpacing(100);
            hb2Box.setPadding(new Insets(0,50,20,50));
        
            VBox vb = new VBox(hb1,hb2Box);
            vb.setAlignment(Pos.BOTTOM_CENTER);
            
            HBox footer = new HBox();
            footer.setMinHeight(20);
            back1 = new Button("BACK");
            back1.setMaxWidth(80);
            back1.setMinHeight(25);
            back1.setMaxHeight(20);
            back1.setMinWidth(50);

            footer.setStyle("-fx-alignment: bottom-center;"); 
            
            // Position the About Us button to the bottom right
            footer.getChildren().addAll(back1);
            Insets footerpadding = new Insets(10, 20, 10, 20); 
            
            // Example padding values
            footer.setPadding(footerpadding);
            
            VBox vb1 = new VBox(hb,vb);
            vb1.setAlignment(Pos.TOP_CENTER);
            vb1.setSpacing(90);

            //Final VBox
            VBox vb2 = new VBox(vb1,footer);
            vb2.setSpacing(0);

            //For Background Image
            FileInputStream ip = new FileInputStream("Images\\common page.PNG");
            Image img = new Image(ip);
            ImageView iw = new ImageView(img);
            iw.setPreserveRatio(true);
            iw.setCache(true);
            iw.setSmooth(true);
            BackgroundImage bg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, 
            new BackgroundSize(100,100,true,true,true,true));
            Background background = new Background(bg);
            vb2.setBackground(background);   
            
            //Button
            back1.setOnAction(e -> {
                try {
                    App app = new App();
                    app.start(new Stage()); // Open a new mainAPP2 stage
                    stage.close(); // Close the current stage
                } catch (Exception e1) {
                    e1.getMessage();
                }
            });
            

            Scene sc = new Scene(vb2, 1280, 645);
            stage.setScene(sc);
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}